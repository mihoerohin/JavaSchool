package day58_exception;

public class PersonObject {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setAge(22);
        try {
            obj.setName("Bond James");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
