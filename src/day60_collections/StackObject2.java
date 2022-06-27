package day60_collections;

import java.util.Stack;

public class StackObject2 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.push(20);
        stack.push(100);
        stack.push(30);

        System.out.println(stack);              // [40, 20, 100, 30]
        System.out.println(stack.peek());       //  30 take and show
        System.out.println(stack.pop());        // 30 last element
        System.out.println(stack.pop());        // 100
        System.out.println(stack);              // [40, 20]
        System.out.println(stack.peek());       // 20
        System.out.println(stack);              // [40, 20]
        System.out.println(stack.pop());        // 20
        System.out.println(stack.pop());        // 40
        System.out.println(stack);              // []
    }
}
