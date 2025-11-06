package OOPs.Encapsulation;

public class Customer {
    private String name;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.matches("\\d{10}")) {   // validation: must be 10 digits
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Customer [name=" + name + ", age=" + age + ", phone=" + phone + "]";
    }
}
