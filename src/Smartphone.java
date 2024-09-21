public class Smartphone {

        public String brand;
        public String model;
        public String color;
        public int ram;

        // Default constructor
        public Smartphone() {
            this.brand = "Xiaomi";
            this.model = "Redmi";
            this.color = "Blue";
            this.ram = 4;
        }

        // Parameterized constructor
        public Smartphone(String brand, String model, String color, int ram) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.ram = ram;
        }

        // Method to display smartphone info
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);
            System.out.println("RAM: " + ram + "GB");
            System.out.println();
        }

        // Additional method to upgrade RAM
        public void upgradeRam(int newRam) {
            this.ram = newRam;
            System.out.println("RAM upgraded to: " + this.ram + "GB");
        }
}
