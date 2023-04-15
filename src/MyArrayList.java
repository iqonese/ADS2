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

    public int getSize() {
        return size;
    }


    public int size() {
        return 0;
    }


    public boolean contains(Object o) {
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
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public void sort() {

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