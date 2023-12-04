public class WashingMachine extends HomeAppliance {
    private double load;
    private final double defaultLoad = 5;

    public WashingMachine() {
        HomeAppliance homeAppliance = new HomeAppliance();
        this.load = defaultLoad;
    }
    public WashingMachine(double load) {
        super();
        this.load = load;
    }
    public WashingMachine(double price, double weight) {
        super(price, weight);
        this.load = defaultLoad;
    }
    public WashingMachine(double price, double weight, double load) {
        super(price, weight);
        this.load = load;
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if(this.load > 30) {
            this.setPrice(this.getPrice() + 50);
        }
    }

    public double getLoad() {
        return load;
    }

}
