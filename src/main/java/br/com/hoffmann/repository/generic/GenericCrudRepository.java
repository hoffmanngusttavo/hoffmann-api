package br.com.hoffmann.repository.generic;

import br.com.hoffmann.entity.baseEntity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericCrudRepository <T extends BaseEntity> extends JpaRepository<T, Long> {

}
