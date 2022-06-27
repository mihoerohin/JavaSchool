package day00_GroupClass.task_04;

public class FINRA {
    public static void main(String[] args) {

        numbers(3,5);
    }

    public static void numbers(int three, int five){

        for (int i = 1; i <= 30; i++) {

            if(i % three == 0 && i % five == 0) {
                System.out.print("FINRA ");

            }else if(i % three == 0){
                System.out.print("FIN ");

            }else if(i % five == 0) {
                System.out.print("RA ");

            }else{
                System.out.print(i + " ");
            }

        }

    }

}
