public class DeliveryPerson extends Employee {
    private String zone;
    public DeliveryPerson() {
        this.zone = "Madrid";
    }
    public DeliveryPerson(String zone) {
        super();
        this.zone = zone;
    }
    public DeliveryPerson(String name, int age, double salary, String zone) {
        super(name, age, salary);
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return super.toString() + "DeliveryPerson{" +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "salary='" + getSalary() + '\'' +
                "zone='" + zone + '\'' +
                '}';
    }
    public boolean plus() {
        return (this.getAge() < 25) && (this.zone.equals("3"));
    }
}
