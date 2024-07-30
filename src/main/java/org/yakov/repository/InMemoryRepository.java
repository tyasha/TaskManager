package org.yakov.repository;

public interface InMemoryRepository<T> {
    T findByID(String id);
    T save(T value);
    void update(T value);
    void deleteById(String id);
}
