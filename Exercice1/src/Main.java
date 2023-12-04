// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        Counter newCounter = new Counter(counter);
        System.out.println(counter.getCount());
        System.out.println(newCounter.getCount());
        System.out.println(counter == newCounter);
        counter.incrementar();
        System.out.println("counter.count = " + counter.getCount());
        counter.decrementar();
        counter.decrementar();
        System.out.println("counter.count = " + counter.getCount());
    }
}