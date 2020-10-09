package io.sr7.tutorial.creational.builder;

public class Person {
    private String name;
    private String family;
    private String address;
    private int age;

    public Person() {
    }

    public Person(String name, String family, String address, int age) {
        this.name = name;
        this.family = family;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static  class  PersonBuilder{
        private String name;
        private String family;
        private String address;
        private int age;

        public PersonBuilder name(String name) {
            this.name = name;
            return  this;
        }

        public PersonBuilder family(String family) {
            this.family = family;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public Person build(){
            Person person=new Person(name,family,address,age);
            return person;
        }
    }
}
