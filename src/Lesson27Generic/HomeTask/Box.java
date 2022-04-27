package Lesson27Generic.HomeTask;

public class Box <T>{
    private T height;
    private T width;
    private T depth;

    public Box(T height, T width, T depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box() {
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public void setDepth(T depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box: " +
                "height = " + height + " cm" +
                ", width = " + width + " cm" +
                ", depth = " + depth + " cm";
    }
    public static <T> Box<T> generic(Box box){
        return box;
    }
}
