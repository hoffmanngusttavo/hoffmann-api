CREATE TABLE USUARIO (
                         id BIGSERIAL ,
                         login varchar(255) NOT NULL,
                         senha varchar(15) NOT NULL,

                         version bigint  DEFAULT NULL,
                         created_by varchar(255) NOT NULL,
                         updated_by varchar(255) NOT NULL,
                         created_at timestamp NOT NULL,
                         updated_at timestamp NOT NULL,

                         CONSTRAINT uk_login_usuario unique (login),
                         PRIMARY KEY(id)

);

