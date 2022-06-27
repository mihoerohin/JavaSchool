package day00_other_school;

public class BasicMath {

    public Integer basicMath(String op, int v1, int v2) {

        // best -->  return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);

        switch (op) {
             case "+":
            case "plus":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
        }
        return 0;
    }
}
