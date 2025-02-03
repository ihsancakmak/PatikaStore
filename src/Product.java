public abstract class Product {
    int productId;
    String name;
    double price;
    double screenSize;
    int storage;
    int ram;
    Brand brand;

    public Product(int productId, String name, Brand brand, double price, double screenSize, int storage, int ram) {
        this.productId = productId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.storage = storage;
        this.ram = ram;
    }
    public abstract void displayDetails();

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
