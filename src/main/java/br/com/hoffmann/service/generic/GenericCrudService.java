package br.com.hoffmann.service.generic;

import br.com.hoffmann.entity.baseEntity.BaseEntity;

public interface GenericCrudService <T extends BaseEntity>{


    T save (T entity);

    void deleteById(Long id);

    T findById(Long id);

}
