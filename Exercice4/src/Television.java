public class Television extends HomeAppliance {
    private int resolution;
    private boolean DTTtuner;
    private static final int defaultResolution = 20;
    private static final boolean defaultDTTuner = false;
    public Television() {
        super();
        this.resolution = defaultResolution;
        this.DTTtuner = defaultDTTuner;
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if(this.resolution > 40) {
            this.setPrice(this.getPrice() + (this.getPrice() * ((double) 30 /100)));
        }
        if(this.DTTtuner) {
            this.setPrice(this.getPrice() + 50);
        }
    }

    public Television(int resolution, boolean DTTtuner) {
        super();
        this.resolution = resolution;
        this.DTTtuner = DTTtuner;
    }
    public Television(int price, int weight, int resolution, boolean DTTtuner) {
        super(price, weight);
        this.resolution = resolution;
        this.DTTtuner = DTTtuner;
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isDTTtuner() {
        return DTTtuner;
    }

}
