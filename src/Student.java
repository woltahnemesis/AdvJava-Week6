public class Student implements Comparable<Student> {
    private int studentNum;
    private String firstName, lastName;

    public Student(int studentNum, String firstName, String lastName) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if (studentNum>0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student Number must be greater than 0");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // This function is for sorting objects
    @Override
    public int compareTo(Student otherStudent) {
        if(studentNum > otherStudent.getStudentNum())
            return 1;
        else if (studentNum < otherStudent.getStudentNum())
            return -1;
        return 0; // return 0 if the same
    }

    public String toString() {
        return String.format("%d %s %s", studentNum, firstName, lastName);
    }
}
