package org.yakov.repository;

import org.springframework.stereotype.Repository;
import org.yakov.model.User;

import java.util.HashMap;
import java.util.Map;
@Repository
public class UserRepository implements InMemoryRepository<User>{

    private Map<String, User> userMap = new HashMap<>();

    @Override
    public User findByID(String id) {
        return this.userMap.get(id);
    }

    @Override
    public User save(User value) {
        return this.userMap.put(value.getId(),value);
    }

    @Override
    public void update(User value) {
        this.userMap.put(value.getId(),value);
    }

    @Override
    public void deleteById(String id) {
       this.userMap.remove(id);
    }
}
