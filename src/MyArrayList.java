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
        checkIndex(index);
        if (size == arr.length) {
            T[] newArray = (T[]) new Object[arr.length * 2];
            // built-in arraycopy method to slice and merge an array
            System.arraycopy(arr, 0, newArray, 0, size);
            arr = newArray;
        }
    }


    public boolean remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(item)) {
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                // last element of the array gets deleted
                arr[size - 1] = null;
                // fix the size
                size--;
                return true;
            }
        }
        // base case if there is no element to remove
        return false;
    }


    public Object remove(int index) {
        checkIndex(index);
        Object removedItem = arr[index];
        // built-in method to slice, manipulate and merge an array
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        arr[size - 1] = null;
        // fix the size
        size--;
        return removedItem;
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