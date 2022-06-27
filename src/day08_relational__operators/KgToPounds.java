package day08_relational__operators;

public class KgToPounds {
    public static void main(String[] args) {

        //  Ex:
        //                kg = 10;
        //                output:
        //                    10 kg equal to 22.0462 pounds
        //                kg = 20
        //                output:
        //                    20 kg equal to 44.0924 pounds
        //                ....
        //            Hint: 1kg = 2.20462 pounds

        double kg = 1;
        double pound = 2.20462;

        System.out.println("1kg = " + kg * pound);
        System.out.println("2kg = " +  ++kg * pound);
        System.out.println("3kg = " + ++kg * pound);
        System.out.println("4kg = " + ++kg * pound);
        System.out.println("5kg = " + ++kg * pound);
        System.out.println("6kg = " + ++kg * pound);
        System.out.println("7kg = " + ++kg * pound);
        System.out.println("8kg = " + ++kg * pound);
        System.out.println("9kg = " + ++kg * pound);
        System.out.println("10kg = " + ++kg * pound);



    }
}
