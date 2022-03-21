package jobWayChoice;

import java.util.Locale;

public abstract class Citizen {
    JobWayChoiceStrategy jobWayChoiceStrategy;
    private String jobTitle;
    private String name;

    public Citizen(String jobTitle, String name) {
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public Citizen() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle.toUpperCase(Locale.ROOT);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobWayChoiceStrategy(JobWayChoiceStrategy jobWayChoiceStrategy) {
        this.jobWayChoiceStrategy = jobWayChoiceStrategy;
    }

    public void executeJobWayChoiceActivity() {
        jobWayChoiceStrategy.choiceWayForJob();
    }

    public abstract void getUp();

    public void checkTrafficJam() {
        System.out.println("Проверил утренние пробки");
    }
}
