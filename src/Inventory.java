import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Brand> brands;

    List<Product> mobilePhones = new ArrayList<>();
    List<Product> notebooks = new ArrayList<>();

    Inventory(){
        this.brands = new ArrayList<>();
    }

    public void addBrand(Brand brand){
        this.brands.add(brand);
    }

    public void printBrands() {
        for(Brand brand : brands){
            System.out.println(brand.getId()+" - "+brand.getName());
        }

    }

    public void createMobilePhoneList(){
        for(Brand brand : brands){
            for(Product product : brand.getProducts()){
                if(product instanceof MobilePhone){
                    mobilePhones.add(product);
                }
            }
        }
    }
    public void addMobilePhone(){
        for(Brand brand : brands){
            for(Product product : brand.getProducts()){
                System.out.println(product.name);
                if(product instanceof MobilePhone){
                    if(!mobilePhones.contains(product)){
                        mobilePhones.add(product);
                    }
                }
            }
        }
    }

    public void displayMobilePhones(){
        System.out.format("%-3s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s",
                "ID", "Product Name", "Brand", "Price", "Screen", "Storage", "Ram", "Battery", "Color");
        System.out.println();
        for(int i=0; i<96; i++){
            System.out.print("-");
        }
        System.out.println();
        for(Product product : mobilePhones){
            product.displayDetails();
            System.out.println();
        }
    }
    public void createNotebookList(){
        for(Brand brand : brands){
            for(Product product : brand.getProducts()){
                if(product instanceof Notebook){
                    notebooks.add(product);
                }
            }
        }
    }
    public void addNotebook(){
        for(Brand brand : brands){
            for(Product product : brand.getProducts()){
                if(product instanceof Notebook){
                    if(!notebooks.contains(product)){
                        notebooks.add(product);
                    }
                }
            }
        }
    }
    public void displayNotebooks(){
        System.out.format("%-3s %-20s %-10s %-10s %-10s %-10s %-10s",
                "ID", "Product Name", "Brand", "Price", "Screen", "Storage", "Ram");
        System.out.println();
        for(int i=0; i<72; i++){
            System.out.print("-");
        }
        System.out.println();
        for(Product product : notebooks){
            product.displayDetails();
            System.out.println();
        }
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public List<Product> getMobilePhones() {
        return mobilePhones;
    }

    public List<Product> getNotebooks() {
        return notebooks;
    }
}
