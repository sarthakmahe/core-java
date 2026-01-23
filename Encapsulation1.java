package untitled.src;

public class Encapsulation1 {
    private int studentRollnumber;
    private String studentName;

    public int getStudentRollnumber() {
        System.out.println("step-3");
        return studentRollnumber;
    }

    public void setStudentRollnumber(int studentRollnumber) {
        System.out.println("step-1");
        this.studentRollnumber = studentRollnumber;
    }

    public String getStudentName() {
        System.out.println("step-4");
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("step-2");
        this.studentName = studentName;
    }
}
