package _12_collection_framework_java.exercise;

public class ProductManager {
    private String name;
    private String nameProduct;
    private int price;
    private int id;

    ProductManager() {
   }

    public ProductManager(String name, String nameProduct, int price, int id) {
        this.name = name;
        this.nameProduct = nameProduct;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "name='" + name + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
