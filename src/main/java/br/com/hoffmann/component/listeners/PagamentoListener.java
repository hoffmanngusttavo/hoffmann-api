package br.com.hoffmann.component.listeners;

import br.com.hoffmann.config.amqp.ConstantesRabbitMQ;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {

    @RabbitListener(queues = ConstantesRabbitMQ.Pagamento.CONCLUIDO_QUEUE)
    public void recebeMensagem(Message message){
        System.out.println(message.toString());
    }


}
