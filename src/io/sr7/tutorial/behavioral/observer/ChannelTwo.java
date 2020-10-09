package io.sr7.tutorial.behavioral.observer;

public class ChannelTwo implements Channel {
    @Override
    public void update(String news) {
        System.out.println("Channel 2 receives a news: "+ news );
    }
}
