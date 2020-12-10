package br.com.invillia.lyon.userapi.producer;

import br.com.invillia.lyon.userapi.channel.UserChannel;
import br.com.invillia.lyon.userapi.events.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class UserProducer {

    @Autowired
    private UserChannel userChannel;

    public void sendUser(String id) {

        User user = User.newBuilder()
                .setId(id)
                .build();

        System.out.println("chegou");

//        final Message<User> message = MessageBuilder.withPayload(user).build();
//        userChannel.outboundUsers().send(message);

        MessageChannel messageChannel = userChannel.outboundUsers();
        messageChannel.send(MessageBuilder
                .withPayload(user)
                .build());

        System.out.println("enviado com sucesso: " + id);
    }
}
