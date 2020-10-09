package io.sr7.tutorial.structural.strategy;

public class Md5Hash implements HashStrategy {
    @Override
    public String doHash(String raw) {
        //use apache common lib for hashing: DigestUtils.md5(raw);
        return "This md5: "+raw;
    }
}
