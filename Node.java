/**
 * Clase nodo trabajada en clase
 * @version 17-01-2024
 */
public class Node <T> {
    T value;
    Node<T> next;
    
    public Node(T val) {
        value = val;
        next = null;
    }
    public T getValue() {
        return value;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setValue(T newValue) {
        value = newValue;
    }
    public void setNext(Node<T> value) {
        next = value;
    }
}
