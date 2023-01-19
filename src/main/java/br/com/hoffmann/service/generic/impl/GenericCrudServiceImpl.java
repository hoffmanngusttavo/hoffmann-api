package br.com.hoffmann.service.generic.impl;

import br.com.hoffmann.entity.baseEntity.BaseEntity;
import br.com.hoffmann.exception.ServiceException;
import br.com.hoffmann.repository.generic.GenericCrudRepository;
import br.com.hoffmann.service.generic.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class GenericCrudServiceImpl <T extends BaseEntity> implements GenericCrudService<T> {


   @Autowired
   protected GenericCrudRepository<T> repository;

    @Override
    public T save(T entity) {
        try {
           return repository.save(entity);
        }catch (Exception ex){
            throw new ServiceException(ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            repository.deleteById(id);
        }catch (Exception ex){
            throw new ServiceException(ex);
        }
    }

    @Override
    public Optional<T> findById(Long id) {
        try {
           return repository.findById(id);
        }catch (Exception ex){
            throw new ServiceException(ex);
        }
    }
}
