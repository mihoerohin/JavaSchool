package day20_string;

public class SmsParts {
    public static void main(String[] args) {
        /*
        Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and
problem solving}”
Separate these parts and print them separately:
Sender: actualSender
Number: actualNumber
Message: actualMessage”
         */
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int senderStar = msg.indexOf('<');
        int senderEnd = msg.indexOf('>');

        int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int msgEnd = msg.indexOf('}');

        System.out.println("Sender: " + msg.substring(senderStar + 1, senderEnd));
        System.out.println("Number: " + msg.substring(numberStart + 1, numberEnd));
        System.out.println("Message: " + msg.substring(msgStart + 1, msgEnd));

        String msg2 = "     Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}  ";

        System.out.println(msg2.trim());


    }
}
