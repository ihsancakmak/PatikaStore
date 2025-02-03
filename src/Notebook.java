public class Notebook extends Product {

    Notebook(int id, String name, Brand brand, double price, double screenSize, int storage, int ram){
        super(id, name, brand, price, screenSize, storage, ram);
    }

    @Override
    public void displayDetails() {
        System.out.format("%-3s %-20s %-10s %-10s %-10s %-10s %-10s",
                getProductId(), getName(), getBrand().getName(), getPrice(), getScreenSize(),
                getStorage(), getRam());
    }


}
