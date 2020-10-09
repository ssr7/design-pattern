package io.sr7.tutorial.structural.flyweight;

import java.util.Objects;

/**
 * Like entity in database
 */
public class DepartmentEntity {
    private Integer id;
    private String name;
    private String address;

    public DepartmentEntity(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public DepartmentEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

}
