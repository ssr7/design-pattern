package io.sr7.tutorial.structural.flyweight;

/**
 * Like entity in database
 * The ClassRooms entity is usual constant.
 */
public class ClassRoomEntity {
  private Integer id;
  private String name;
  private Integer floor;

    public ClassRoomEntity(Integer id, String name, Integer floor) {
        this.id = id;
        this.name = name;
        this.floor = floor;
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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
