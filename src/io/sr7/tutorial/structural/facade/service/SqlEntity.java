package io.sr7.tutorial.structural.facade.service;

public class SqlEntity extends BaseEntity {
    private String id;
    private String name;
    private String family;

    public SqlEntity(String id, String name, String family) {
        this.id = id;
        this.name = name;
        this.family = family;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
