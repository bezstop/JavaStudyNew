package jobWayChoice;

public class BySubway implements JobWayChoiceStrategy{
    @Override
    public void choiceWayForJob() {
        System.out.println("Поеду на метро");
    }
}
