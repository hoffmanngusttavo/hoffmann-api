package br.com.hoffmann.service.impl;

import br.com.hoffmann.entity.Usuario;
import br.com.hoffmann.service.UsuarioService;
import br.com.hoffmann.service.generic.impl.GenericCrudServiceImpl;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class UsuarioServiceImpl extends GenericCrudServiceImpl<Usuario> implements UsuarioService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    @Transactional
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    @Transactional
    public Usuario save(Usuario entity) {

        var msg = new Message(("Criei uma mensagem nova "+ entity.getLogin()).getBytes());
        rabbitTemplate.send("pagamento.concluido", msg);

        return super.save(entity);
    }
}
