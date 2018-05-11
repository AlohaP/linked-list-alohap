class Node<T> {

        private T element;
        private Node<T> next;

        Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        T getElement(){ //Retrieves data stored on node
            return element;
        }

        Node getNext(){ //Allows us to retrieve the pointer
            return next;
        }

        void setNext(Node<T> next) { //Allows us to set pointer to different node
            this.next = next;
        }
}
