package com.paulomoreira.task.service;

import com.paulomoreira.task.domain.CreateTaskRecord;
import com.paulomoreira.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRecord request);
}
