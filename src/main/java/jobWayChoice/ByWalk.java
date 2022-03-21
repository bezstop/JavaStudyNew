package jobWayChoice;

public class ByWalk implements JobWayChoiceStrategy{
    @Override
    public void choiceWayForJob() {
        System.out.println("Пойду пешком");
    }
}
