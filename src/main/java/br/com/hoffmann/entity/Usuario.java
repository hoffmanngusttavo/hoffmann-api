package br.com.hoffmann.entity;


import br.com.hoffmann.entity.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Builder
@Entity
@Table(name = "USUARIO")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String senha;





}
