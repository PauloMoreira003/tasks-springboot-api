package com.paulomoreira.task.mapper.impl;

import com.paulomoreira.task.domain.CreateTaskRequest;
import com.paulomoreira.task.domain.dto.CreateTaskRequestDTO;
import com.paulomoreira.task.domain.dto.TaskDTO;
import com.paulomoreira.task.domain.entity.Task;
import com.paulomoreira.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDTO dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDTO toDTO(Task task) {
        return new TaskDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
