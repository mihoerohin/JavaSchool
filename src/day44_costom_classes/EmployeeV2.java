package day44_costom_classes;

public class EmployeeV2 {

        String name;
        int id;
        String jobTitle;
        double salary;


        public EmployeeV2(String name, String jobTitle){
            this.name = name;
            this.jobTitle = jobTitle;
        }
        public EmployeeV2(String name, String jobTitle, int id,  double salary){
            this(name, jobTitle);
            this.id = id;
            this.salary = salary;
        }

        public void goToMeeting(){
            System.out.println(name + " is going to a meeting");
        }
        public String toString(){
            return  name + " - " + jobTitle + " - " + id + " - $" + salary;
        }


}
