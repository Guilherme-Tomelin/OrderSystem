package entities;

public class OrderItem {
    private Integer quantity;
    private Double priece;

    private Product product;


    public OrderItem() {
    }


    public OrderItem(Integer quantity, Double priece, Product product) {
        this.quantity = quantity;
        this.priece = priece;
        this.product = product;
    }


    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriece() {
        return this.priece;
    }

    public void setPriece(Double priece) {
        this.priece = priece;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //return priece * quantity
    public Double subTotal(){
        return priece * quantity;
    }

}
