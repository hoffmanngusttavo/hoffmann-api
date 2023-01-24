package br.com.hoffmann.service.generic.impl;

import br.com.hoffmann.entity.baseEntity.BaseEntity;
import br.com.hoffmann.repository.generic.GenericCrudRepository;
import br.com.hoffmann.service.exception.EntityNotFoundException;
import br.com.hoffmann.service.exception.ServiceException;
import br.com.hoffmann.service.generic.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class GenericCrudServiceImpl <T extends BaseEntity> implements GenericCrudService<T> {


   @Autowired
   protected GenericCrudRepository<T> repository;

    @Override
    @Transactional
    public T save(T entity) {
        try {
           return repository.save(entity);
        }catch (Exception ex){
            throw new ServiceException(ex);
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        try {
            if(!repository.existsById(id)){
                throw new EntityNotFoundException("Id not found "+id);
            }
            repository.deleteById(id);
        }catch (EntityNotFoundException ex){
            throw new EntityNotFoundException(ex);
        }catch (Exception ex){
            throw new ServiceException("Não foi possível remover objeto com id "+id, ex);
        }

    }

    @Override
    public T findById(Long id) {
        try {
           return repository.findById(id)
                   .orElseThrow(() -> new EntityNotFoundException("Id not found "+ id));
        }catch (Exception ex){
            throw new ServiceException(ex);
        }
    }
}
