public class Main {
    public static void main(String[] args) {

        Smartphone phone1 = new Smartphone();
        phone1.displayInfo();

        Smartphone phone2 = new Smartphone("Apple", "iPhone 13", "Silver", 6);
        phone2.displayInfo();

        Smartphone phone3 = new Smartphone("Samsung", "Galaxy S21", "Black", 8);
        phone3.displayInfo();

        phone3.upgradeRam(12);  // Upgrading RAM
        phone3.displayInfo();
    }
}