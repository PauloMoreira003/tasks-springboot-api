package com.paulomoreira.task.domain;

import com.paulomoreira.task.domain.entity.TaskPriority;
import com.paulomoreira.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
