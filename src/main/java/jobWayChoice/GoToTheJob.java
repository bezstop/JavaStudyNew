package jobWayChoice;

public class GoToTheJob {
    public static void main(String[] args) {

        Citizen student = new Student();
        Citizen developer = new Developer();

        student.setJobTitle("студент");
        student.setName("Юра");
        student.getUp();
        student.checkTrafficJam();
        student.setJobWayChoiceStrategy(new ByWalk());
        student.executeJobWayChoiceActivity();


        developer.setJobTitle("разработчик");
        developer.setName("Паша");
        developer.getUp();
        developer.checkTrafficJam();
        developer.setJobWayChoiceStrategy(new ByTaxi());
        developer.executeJobWayChoiceActivity();


    }
}
