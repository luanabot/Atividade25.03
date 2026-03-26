package br.edu.faseh.lista;

public class FasehList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode; // 🔥 novo
    private int totalElements;

    private Node<T> getNewNode(T value) {
        return new Node<>(value);
    }

    public void insertAtBeginning(T value) {
        Node<T> newNode = getNewNode(value);
        newNode.setNext(firstNode);
        firstNode = newNode;

        if (lastNode == null) { // 🔥 lista vazia
            lastNode = newNode;
        }

        totalElements++;
    }

    public void insertAtTheEnd(T value) {
        Node<T> newNode = getNewNode(value);

        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode); // 🔥 sem while
            lastNode = newNode;
        }

        totalElements++;
    }

    public Node<T> removeAtBeginning() {
        if (firstNode == null) return null;

        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();

        if (firstNode == null) { // 🔥 ficou vazia
            lastNode = null;
        }

        totalElements--;
        return aux;
    }

    @Override
    public String toString() {
        if (this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");
            currentNode = currentNode.getNext();
        }

        builder.delete(builder.length()-2, builder.length());
        builder.append("]");

        return builder.toString();
    }
}