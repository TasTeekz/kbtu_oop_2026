package lab3.problem3.model;

public class MySet<E> implements MyCollection<E> {
    private Object[] elements;
    private int size;

    public MySet() {
        this.elements = new Object[10];
        this.size = 0;
    }

    @Override
    public boolean add(E element) {
        if (contains(element)) {
            return false;
        }
        if (size == elements.length) {
            expand();
        }
        elements[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[10];
    }

    private void expand() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }
}
