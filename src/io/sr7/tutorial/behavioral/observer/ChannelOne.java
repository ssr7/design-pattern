package io.sr7.tutorial.behavioral.observer;

public class ChannelOne implements Channel {
    @Override
    public void update(String news) {
        System.out.println("Channel 1 receives a news: "+ news );
    }
}
