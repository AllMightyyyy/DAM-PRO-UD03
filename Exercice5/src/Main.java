// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DeliveryPerson deliveryPerson1 = new DeliveryPerson("Paco", 20, 1002, "Madrid");
        DeliveryPerson deliveryPerson2 = new DeliveryPerson("Ismael", 30, 1234, "Murcia");
        SalesPerson salesPerson1 = new SalesPerson("Lana", 25, 2000, 10);
        SalesPerson salesPerson2 = new SalesPerson("Salma", 24, 1940, 20);

        System.out.println(deliveryPerson1.toString());
        System.out.println(deliveryPerson2.toString());
        System.out.println(salesPerson1.toString());
        System.out.println(salesPerson2.toString());

        deliveryPerson1.plus();
        deliveryPerson2.plus();
        salesPerson2.plus();
        salesPerson1.plus();

        System.out.println(deliveryPerson1.toString());
        System.out.println(deliveryPerson2.toString());
        System.out.println(salesPerson1.toString());
        System.out.println(salesPerson2.toString());

    }
}