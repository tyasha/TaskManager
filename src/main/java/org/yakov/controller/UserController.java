package org.yakov.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yakov.model.CommonUser;
import org.yakov.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    @Tag(name="getUser", description="получение User по ID")
    public ResponseEntity<String> getUser(@PathVariable("id") String id) {
        return ResponseEntity.ok("GET");
    }

    @PostMapping
    @Tag(name="createUser", description="создание User")
    public ResponseEntity<String> createCommonUser(@RequestBody CommonUser user) {
        return ResponseEntity.ok("POST");
    }

    @PutMapping("/{id}")
    @Tag(name="updateUser", description="обновление User по ID")
    public ResponseEntity<String> updateUser(@PathVariable("id") String id, @RequestBody User user) {
        return ResponseEntity.ok("PUT");
    }

    @DeleteMapping("/{id}")
    @Tag(name="deleteUser", description="удаление User по ID")
    public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {
        return ResponseEntity.ok("DELETE");
    }
}
