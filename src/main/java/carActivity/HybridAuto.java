package carActivity;

public class HybridAuto extends Auto{
    public HybridAuto() {
        super(new HybridFillStrategy());
        //        this.fillStrategy = new HybridFillStrategy();
    }
}
