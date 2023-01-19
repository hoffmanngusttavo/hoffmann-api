package br.com.hoffmann.service.generic;

import br.com.hoffmann.entity.baseEntity.BaseEntity;

import java.util.Optional;

public interface GenericCrudService <T extends BaseEntity>{


    T save (T entity);

    void deleteById(Long id);

    Optional<T> findById(Long id);

}
