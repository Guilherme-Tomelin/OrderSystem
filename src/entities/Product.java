package entities;

public class Product {
    private String name;
    private Double priece;


    public Product() {
    }

    public Product(String name, Double priece) {
        this.name = name;
        this.priece = priece;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriece() {
        return this.priece;
    }

    public void setPriece(Double priece) {
        this.priece = priece;
    }

}
