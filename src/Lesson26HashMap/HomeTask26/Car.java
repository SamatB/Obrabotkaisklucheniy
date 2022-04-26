package Lesson26HashMap.HomeTask26;

public class Car {
    private int id;
    private int autonum;

    public Car(int id, int autonum) {
        this.id = id;
        this.autonum = autonum;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutonum() {
        return autonum;
    }

    public void setAutonum(int autonum) {
        this.autonum = autonum;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id= " + id +
                ", auto number = " + autonum;
    }
}
