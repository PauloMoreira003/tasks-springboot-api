package com.paulomoreira.task.mapper;

import com.paulomoreira.task.domain.CreateTaskRequest;
import com.paulomoreira.task.domain.dto.CreateTaskRequestDTO;
import com.paulomoreira.task.domain.dto.TaskDTO;
import com.paulomoreira.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDTO dto);

    TaskDTO toDTO(Task task);
}
