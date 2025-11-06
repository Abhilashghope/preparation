package org.example;

import Java.StaticExample;
import Java.lamdaExpressions.MathOperation;
import OOPs.Abstraction.CODPayments;
import OOPs.Abstraction.PaymentService;
import OOPs.Abstraction.UpiPayments;
import OOPs.Encapsulation.Customer;

import OOPs.Inheretance.Consumer;
import OOPs.Inheretance.DeliveryMan;
import OOPs.Inheretance.User;
import OOPs.interfaces.FoodOrder;
import OOPs.interfaces.GroceryOrder;
import OOPs.interfaces.PharmacyOrder;
import OOPs.polymorphism.CardPayment;
import OOPs.polymorphism.CompileTimePolymorphism;
import OOPs.polymorphism.RunTimePolymorphism;
import OOPs.polymorphism.UpiPaymentsService;
import collections.generics.Generic;
import collections.generics.MyArrayList;
import multithreading.MyThread;
import multithreading.RunnableThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Abstraction Example********************************!");
//        AbstractionExample();
//        PaymentService newPayment = new UpiPayments(500);
//        AbstractionExample2(newPayment);
//        PaymentService newPayment2 = new CODPayments(500);
//        AbstractionExample2(newPayment2);
//        System.out.println("End############################################################################################");

//        System.out.println("Interfaces Example*************************************************");
//        InterfacesExample();
//        System.out.println("End InterfacesExample#####################################################");

//        System.out.println("Encapsulation Example***************************************************");
//        EncapsulationExample();
//        System.out.println("End###################################################################");


//        System.out.println("Inheretance Example***************************************************");
//        InheretanceExample();
//        System.out.println("End###################################################################");

//        System.out.println("Polymorphism*******************************************************");
//        CompileTimePolymorphismExample();
//        System.out.println("End###################################################################");
//
//        System.out.println("Polymorphism*******************************************************");
//        RunTimePolymorphismExample();
//        System.out.println("End###################################################################");
//            System.out.println("Static Exampole****************************************************");
//        StaticKeywordExample();
//        System.out.println("***************************************************************");

//        GenericExample();
//        ListExample();
//        failSafeExample();
//        failFastExample();
//        failSafeExample2();
//        StreamExample();
//        LamdaExamples();
//        functionalInterfacesExample();
//        System.out.println("************************************************");
//        functionalInterfacesExample2(10,20);
//        streamExample();

        MyThread myThread = new MyThread();
        System.out.println(Thread.currentThread().getName() + " " + myThread.getState());
        myThread.start();
        System.out.println(Thread.currentThread().getName() + " " +myThread.getState());
        myThread.join();
        RunnableThread runnableThread = new RunnableThread();
        Thread runnable =  new Thread(runnableThread);
        System.out.println(Thread.currentThread().getName() + " " +runnable.getState());
        runnable.start();
        System.out.println(Thread.currentThread().getName() + " " +runnable.getState());

    }



    public static void AbstractionExample(){
        UpiPayments pay1 = new UpiPayments(35.13);
        boolean success = pay1.pay();
        if(success)
            pay1.generateReceipt();

        CODPayments pay2 = new CODPayments(8225.13);
        boolean success2 = pay2.pay();
        if(success2)
            pay2.generateReceipt();
    }
    public static void AbstractionExample2(PaymentService payment){
        if(payment.pay())
            payment.generateReceipt();
        else
            System.out.println("Payment failed");
    }


    public static void InterfacesExample(){
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.createOrder();
        foodOrder.trackOrder();
        foodOrder.cancelOrder();
        GroceryOrder groceryOrder = new GroceryOrder();
        groceryOrder.createOrder();
        groceryOrder.trackOrder();
        groceryOrder.cancelOrder();
        PharmacyOrder pharmacyOrder = new PharmacyOrder();
        pharmacyOrder.createOrder();
        pharmacyOrder.trackOrder();
        pharmacyOrder.cancelOrder();
    }
    public static void EncapsulationExample(){
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        try{

            c1.setName("John Doe");
            c1.setAge(23);
            c1.setPhone("919765008101");
        }catch(Exception e){
            e.printStackTrace();
        }
        try{


            c2.setName("sagar");
            c2.setAge(22);
            c2.setPhone("919765008102");
        }catch(Exception e){
            e.printStackTrace();
        }


        try{

            c3.setName("Abhilash");
            c3.setAge(23);
            c3.setPhone("919765008103");
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(c1.getName() + " " + c1.getAge()+ " " + c1.getPhone());
        System.out.println(c2.getName() + " " + c2.getAge()+ " " + c2.getPhone());
        System.out.println(c3.getName() + " " + c3.getAge()+ " " + c3.getPhone());
        System.out.println(c1);
        System.out.println(c2.toString());
        System.out.println(c3);
    }

    public static void InheretanceExample(){
        User deliveryMan = new DeliveryMan(1,"sagar",28,"fz1");
        deliveryMan.displayInfo();

        User c1 = new Consumer(2,"abhilsh",27,"itrend waterfront");
        c1.displayInfo();

    }
    public static void CompileTimePolymorphismExample(){
        CompileTimePolymorphism cmp = new CompileTimePolymorphism();
        cmp.add(2,9);
        cmp.add(3,8.5);
    }

    public static void RunTimePolymorphismExample(){
        RunTimePolymorphism rtm = new CardPayment();
        rtm.ProcessPayment();

        RunTimePolymorphism rtm2 = new UpiPaymentsService();
        rtm2.ProcessPayment();
    }

    public static void StaticKeywordExample(){
        new StaticExample("abc");
        new StaticExample("def");
        System.out.println("count"+StaticExample.count);
        StaticExample.IncrementCOunt();
        System.out.println("count"+StaticExample.count);
    }

    public static void GenericExample(){
        Generic<String> ex = new Generic<>("Hello World");
        Generic<Integer> ex2 = new Generic<>(23);

        ex.print();
        ex2.print();

        Double arr[] = {2.3,12.56};
        String arr2[] = {"abhilash","sagar"};
        Generic.printArray(arr);
        Generic.printArray(arr2);
        List<Integer> lst =new ArrayList<>();
    }


    public static void ListExample(){
        List<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("sagar");
        names.add("Abhilash");
        names.add("itrend waterfront");
        names.add("pushya");
        names.add("satya");
        names.add(2,"vasu");

        for(String name : names){
            System.out.println(name);
        }
        MyArrayList<Integer> lists = new MyArrayList<>();
        System.out.println("size:"+lists.size());
        lists.add(10);
        lists.add(20);
        lists.add(7,30);
        lists.printMyArrayList();
    }

    public static void failFastExample(){
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        for (Integer integer : list) {
            System.out.println(integer);
            list.add(4);  // ❌ ConcurrentModificationException
        }
    }

    public static void failSafeExample(){
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(List.of(1, 2, 3));
        for (Integer i : list) {
            System.out.println(i);
            list.add(4);  // ✅ No exception
        }
        System.out.println(list);
    }
    public static void failSafeExample2(){
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("A");
        set.add("B");

        for (String s : set) {
            System.out.println("a:"+s);
            set.add("C"); // ✅ Safe
        }
        for (String s: set){
            System.out.println("S:" +s);
        }
    }

    public static void StreamExample(){
        List<String> names = List.of("alice","bob","charlie");
        Stream<String> s1 = names.stream();
        System.out.println("s1:"+s1);
        // from array
        Stream<Integer> s2 = Arrays.stream(new Integer[]{1,2,3});

        // Stream.of
        Stream<String> s3 = Stream.of("a","b","c");

        // empty
        Stream<Object> empty = Stream.empty();

        // primitive streams
        IntStream ints = IntStream.range(1, 5); // 1..4
        IntStream closed = IntStream.rangeClosed(1, 5); // 1..5

        // infinite streams
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> naturals = Stream.iterate(1, n -> n + 1);

        // builder
        Stream.Builder<String> builder = Stream.<String>builder().add("x").add("y");

        Stream<String> s4 = builder.build();
    }

    public static void LamdaExamples(){
        MathOperation sumOperation = (a,b)->a+b;
        MathOperation subtractOperation = (a,b)->a-b;
        MathOperation multiplyOperation = (a,b)->a*b;
        MathOperation divideOperation = (a,b)->a/b;
        System.out.println("Sum:"+sumOperation.operate(5,10));
        System.out.println("Subtract:"+subtractOperation.operate(5,10));
        System.out.println("Multiply:"+multiplyOperation.operate(5,10));
        System.out.println("Divide:"+divideOperation.operate(10,5));
    }
    public static void functionalInterfacesExample(){

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = x -> x % 2 != 0;
        System.out.println(isEven.test(2));
        System.out.println(isOdd.test(2));

        Function<Integer,Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.andThen(doubleIt).apply(2));

        java.util.function.Consumer<Integer> print = x -> System.out.println(x);
        Supplier<String> sup = () -> "Hello World";
        System.out.println(sup.get());


        Supplier<Integer> number = () -> 158;
        Predicate<Integer> isEven2= x -> x % 2 == 0;
        Function<Integer,Integer> doubleIt2 = x -> x * 2;
        java.util.function.Consumer<Integer> print2 = x -> System.out.println(x);
        if(isEven2.test(2)){
           print2.accept(doubleIt2.apply(number.get()));

        }

    }
    public static void functionalInterfacesExample2(Integer a,Integer b){
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x + y) % 2 == 0;
        BiFunction<Integer,Integer,Integer> multiply = (x,y) -> x * y;
        java.util.function.Consumer print2 = x -> System.out.println(x);
        if(isSumEven.test(a,b)){
           print2.accept( multiply.apply(a,b));
        }

    }
    public static void streamExample(){
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> integers = Stream.iterate(1,x->x+1).limit(20).toList();
        long startTime = System.currentTimeMillis();
        Long sum2=0L;
        integers.stream().map(x->{
            Long i=sum2+x;
            return i;
        }).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("time taken:"+(endTime-startTime));
        Long sum=0L;
        startTime = System.currentTimeMillis();
         integers.parallelStream().map(x->{
            Long i=sum+x;
            return i;
        }).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("time taken with parallel stream:"+(endTime-startTime));


    }
    public static long  factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
