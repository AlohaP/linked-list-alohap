public class SinglyLinkedList<T> {

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
        return head.getElement();                              //If is not empty we return value from our head node
    }

    public T last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    public String addFirst(T element){
        head = new Node<T>(element, head);                    //Creating new node which point into starting head
        if(size==0){
            tail = head;
        }
        size++;                                              //size of list is increasing
        return "Added head node with " + head.getElement();
    }

    public void addLast(T element){
        Node<T> newNode = new Node<T>(element, null);  //As tail is last element it points to nothing
        if(isEmpty()){
            head = newNode;                                 //If we have no other elements, head is going new element
        } else {
            tail.setNext(newNode);                          //If its not empty tail points to newly create node
        }
        tail = newNode;                                     //adressing tail
        size++;                                             //size of list is increasing
        System.out.println("Added head node with " + tail.getElement());

    }

    public T removeFirst(){
        if(isEmpty()){ return null; }
        T answer = head.getElement();                       // we take the head out
        head = head.getNext();                              // move pointer to next element
        size--;
        if (size == 0){
            tail = null;                                    //if list is empty tail has null value
        }
        System.out.println("Remove head node with " + answer);
        return answer;
    }
}

