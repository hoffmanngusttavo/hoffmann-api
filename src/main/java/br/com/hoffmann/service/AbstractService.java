package br.com.hoffmann.service;

import java.util.Optional;

public interface AbstractService<T> {

    void create(T entity);

    void update(T entity);

    void deleteById(Long id);

    Optional<T> findById(Long id);

}
