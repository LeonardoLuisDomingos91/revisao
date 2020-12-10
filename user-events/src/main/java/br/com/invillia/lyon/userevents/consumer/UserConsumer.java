package br.com.invillia.lyon.userevents.consumer;

import br.com.invillia.lyon.userapi.events.User;
import br.com.invillia.lyon.userevents.channel.UserChannel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class UserConsumer {

    @StreamListener(UserChannel.INPUT)
    public void sendUser(User userEvents){

        System.out.println("ID consumido : " + userEvents.getId());
    }
}
