package io.sr7.tutorial.structural.strategy;

public class Sha512Hash implements HashStrategy {
    @Override
    public String doHash(String raw) {
        return "This Sha512: "+raw;
    }
}
