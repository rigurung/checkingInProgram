import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
private static ArrayList<Student>students = new ArrayList<>();
private static ArrayList<Student>employees = new ArrayList<>();


    public static void main(String[] args) {
        //adding students in the database
        Student students1 = new Student("Rojina", "Gurung", "N00304186", true);
        Student students2 = new Student("Sharmila", "Hamal", "N00304187", false);
        Student students3 = new Student("Saurav", "Shrestha", "N00304188", true);
        Student students4 = new Student("Sandesh", "Sharma", "N00304189", false);
        Student students5 = new Student("Ujjwal", "Dhakal", "N00304190", false);
        Student students6 = new Student("Asish", "Pandey", "N00304191", false);

        //adding student to the arraylist
        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students4);
        students.add(students5);
        students.add(students6);

        //adding students who works to the employee arraylist
        addEmployee(students);
        printEmployee(employees);
        printStudent(students);

        Lab lab1 = new Lab("Ellender", students, employees);
   //  removeStudent(students2);
     activeStudent("N00304186");
     activeStudent("N00304189");
        activeStudent("N00304187");
     activeStudent("N00304188");
     signOut("N00304189");
     printActiveStudent();

    }


//it adds the students who are employees to the employees List
    public static void addEmployee(ArrayList<Student> students){
        ArrayList<Student> checkList = new ArrayList<>(students);
        for(int i = 0; i < checkList.size(); i++){
            Student _student = checkList.get(i);
           if (_student.isEmployee()){
               employees.add(_student);
           }
        }
    }

    //this will delete students who graduated or are restricted to enter the lab
    public static void removeStudent(Student _student){
        students.remove(_student);
        employees.remove(_student);
    }


    //method to print the Employees who works in the lab
    public static void printEmployee(ArrayList<Student> students){
        System.out.println("\n" + "Employees that works Lab");
        for(int i = 0; i<students.size(); i++){
            Student _student = students.get(i);
            System.out.println(_student.getFirstName() + " " + _student.getLastName() );
        }
    }

    //it prints the students who are eligible to enter the lab
    public static void printStudent(ArrayList<Student> students){
        System.out.println("\n" +"Students allowed in Lab");
        for(int i =0; i<students.size(); i++){
            Student _student = students.get(i);

                if(employees.contains(_student)){
                }
                else {
                    System.out.println(_student.getFirstName() + " " + _student.getLastName());
                }
        }
    }

    //clock in the student
    public static void activeStudent(String studentID){
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(studentID)) {
                 students.get(i).setActive();
                 break;
                }
            }
        }



    public static void signOut(String studentID){
    for(int i = 0; i < students.size(); i++){
        if(students.get(i).getStudentID().equals(studentID)){
            students.get(i).setDeactive();
          }
        }
    }


    public static void printActiveStudent(){
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).isActive()){
                if(students.get(i).isEmployee()){
                    System.out.println(" \n Active Employees in the Lab");
                    System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
                    System.out.println(currentDate());
                }else {
                    System.out.println("\nActive Students in the Lab ");
                    System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
                    System.out.println(currentDate());
                }
            }
        }
    }



    public static String currentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
      return  (dateFormat.format(date));

    }



}

