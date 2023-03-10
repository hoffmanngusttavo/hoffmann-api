package br.com.hoffmann.controller.generic.impl;

import br.com.hoffmann.controller.generic.GenericCrudController;
import br.com.hoffmann.entity.baseEntity.BaseEntity;
import br.com.hoffmann.service.generic.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
public class GenericCrudControllerImpl<T extends BaseEntity> implements GenericCrudController<T> {

    @Autowired
    protected GenericCrudService service;


    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
