public class SalesPerson extends Employee{
    private double commission;
    public SalesPerson() {
        super();
        this.commission = 0;
    }
    public SalesPerson(String name, int age, double salary, double commission) {
        super(name, age, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "SalesPerson{" + '\'' +
                "name=" + getName() + '\'' +
                "age=" + getAge() + '\'' +
                "salary=" + getSalary() + '\'' +
                "commission=" + commission + '\'' +
                '}';
    }
    public boolean plus() {
        return (this.getAge()) > 30 && (this.getCommission() > 200);
    }
}
