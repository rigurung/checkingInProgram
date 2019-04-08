import java.util.ArrayList;


public class Lab {
    private String name;
    private ArrayList<Student> student;
    private ArrayList<Student> employee;
    private boolean active;



    public Lab(String name, ArrayList<Student> student, ArrayList<Student> employee) {
        this.name = name;
        this.student = student;
        this.employee = employee;
    }



    public ArrayList<Student> getStudent() {
        return student;
    }


//it prints student who can enter the lab
    public  void print() {
     System.out.println("\n" + this.name  + "\n");
     System.out.println("Active Students" );
     for(int i =0; i < student.size(); i++){
         Student student = getStudent().get(i);
         if(employee.contains(student)){

         }else {
             System.out.println( student.getFirstName() + " " + student.getLastName());
         }
     }
     System.out.println("\n" + "Active Employees");
     for(int i = 0; i < employee.size(); i++) {
         System.out.println( this.employee.get(i).getFirstName() + " " + this.employee.get(i).getLastName());

     }
 }


 



}
