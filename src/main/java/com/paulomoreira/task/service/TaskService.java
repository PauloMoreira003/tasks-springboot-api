package com.paulomoreira.task.service;

import com.paulomoreira.task.domain.CreateTaskRequest;
import com.paulomoreira.task.domain.UpdateTaskRequest;
import com.paulomoreira.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
