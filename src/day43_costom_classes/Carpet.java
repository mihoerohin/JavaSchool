package day43_costom_classes;

public class Carpet {
     double width;
     double length;
     boolean isPersian;
     double unitPrice;
     double total;

     public Carpet(boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice){
         width = inputWidth;
         length = inputLength;
         isPersian = inputPersian;
         unitPrice = inputUnitPrice;
         calculatePrise();

     }

      public void calculatePrise(){

          total = width * length * unitPrice;

          if(isPersian){
              total += 200;

          }
      }

      public String toString(){
         return (isPersian ? "The persian carpet" : "The carpet ") +
                 "\nhas dimensions of " + length + " x " + width +
                 "\nThe util price is $" + unitPrice +
                 "\nAll coming to a total of: $" + total;

      }
}
