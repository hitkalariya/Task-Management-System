package com.taskmanagerspringbootapi.apiapp.service;


import com.taskmanagerspringbootapi.apiapp.entity.Task;
import com.taskmanagerspringbootapi.apiapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task addTask(Task task) {
        return repository.save(task);
    }
}
