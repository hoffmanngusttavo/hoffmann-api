package br.com.hoffmann.config.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExemploQueueConfiguration {

    @Bean
    public Queue criarFila(){
        return QueueBuilder.nonDurable(ConstantesRabbitMQ.Pagamento.CONCLUIDO_QUEUE)
                .build();
    }


}
