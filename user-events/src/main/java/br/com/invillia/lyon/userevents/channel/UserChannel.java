package br.com.invillia.lyon.userevents.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserChannel {

    String INPUT = "user-input";

    @Input(INPUT)
    SubscribableChannel inputBoundUsers();
}
