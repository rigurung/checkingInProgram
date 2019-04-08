public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private boolean isEmployee;
    private boolean isActive;


public Student(String firstName, String lastName, String studentID, boolean isEmployee) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentID = studentID;
    this.isEmployee = isEmployee;
    this.isActive = false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public boolean isActive(){
    return isActive;
    }

    public void setActive() {
        this.isActive = true;
    }

    public void setDeactive() {
        this.isActive = false;
    }

}