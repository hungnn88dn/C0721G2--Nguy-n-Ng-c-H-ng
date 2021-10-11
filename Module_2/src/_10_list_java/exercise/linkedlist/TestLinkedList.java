package _10_list_java.exercise.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>(10);
        linkedList.addFirst(3);
        linkedList.add(0,2);
        linkedList.add(1,5);
        linkedList.add(2,4);
        linkedList.remove(2);
        linkedList.addLast(1);
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains(3));
        System.out.println(linkedList.indexOf(2));
        System.out.println("------------------");
        for( int i =0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
