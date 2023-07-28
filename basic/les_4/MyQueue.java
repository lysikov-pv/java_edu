package basic.les_4;

import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> elements = new LinkedList<>();

    public MyQueue() { }
    public MyQueue(LinkedList<E> linkedList) {
        this.elements = linkedList;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (E element : this.elements) {
            result.append(element).append(", ");
        }
        return result
            .append("]")
            .toString()
            .replace(", ]", "]");
    }

    /**
     * Помещает элемент в конец очереди
     */
    public boolean enqueue(E element) {
        return this.elements.add(element);
    }

    /**
     * Возвращает первый элемент из очереди и удаляет его
     */
    public E dequeue() {
        if (this.elements.size()==0)
            throw new RuntimeException("Очередь пуста.");
        return this.elements.pop();
    }

    /**
     * Возвращает первый элемент из очереди и удаляет его
     */
    public E first() {
        if (this.elements.size()==0)
            throw new RuntimeException("Очередь пуста.");
        return this.elements.getFirst();
    }

    
    
}