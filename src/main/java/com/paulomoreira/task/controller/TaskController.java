package com.paulomoreira.task.controller;

import com.paulomoreira.task.domain.CreateTaskRequest;
import com.paulomoreira.task.domain.dto.CreateTaskRequestDTO;
import com.paulomoreira.task.domain.dto.TaskDTO;
import com.paulomoreira.task.domain.entity.Task;
import com.paulomoreira.task.mapper.TaskMapper;
import com.paulomoreira.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @PostMapping
    public ResponseEntity<TaskDTO> createTask(
            @Valid @RequestBody CreateTaskRequestDTO createTaskRequestDTO
    ) {
        CreateTaskRequest createTaskRequest = taskMapper.fromDto(createTaskRequestDTO);
        Task task = taskService.createTask(createTaskRequest);
        TaskDTO createdTaskDTO = taskMapper.toDTO(task);
        return new ResponseEntity<>(createdTaskDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TaskDTO>> listTasks() {
        List<Task> tasks = taskService.listTasks();
        List<TaskDTO> tasksDTOs = tasks.stream().map(taskMapper::toDTO).toList();
        return ResponseEntity.ok(tasksDTOs);
    }

}
