package br.com.hoffmann.entity;


import br.com.hoffmann.entity.baseEntity.BaseEntity;
import br.com.hoffmann.entity.baseEntity.DadosAuditoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Builder
@Entity
@Table(name = "USUARIO")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Version
    private Long version;

    @Embedded
    private DadosAuditoria dadosAuditoria;




    @PrePersist
    public void prePersist(){
       dadosAuditoria.prePersist();
    }

    @PreUpdate
    public void preUpdate(){
        dadosAuditoria.preUpdate();
    }


}
