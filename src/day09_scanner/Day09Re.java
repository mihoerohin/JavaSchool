package day09_scanner;

public class Day09Re {
    public static void main(String[] args) {

        //Evaluate the expressions step by step. NOT in intellij, do it yourself
        //int R = 20;
        //int W = -R-- + -R++ + --R * R-- % 2;
        //what is R?
        //what is W?

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //      -20  + -19  +  19 * 19  % 2
        //      -20  + -19  +  361  % 2
        //      -20  + -19  +  1
        //      -39  +  1
        //      -38
        System.out.println(R);
        System.out.println(W);


        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        //      -1   +  0  /  -1  *  -1
        //      -1   +  0  /  -1
        //      -1   +  0
        //      -1
        System.out.println(a);
        System.out.println(b);


    }
}
