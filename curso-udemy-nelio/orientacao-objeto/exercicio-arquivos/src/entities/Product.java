package entities;

public class Product {

    private String name;
    private Double price;
    private Integer qnt;

    public Product(){

    }

    public Product(Integer qnt, Double price, String name) {
        this.qnt = qnt;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQnt() {
        return qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    public double totalValue(){
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f", name, totalValue());
    }
}
