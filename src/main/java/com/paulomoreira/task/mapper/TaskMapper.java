package com.paulomoreira.task.mapper;

import com.paulomoreira.task.domain.CreateTaskRequest;
import com.paulomoreira.task.domain.UpdateTaskRequest;
import com.paulomoreira.task.domain.dto.CreateTaskRequestDTO;
import com.paulomoreira.task.domain.dto.TaskDTO;
import com.paulomoreira.task.domain.dto.UpdateTaskRequestDTO;
import com.paulomoreira.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDTO dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDTO dto);

    TaskDTO toDTO(Task task);
}
