package carActivity;

public class Auto {
    FillStrategy fillStrategy;

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {

        System.out.println("Тормозим!");
    }

    public void fill() {
        fillStrategy.fill();
    }

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
}
