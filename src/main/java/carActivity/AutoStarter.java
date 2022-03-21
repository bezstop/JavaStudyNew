package carActivity;

public class AutoStarter {
    public static void main(String[] args) {
        Auto sedan = new Sedan();
        Auto hybrid = new HybridAuto();
        Auto f1car = new F1Car();
        Auto childrenCar = new ChildrenBuggies();
        Auto truck = new Truck();


        sedan.fill();
        sedan.setFillStrategy(new HybridFillStrategy());
        sedan.fill();
        sedan.gas();
        sedan.stop();

        hybrid.fill();

        f1car.fill();

        childrenCar.fill();

        truck.fill();


    }
}
