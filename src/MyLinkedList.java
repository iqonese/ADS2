public class MyLinkedList<T> implements MyList{

    // head is the starting instance of MyLinkedList
    private Node<T> head;
    private int size;

    // Linked List instance contains a value and a reference to the next value
    // We need a custom datatype to contain such behaviour
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public MyLinkedList() {
        // head is always null, because there is no previous value to get reference
        head = null;
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        // we clone the head to current and iterate over the LinkedList until we reach null or Object o
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            // go to the next value
            current = current.next;
        }
        // default return type
        return false;
    }

    @Override
    public void add(Object item) {
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {
        // reset the list
        head = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        Node<T> current = head;

        // iterate until we reach the provided index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int indexOf(Object o) {
        // initial index value is set to 0
        int index = 0;
        Node<T> current  = head;
        while(current != null) {
            if (current.data.equals(o)) {
                // if the current value equals Object o, index is instantly returned
                return index;
            }
            // index is concurrent with current
            current = current.next;
            index ++;
        }
        // default return
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // default index if there is no o in the list
        int index  = -1;
        int i = 0;
        Node<T> current = head;
        while(current != null) {
            if (current.data.equals(o)) {
                index = i;
            }
            current = current.next;
            i ++;
        }
        return index;
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public void sort() {

    }
}
