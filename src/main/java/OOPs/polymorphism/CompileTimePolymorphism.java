package OOPs.polymorphism;

public class CompileTimePolymorphism {
    public void add(int a , int b){
        int res= a+b;
        System.out.println("Adding "+a+" "+b+ " = " +res);
    }

    public void add(int a,double b){
        double res= a+b;
        System.out.println("Adding "+a+" "+b+ " = " +res);
    }
}
