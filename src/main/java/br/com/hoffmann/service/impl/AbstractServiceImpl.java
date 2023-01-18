package br.com.hoffmann.service.impl;


import br.com.hoffmann.service.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
public abstract class AbstractServiceImpl<T> implements AbstractService<T>, Serializable {


    @Transactional
    @Override
    public void create(T entity) {

    }

    @Transactional
    @Override
    public void update(T entity) {

    }

    @Transactional
    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<T> findById(Long id) {
        return Optional.empty();
    }
}
