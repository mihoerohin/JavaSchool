package day29_Arrays;

public class Store {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad", "Backpack"};
        double [] prices = {89.99, 150.0, 999.99, 250.0, 435.50, 39.99};
        int [] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};

          for(int i = 0; i < items.length; i++){

              System.out.println("Items ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i] + "\n");

          }
        System.out.println();

          int indexGloves = 0;

       for(int i = 0; i < items.length; i++){
           if(items[i].equalsIgnoreCase("gloves")){
               indexGloves = i;
               break;
           }

        }
        System.out.println("index of gloves: " + indexGloves);


      
    }
}
