package Lesson20TryCatch.Task;

public class Car implements AutoCloseable{
    private String color;
    private short manufactureYear;
    private String price;

    public Car (String color, short manufactureYear, String price) {
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }
    public Car () {

    }

    public String getColor(){
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }

    public short getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(short manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public void drive () {
        System.out.println("Car is going on...");
    }
    @Override
    public void close (){
        System.out.println("Class Car is going to be off.");
    }
}
