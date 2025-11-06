package Java;

public class StaticExample {

    public static int count;
    String name;

    public StaticExample(String name) {
        this.name = name;
        count++;
    }
    public static void IncrementCOunt(){
        count+=10;
        System.out.println(count);
    }

}
