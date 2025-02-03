public class MobilePhone extends Product {
    int batteryPower;
    String color;

    MobilePhone(int id, String name, Brand brand, double price, double screenSize, int storage, int ram, int batteryPower, String color){
        super(id, name, brand, price, screenSize, storage, ram);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    @Override
    public void displayDetails() {
        System.out.format("%-3s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s",
                getProductId(), getName(), getBrand().getName(), getPrice(), getScreenSize(),
                getStorage(), getRam(), getBatteryPower(), getColor());
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getColor() {
        return color;
    }
}
