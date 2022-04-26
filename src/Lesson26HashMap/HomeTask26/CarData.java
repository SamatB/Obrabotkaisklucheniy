package Lesson26HashMap.HomeTask26;

public class CarData {
    private int manufactureYear;
    private String  model;
    private String price;
    private String color;

    public CarData(int manufactureYear, String model, String price, String color) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public CarData() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car info: " +
                " manufacture year = " + manufactureYear +
                ", model = " + model +
                ", price = " + price +
                ", color = " + color;
    }
}
