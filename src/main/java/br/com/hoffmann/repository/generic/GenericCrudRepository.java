package br.com.hoffmann.repository.generic;

import br.com.hoffmann.entity.baseEntity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericCrudRepository <T extends BaseEntity>
        extends JpaRepository<T, Long> {

}
