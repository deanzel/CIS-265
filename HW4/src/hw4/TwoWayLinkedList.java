/*Dean Choi
CSU ID: 2690159
2). Implement a TwoWayLikedList class that uses a doubly linked list to store elements.*/
package hw4;

import java.util.*;

public class TwoWayLinkedList<E> extends AbstractSequentialList<E> {

    public static class Node<E> {

        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E e) {
            element = e;
        }
    }
    int size = 0;
    private Node<E> head, tail;

    public TwoWayLinkedList() {
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        newNode.previous = null;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            newNode.next = null;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            current.next.previous = current;
            current.next.next = temp;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            } else {
                head.previous = null;
            }
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> temp = tail;
            tail = tail.previous;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            previous.next.previous = previous;
            size--;
            return current.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }
        return result.toString();
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public boolean contains(E e) {
        if (size == 0) {
            return false;
        } else {
            Node<E> tmp = head;
            while (tmp != null) {
                if (tmp.element.equals(e)) {
                    return true;
                } else {
                    tmp = tmp.next;
                }
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.element;
    }

    @Override
    public int indexOf(E e) {
        if (size == 0) {
            return -1;
        } else {
            Node<E> tmp = head;
            int result = 0;
            while (tmp != null) {
                if (tmp.element.equals(e)) {
                    return result;
                } else {
                    tmp = tmp.next;
                    result++;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        if (size == 0) {
            return -1;
        } else {
            Node<E> tmp = tail;
            int result = size - 1;
            while (tmp != null) {
                if (tmp.element.equals(e)) {
                    return result;
                } else {
                    tmp = tmp.previous;
                    result--;
                }
            }
        }
        return -1;
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        Node<E> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.element = e;
        return e;
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                    + size);
        }
    }

    private class LinkedListIterator implements java.util.Iterator<E> {

        private Node<E> current = head;
        @Override
        public boolean hasNext() {
            return (current != null);
        }
        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }
        @Override
        public void remove() {
            if (current != null) {
                Node<E> tmp = current;
                current = current.next;
                size--;
                if (tmp.next != null) {
                    tmp.next.previous = tmp.previous;
                }
                if (tmp.previous != null) {
                    tmp.previous.next = tmp.next;
                }
            }

        }
    }
}
