package day6;


public class Car {

    private String model;
    private int YearOfRelease;
    private String color;


    public void setYearOfRelease(int yearOfRelease) {
        this.YearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return YearOfRelease;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if (this.YearOfRelease > inputYear)
            return this.YearOfRelease - inputYear;
        else
            return inputYear - this.YearOfRelease;


    }
}