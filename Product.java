
package Entities;
public class Product {
    private int productId;
    private String name;
    private int stock;
    private String category;
    private double whole_sale_P;
    private double retail_P;

    public Product() {
    }

    public Product(int productId, String name, String category, int stock, int whole_sale_P, int retail_P) {
        this.productId = productId;
        this.name = name;
        this.stock = stock;
        this.category = category;
        this.whole_sale_P = whole_sale_P;
        this.retail_P = retail_P;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWhole_sale_P() {
        return whole_sale_P;
    }

    public void setWhole_sale_P(double whole_sale_P) {
        this.whole_sale_P = whole_sale_P;
    }

    public double getRetail_P() {
        return retail_P;
    }

    public void setRetail_P(double retail_P) {
        this.retail_P = retail_P;
    }
    
}
