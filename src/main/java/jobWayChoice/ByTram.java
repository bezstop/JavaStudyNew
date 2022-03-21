package jobWayChoice;

public class ByTram implements JobWayChoiceStrategy{
    @Override
    public void choiceWayForJob() {
        System.out.println("Поеду на трамвае");
    }
}
