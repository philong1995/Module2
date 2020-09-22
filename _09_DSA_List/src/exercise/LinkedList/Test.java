package exercise.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(0);
        list.add(1, 2);
        list.add(2,"Phi Long");
        list.add(3,4);
        list.add(4,5);
        System.out.println(list.indexOf("Phi Long"));
    }
}
