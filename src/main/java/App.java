public class App {
    public static void main(String[] args) {
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        myList.addFirst("element one");
        myList.addFirst("element two");
        myList.addFirst("element three");
        while(!myList.isEmpty()){
            myList.removeFirst();
        }

    }
}
