import java.util.Arrays;

public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size;

    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    public void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length*2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }


    public int size() {
        return size;
    }


    public boolean contains(Object o) {
        for (int i = 0; i < size; i ++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }


    public void add(Object element) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = (T) element;
    }



    public void add(Object item, int index) {

    }


    public boolean remove(Object item) {
        return false;
    }


    public Object remove(int index) {
        return null;
    }

    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }


    public Object get(int index) {
        return null;
    }


    public int indexOf(Object o) {
        // If the object we are looking is present, we return i, otherwise error int -1
        for (int i = 0; i < size; i ++) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(Object o) {
        // initialize it with -1 to prevent errors
        // each time we meet the desired outcome, we keep updating temp and in the end return it
        int temp = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                temp = i;
            }
        }
        return temp;
    }


    public void sort() {
        Arrays.sort(arr);
    }

    public void delete(int index){
        checkIndex(index);
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
}