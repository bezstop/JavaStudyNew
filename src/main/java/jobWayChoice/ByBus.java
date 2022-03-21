package jobWayChoice;

public class ByBus implements JobWayChoiceStrategy{
    @Override
    public void choiceWayForJob() {
        System.out.println("Поеду на автобусе");
    }
}
