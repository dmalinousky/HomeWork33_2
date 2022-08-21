public class TV {
    private String brand;
    private String model;
    private int yearOfProduction;
    private double price;
    private double diagonal;

    public TV(String brand, String model, int yearOfProduction, double price, double diagonal) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", diagonal=" + diagonal +
                '}';
    }
}
