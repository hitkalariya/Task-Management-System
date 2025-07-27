package com.taskmanagerspringbootapi.apiapp.repository;


import com.taskmanagerspringbootapi.apiapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {}
