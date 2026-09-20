package com.paulomoreira.task.domain;

import com.paulomoreira.task.domain.entity.TaskPriority;

import java.time.LocalDate;

public record CreateTaskRecord(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority
) {

}
