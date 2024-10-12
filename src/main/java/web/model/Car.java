package web.model;

public class Car {
    private final int id;
    private int year;
    private String model;
    private String color;

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", colour='" + color + '\'' +
                '}';
    }
}
