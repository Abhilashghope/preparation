package collections.generics;

public class Generic <T>{
    private T t;
    public Generic(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
