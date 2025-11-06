package OOPs.Inheretance;

public class Consumer extends User{
    public String address;
    public Consumer(int id, String name, int age, String address) {
        super(id,name,age);
        this.address = address;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Address: " + address);
    }
}
