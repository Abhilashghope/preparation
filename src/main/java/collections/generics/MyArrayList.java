package collections.generics;
import java.util.Arrays;

public class MyArrayList <E>{
    public static int size;
    public static int maxArraylength;
    public Object[] elements;
    public MyArrayList(){
        size = 0;
        maxArraylength = 10;
        elements = new Object[maxArraylength];

    }
    public MyArrayList(int maxSize){
        size = 0;
        elements = new Object[maxSize];
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public E get(int index){
        boolean isInboundIndex = isInBoundIndex(index);
        if(isInboundIndex){
            return (E) elements[index];
        }
        else
            return null;
    }
    public int indexOf(E element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return i;
            }

        }
        return -1;
    }
    public int lastIndexOf(E element){
        for(int i = size - 1; i >= 0; i--){
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }


    public void add(E element){
        if(size == maxArraylength){
            copyArrayToNewPlace();
        }
       elements[size++]= element;

    }
    public void add(int index, E element){
        boolean isInRange = isInRange(index);
        if(isInRange){
           System.arraycopy(elements, index, elements, index + 1, size - index);
           elements[index] = element;
           size++;
        }else {
            System.out.println("Index out of bounds");
            while(index > maxArraylength) {
                copyArrayToNewPlace();
            }
            elements[index] = element;
            size+=index+1;
        }

    }

    public void printMyArrayList(){
        for(int i = 0; i < size; i++){
            System.out.print("index="+i+" value="+elements[i] + " ");
        }
    }




    private void copyArrayToNewPlace(){
        maxArraylength = maxArraylength + maxArraylength/2;
        Arrays.copyOf(elements,maxArraylength);

    }



    private boolean isInBoundIndex(int index){

        return index<size && index>=0 && index<maxArraylength;
    }

    private boolean isInRange(int index){
        return index>=0 && index<maxArraylength;
    }

}
