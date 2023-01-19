package br.com.hoffmann.controller.generic;

import br.com.hoffmann.entity.baseEntity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface GenericCrudController<T extends BaseEntity>{

    ResponseEntity<String> deleteById(@PathVariable Long id);

}
