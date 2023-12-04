public class HomeAppliance {
    private double price, weight;
    private String color;
    private char energyConsumption;

    public HomeAppliance() {
        this.price = 100;
        this.weight = 5;
        this.color = "White";
        this.energyConsumption = 'F';
    }

    public HomeAppliance(double price, double weight, String color, char energyConsumption) {
        HomeAppliance homeAppliance = new HomeAppliance(price, weight);
        this.color = color;
        this.energyConsumption = energyConsumption;
    }

    public HomeAppliance(double price, double weight) {
        HomeAppliance homeAppliance = new HomeAppliance();
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    public void checkEnergyConsumption(char c) {
        if(this.energyConsumption != c) {
            this.energyConsumption = 'F';
        }
    }
    public void checkColor(String color) {
        if(this.color != color) {
            this.color = "White";
        }
    }
    public void finalPrice() {
        if(this.energyConsumption == 'F') {
            this.price += 10;
        } else if(this.energyConsumption == 'E') {
            this.price += 30;
        } else if (this.energyConsumption == 'D') {
            this.price += 50;
        } else if(this.energyConsumption == 'C') {
            this.price += 60;
        } else if(this.energyConsumption == 'B') {
            this.price += 80;
        } else if (this.energyConsumption == 'A') {
            this.price += 100;
        }
        if(this.weight >= 0 && this.weight <= 19) {
            this.price += 10;
        } else if (this.weight >= 20 && this.weight <= 49) {
            this.price += 50;
        } else if (this.weight >= 50 && this.weight <= 79) {
            this.price += 80;
        } else {
            this.price += 100;
        }
    }
}
