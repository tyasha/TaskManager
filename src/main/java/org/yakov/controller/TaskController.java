package org.yakov.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yakov.model.Task;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @GetMapping("/{id}")
    @Tag(name="getTask", description="get Task by ID")
    public ResponseEntity<String> getTask(@PathVariable("id") String id) {
        return ResponseEntity.ok("GET");
    }

    @PostMapping
    @Tag(name="createTask", description="create Task")
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        return ResponseEntity.ok("POST");
    }

    @PutMapping("/{id}")
    @Tag(name="updateTask", description="update")
    public ResponseEntity<String> updateTask(@RequestBody Task task) {
        return ResponseEntity.ok("PUT");
    }

    @DeleteMapping("/{id}")
    @Tag(name="deleteTask", description="delete Task by ID")
    public ResponseEntity<String> deleteTask(@PathVariable("id") String id) {
        return ResponseEntity.ok("DELETE");
    }
}