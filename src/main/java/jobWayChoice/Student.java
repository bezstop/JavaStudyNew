package jobWayChoice;

public class Student extends Citizen{

    public Student(String jobTitle, String name) {
        super(jobTitle, name);
    }

    public Student() {
        super();
    }

    @Override
    public void getUp() {
        System.out.println("Я студент и я проснулся-потянулся");
    }
}
