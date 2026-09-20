package com.paulomoreira.task.service;

import com.paulomoreira.task.domain.CreateTaskRequest;
import com.paulomoreira.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
}
