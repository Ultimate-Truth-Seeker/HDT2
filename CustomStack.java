/**
 * Clase Custom Stack trabajada en clase
 * @version 17-01-2024
 */
public class CustomStack<T> {
    private Node<T> lastnode;
    private Node<T> firstnode;
    public void push(T value) {
        if (lastnode == null) {
            lastnode = new Node<T>(value);
            firstnode = lastnode;
        } else {
            Node<T> current = new Node<T>(value);
            current.setNext(firstnode);
            firstnode = current;
        }
    }
    public T pop() {
        if (firstnode != null) {
            T value = firstnode.getValue();
            firstnode = firstnode.getNext();
            return value;
        }
        return null;
    }
}