package jobWayChoice;

public class Developer extends Citizen{
    public Developer() {
    }

    public Developer(String jobTitle, String name) {
        super(jobTitle, name);
    }

    @Override
    public void getUp() {
        System.out.println("Я разраб и я проснулся-потянулся");
    }
}
