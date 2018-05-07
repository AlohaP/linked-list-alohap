public class SinglyLinkedList<T> {

    private static class Node<T>{

        private T element;
        private Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement(){ //Retrieves data stored on node
            return element;
        }

        public Node getNext(){ //Allows us to retrieve the pointer
            return next;
        }

        public void setNext(Node<T> next) { //Allows us to set pointer to different node
           this.next = next;
        }

    }
    // List Implementation

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList(){}

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){  //This function returns true
        return size == 0;
    }

    public T first(){
        if(isEmpty()){
            return null;        //If list is empty we return nothing
        }
        return head.getElement(); //If is not empty we return value from our head node
    }

    public T last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(T element){
        head = new Node<T>(element, head); //Creating new node which point into starting head
        if(size==0){
            tail = head;
        }
        size++;
        System.out.println("Added head node with" + head.getElement());
    }

    public void addLast(T element){
        Node<T> newNode = new Node<T>(element, null); //As tail is last element it points to nothing
        if(isEmpty()){
            head = newNode;  //If we have no other elements
        } else {
            tail.setNext(newNode);
        }
    }
}

