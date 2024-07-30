package org.yakov.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.yakov.model.User;
@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{id}")
    @Tag(name="getUser", description="get User by ID")
    public ResponseEntity<String> getUser(@PathVariable("id") String id) {
        return ResponseEntity.ok("GET");
    }

    @PostMapping
    @Tag(name="createUser", description="create User")
    public ResponseEntity<String> createCommonUser(@RequestBody User user) {
        return ResponseEntity.ok("POST");
    }

    @PutMapping("/{id}")
    @Tag(name="updateUser", description="update User")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        return ResponseEntity.ok("PUT");
    }

    @DeleteMapping("/{id}")
    @Tag(name="deleteUser", description="delete User")
    public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {
        return ResponseEntity.ok("DELETE");
    }
}
