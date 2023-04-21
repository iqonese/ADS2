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

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
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

    @Override
    public void sort() {

    }
}
