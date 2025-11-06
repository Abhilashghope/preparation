package OOPs.Inheretance;

public class User {
    private int id;
    private String name;
    private int age;
    public User(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("ID: "+id+"\nName: "+name+"\nAge: "+age);
    }
}
