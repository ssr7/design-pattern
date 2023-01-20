package io.sr7.tutorial.behavioral.chainofresponsibility;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Message {
    private String msg;
    private Map<Destination,String> destinationMap;

    public Message(String msg, Map<Destination, String> destinationMap) {
        this.msg = msg;
        this.destinationMap = destinationMap;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Map<Destination, String> getDestinationMap() {
        return destinationMap;
    }

    public enum Destination {
        FAX,SMS,EMAIL
    }
    public static   MessageBuilder getMessageBuilder(){
        return new MessageBuilder();
    }
    public static class MessageBuilder{
        private String msg;
        private Map<Destination, String> destinationMap = new HashMap<>();


        public String getMsg() {
            return msg;
        }

        public MessageBuilder setMsg(String msg) {
            this.msg = msg;
            return this;
        }

        public Map<Destination, String> getDestinationMap() {
            return destinationMap;
        }

        public MessageBuilder addDestination(Destination destination, String  value) {
            this.destinationMap.put(destination,value);
            return  this;
        }
        public Message build(){
            return  new Message(msg,destinationMap);
        }
    }

}
