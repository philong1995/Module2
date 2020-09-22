package exercise.LinkedList;

public class MyLinkedList {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNode = 0;

    public MyLinkedList(){

    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
//            Chaỵ đến phần tử cuối cùng của danh sách.
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
        }
    }

    public void remove(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }

        numNode--;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        System.out.println(temp.data);
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                return true;
            }
                temp = temp.next;
            }
        return false;
        }

    public int indexOf(Object data) {
        Node temp = head;
        int q = -1;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                q = i;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return q;
    }
}
