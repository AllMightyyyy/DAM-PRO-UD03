// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //let's create 10 HomeAppliances
        HomeAppliance[] homeAppliances = new HomeAppliance[10];
        for (int i = 0; i < 10; i++) {
            homeAppliances[i] = new HomeAppliance();
        }

        homeAppliances[0] = new WashingMachine(1230, 25, 10);
        homeAppliances[1] = new Television(25 , true);
        homeAppliances[2] = new Television(102, 24, 20, true);
        homeAppliances[3] = new Television(45, false);
        homeAppliances[4] = new WashingMachine(101, 10);
        homeAppliances[5] = new Television(25, true);
        homeAppliances[6] = new Television();
        homeAppliances[7] = new WashingMachine(1200, 25, 50);
        homeAppliances[8] = new Television(203, 255, 23, true);
        homeAppliances[9] = new WashingMachine();

        for(int i = 0; i < homeAppliances.length; i++) {
            homeAppliances[i].finalPrice();
            System.out.println(homeAppliances[i].getPrice());
        }
        double sumOfWashingMachines = 0;
        double sumOfTelevisions = 0;
        double sumOfHomeAppliances = 0;

        for(int i = 0; i < homeAppliances.length; i++) {
            sumOfHomeAppliances += homeAppliances[i].getPrice();
            if(homeAppliances[i] instanceof WashingMachine) {
                sumOfWashingMachines += homeAppliances[i].getPrice();
            }
            if(homeAppliances[i] instanceof Television) {
                sumOfTelevisions += homeAppliances[i].getPrice();
            }
        }
        System.out.println("The price of all Home Appliances is " + sumOfWashingMachines);
        System.out.println("The price of all Televisions is " + sumOfTelevisions);
        System.out.println("The price of all Home Appliances is " + sumOfHomeAppliances);

    }
}