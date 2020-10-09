package io.sr7.tutorial.creational.Prototype;

public class Person implements Cloneable {
    private String name;
    private String family;
    private long age;
    private String address;
    private Car car;

    public Person(String name, String family, long age, String address,Car car) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.address = address;
        this.car=car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public Person clone()  {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return  null;
        }
    }

    public static PersonBuilder getBuilder() {
        return new PersonBuilder();
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

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class PersonBuilder{
        private String name;
        private String family;
        private long age;
        private String address;
        private Car car;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder family(String family) {
            this.family = family;
            return this;
        }

        public PersonBuilder age(long age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder car(Car car) {
            this.car = car;
            return this;
        }

        public Person build(){
            return  new Person(name,family,age,address,car);
        }
    }
}
