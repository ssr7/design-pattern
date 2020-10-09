package io.sr7.tutorial.structural.strategy;

public class SecureString {
    private String raw;

    public SecureString(String raw) {
        this.raw = raw;
    }

    public String doHash(HashStrategy hashStrategy){
        return  hashStrategy.doHash(raw);
    }

}
