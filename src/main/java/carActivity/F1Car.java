package carActivity;

public class F1Car extends Auto {

    public F1Car() {
        super(new F1PitstopStrategy());
        //        this.fillStrategy = new F1PitstopStrategy();
    }
}
