package jobWayChoice;

public class ByTaxi implements JobWayChoiceStrategy{
    @Override
    public void choiceWayForJob() {
        System.out.println("Поеду на такси");
    }
}
