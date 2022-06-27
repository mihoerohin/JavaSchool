package day05_variables;

public class Computer {
    public static void main(String[] args) {

        String brand, processor, color, description, oS;
        int ramMemory, storageMemory, numberOfUsbSlots, numbersOfTypeC;
        boolean hasMonitor, hasWifiCard, hasUsb3_0, hasTypeC, sdCard;
        double price, cpu;
        float ghz;

        //Intel(R) Core(TM) i7-9750H CPU @ 2.60GHz   2.60 GHz//

        brand = "Razer";
        processor = "Intel core";
        color = "Black";
        description = "Description of computer";
        oS = "Windows 10 Home";

        price = 1299.99;
        cpu = 7.0;
        ghz = 2.60F;

        storageMemory = 2;
        ramMemory = 16;
        numberOfUsbSlots = 3;
        numbersOfTypeC = 2;

        hasMonitor = true;
        hasTypeC = true;
        hasWifiCard = true;
        hasUsb3_0 = true;
        sdCard = true;

        System.out.println("\n" + description + ", " + brand + ", OS: " + oS + "\n");
        System.out.println("Processor: " + processor + ", " + cpu + " " + ghz + "Ghz");
        System.out.println("Storage memory: " + storageMemory + "Tb, Ram memory: " + ramMemory + "Gb" );
        System.out.println("Monitor: " + hasMonitor + ", WiFi card: " + hasWifiCard + ", SD card: " + sdCard + ", USB 3.0: " + hasUsb3_0 + " " + numberOfUsbSlots + " ports, USB type C: " + hasTypeC + " " + numbersOfTypeC + " ports");
        System.out.println("Colors: " + color + ", Price: $" + price);



        }
    }
