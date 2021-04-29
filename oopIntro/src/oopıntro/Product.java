package oopıntro;

public class Product {

    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    public Product() {
    }

    public Product(int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterDiscount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public double getDiscount() {
        return discount;
    }

    public double getUnitPriceAfterDiscount() {
        return unitPriceAfterDiscount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    

    

}
