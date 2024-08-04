package org.yakov.repository;

import org.springframework.stereotype.Repository;
import org.yakov.model.Task;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TaskRepository implements InMemoryRepository<Task>{
    private Map<String, Task> taskMap = new HashMap<>();
    @Override
    public Task findByID(String id) {
        return this.taskMap.get(id);
    }

    @Override
    public Task save(Task value) {
        return this.taskMap.put(value.getId(),value);
    }

    @Override
    public void update(Task value) {
        this.taskMap.put(value.getId(),value);
    }

    @Override
    public void deleteById(String id) {
        this.taskMap.remove(id);
    }
}
