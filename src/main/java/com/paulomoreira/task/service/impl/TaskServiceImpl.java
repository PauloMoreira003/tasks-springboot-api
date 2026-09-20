package com.paulomoreira.task.service.impl;

import com.paulomoreira.task.domain.CreateTaskRecord;
import com.paulomoreira.task.domain.entity.Task;
import com.paulomoreira.task.domain.entity.TaskStatus;
import com.paulomoreira.task.repository.TaskRepository;
import com.paulomoreira.task.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRecord request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now
        );

        return taskRepository.save(task);
    }
}
