import javax.print.attribute.standard.PrinterURI;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Inventory inventory = new Inventory();

        Brand samsung = new Brand("Samsung");
        Brand lenovo = new Brand("Lenovo");
        Brand apple = new Brand("Apple");
        Brand huawei = new Brand("Huawei");
        Brand casper = new Brand("Casper");
        Brand asus = new Brand("Asus");
        Brand hp = new Brand("HP");
        Brand xiaomi = new Brand("Xiaomi");
        Brand monster = new Brand("Monster");

        inventory.addBrand(samsung);
        inventory.addBrand(lenovo);
        inventory.addBrand(apple);
        inventory.addBrand(huawei);
        inventory.addBrand(casper);
        inventory.addBrand(asus);
        inventory.addBrand(hp);
        inventory.addBrand(xiaomi);
        inventory.addBrand(monster);

        int brandId = 1;
        for(Brand brand : inventory.brands){
            brand.setId(brandId);
            brandId++;
        }

        samsung.addProduct(new MobilePhone(1, "Galaxy A51", samsung, 3199, 6.5, 128, 6, 4000, "Black"));
        apple.addProduct(new MobilePhone(2, "iPhone 11", apple, 7379, 6.1, 64, 6, 3500, "Blue"));
        xiaomi.addProduct(new MobilePhone(3, "Redmi Note 10 Pro", xiaomi, 4099, 6.5, 128, 12, 4000, "White"));

        huawei.addProduct(new Notebook(1, "Matebook 14", huawei, 7000, 14.0, 512, 16));
        lenovo.addProduct(new Notebook(2, "V14 IGL", lenovo, 6499, 14.0, 1024, 8));
        asus.addProduct(new Notebook(3, "TUF Gaming", asus, 8199, 15.6, 2048, 32));
        apple.addProduct(new Notebook(4, "MacBook Pro", apple, 8999, 16.0, 512, 32));
        inventory.createNotebookList();
        inventory.createMobilePhoneList();

        printMenu();
        int input1 = in.nextInt();
        while (input1 <= 3){
            switch(input1){
                case 1 -> {
                    inventory.displayNotebooks();
                    System.out.println();
                    System.out.println("1 - Add a Notebook");
                    System.out.println("2 - Delete a Notebook");
                    System.out.println("0 - Exit");

                    int input2 = in.nextInt();
                    switch (input2){
                        case 1 -> {
                            System.out.println("Please enter notebook specs.");
                            int id = inventory.getNotebooks().size()+1;

                            System.out.print("Enter a product name: ");
                            String name = in.next();


                            System.out.print("Enter a price: ");
                            double price = in.nextDouble();


                            System.out.print("Enter a screen size(ex: 15.6): ");
                            double screenSize = in.nextDouble();


                            System.out.print("Enter a storage(ex: 128-1024): ");
                            int storage = in.nextInt();


                            System.out.print("Enter a ram: ");
                            int ram = in.nextInt();


                            System.out.println("Enter a ID number of the brand you want to add product(1-9): ");
                            inventory.printBrands();
                            int input3 = in.nextInt();
                            switch (input3){
                                case 1 -> {
                                    samsung.addProduct(new Notebook(id, name, samsung, price, screenSize, storage, ram));
                                }
                                case 2 -> {
                                    lenovo.addProduct(new Notebook(id, name, lenovo, price, screenSize, storage, ram));
                                }
                                case 3 -> {
                                    apple.addProduct(new Notebook(id, name, apple, price, screenSize, storage, ram));
                                }
                                case 4 -> {
                                    huawei.addProduct(new Notebook(id, name, huawei, price, screenSize, storage, ram));
                                }
                                case 5 -> {
                                    casper.addProduct(new Notebook(id, name, casper, price, screenSize, storage, ram));
                                }
                                case 6 -> {
                                    asus.addProduct(new Notebook(id, name, asus, price, screenSize, storage, ram));
                                }
                                case 7 -> {
                                    hp.addProduct(new Notebook(id, name, hp, price, screenSize, storage, ram));
                                }
                                case 8 -> {
                                    xiaomi.addProduct(new Notebook(id, name, xiaomi, price, screenSize, storage, ram));
                                }
                                case 9 -> {
                                    monster.addProduct(new Notebook(id, name, monster, price, screenSize, storage, ram));
                                }
                            }
                            inventory.addNotebook();



                        }
                        case 2 -> {
                            inventory.displayNotebooks();
                            System.out.println("Enter a ID number of the notebook you want to delete.");
                            int delete = in.nextInt();

                            for (Brand brand : inventory.brands) {
                                Iterator<Product> iterator = brand.getProducts().iterator();
                                while (iterator.hasNext()) {
                                    Product product = iterator.next();
                                    if (product instanceof Notebook && product.productId == delete) {
                                        iterator.remove();
                                        System.out.println("Product with ID " + delete + " has been removed.");
                                        inventory.notebooks.remove(product);
                                    }


                                }
                            }



                        }
                        case 0 -> {
                            printMenu();
                            input1 = in.nextInt();
                        }
                    }
                }
                case 2 -> {

                    inventory.displayMobilePhones();

                    System.out.println();
                    System.out.println("1 - Add a Mobile Phone");
                    System.out.println("2 - Delete a Mobile Phone");
                    System.out.println("0 - Exit");

                    int input2 = in.nextInt();
                    switch (input2){
                        case 1 -> {
                            System.out.println("Please enter mobile phone specs.");
                            int id = inventory.getMobilePhones().size()+1;

                            System.out.print("Enter a product name: ");
                            String name = in.next();

                            System.out.print("Enter a price: ");
                            double price = in.nextDouble();

                            System.out.print("Enter a screen size(ex: 15.6): ");
                            double screenSize = in.nextDouble();

                            System.out.print("Enter a storage(ex: 128, 1024): ");
                            int storage = in.nextInt();

                            System.out.print("Enter a ram: ");
                            int ram = in.nextInt();

                            System.out.print("Enter a battery power(ex: 3000, 4000): ");
                            int batteryPower = in.nextInt();

                            System.out.print("Enter a color: ");
                            String color = in.next();

                            System.out.println("Enter a ID number of the brand you want to add product(1-9): ");
                            inventory.printBrands();
                            int input3 = in.nextInt();
                            switch (input3){
                                case 1 -> {
                                    samsung.addProduct(new MobilePhone(id, name, samsung, price, screenSize, storage, ram, batteryPower, color));
                                    System.out.println("yeni samsung telefon uretildi");
                                }
                                case 2 -> {
                                    lenovo.addProduct(new MobilePhone(id, name, lenovo, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 3 -> {
                                    apple.addProduct(new MobilePhone(id, name, apple, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 4 -> {
                                    huawei.addProduct(new MobilePhone(id, name, huawei, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 5 -> {
                                    casper.addProduct(new MobilePhone(id, name, casper, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 6 -> {
                                    asus.addProduct(new MobilePhone(id, name, asus, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 7 -> {
                                    hp.addProduct(new MobilePhone(id, name, hp, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 8 -> {
                                    xiaomi.addProduct(new MobilePhone(id, name, xiaomi, price, screenSize, storage, ram, batteryPower, color));
                                }
                                case 9 -> {
                                    monster.addProduct(new MobilePhone(id, name, monster, price, screenSize, storage, ram, batteryPower, color));
                                }
                            }
                            inventory.addMobilePhone();
                            System.out.println("============="+inventory.mobilePhones.size());



                        }
                        case 2 -> {
                            inventory.displayMobilePhones();
                            System.out.println("Enter a ID number of the mobile phone you want to delete.");
                            int delete = in.nextInt();

                            for (Brand brand : inventory.brands) {
                                Iterator<Product> iterator = brand.getProducts().iterator();
                                while (iterator.hasNext()) {
                                    Product product = iterator.next();
                                    if (product instanceof MobilePhone && product.productId == delete) {
                                        iterator.remove();
                                        System.out.println("Product with ID " + delete + " has been removed.");
                                        inventory.mobilePhones.remove(product);
                                    }


                                }
                            }
                        }
                        case 0 -> {
                            printMenu();
                            input1 = in.nextInt();
                        }
                    }
                }
                case 3 -> {
                    for(Brand brand : inventory.brands){
                        System.out.println(brand.getName());
                    }
                    System.out.println();
                    printMenu();
                    input1 = in.nextInt();

                }
                case 0 -> {
                    System.exit(0);
                }

            }
        }
    }

    public static void printMenu(){
        System.out.println("Welcome to PatikaStore Product Management Panel");
        System.out.println("Please enter a number. (0-3)");
        System.out.println("1 - Notebook Operations");
        System.out.println("2 - Mobile Phone Operations");
        System.out.println("3 - List Brands");
        System.out.println("0 - Exit");
    }


}
/*

Iterator<Product> iterator = inventory.mobilePhones.iterator();
                            while (iterator.hasNext()){
                                Product product = iterator.next();
                                if(product.productId == delete){
                                    System.out.println("silindi  "+ product.name);
                                    iterator.remove();
                                    break;
                                }
                            }


*/