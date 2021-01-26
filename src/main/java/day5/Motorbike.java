package day5;

public class Motorbike {

    private String model;
    private int YearOfRelease;
    private String color;

    public Motorbike(String model, int yearOfRelease, String color) {
        this.YearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;

    }


    public int getYearOfRelease() {
        return YearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}
