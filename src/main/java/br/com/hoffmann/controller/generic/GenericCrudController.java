package br.com.hoffmann.controller.generic;

import br.com.hoffmann.entity.baseEntity.BaseEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;

public interface GenericCrudController<T extends BaseEntity>{

    @ApiOperation(value = "Remover pelo id")
    void deleteById(@PathVariable Long id);

}
