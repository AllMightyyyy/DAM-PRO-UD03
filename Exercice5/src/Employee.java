public class Employee {
    private String name;
    private int age;
    private double salary;
    private static double Plus = 300;
    public Employee () {
        this.name = "";
        this.age = 0;
        this.salary = 0;
    }
    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static double getPlus() {
        return Plus;
    }

    public static void setPlus(double plus) {
        Plus = plus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", salary=" + salary + '\'' +
                '}';
    }
}
