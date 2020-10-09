package io.sr7.tutorial.structural.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        SecureString secureString=new SecureString("test");
        System.out.println(secureString.doHash(new Md5Hash()));
        System.out.println(secureString.doHash(new Sha512Hash()));

    }
}
