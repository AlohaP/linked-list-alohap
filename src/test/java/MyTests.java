import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTests {

    @Test
    public void addHeadTest(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        assertEquals("Added head node with element one", myList.addFirst("element one"));
    }

    @Test
    public void sizeAndRemoveTest() {
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        myList.addFirst("Orange");
        myList.addFirst("Pineapple");
        assertEquals(2, myList.getSize());
        myList.removeFirst();
        assertEquals(1, myList.getSize());
    }
}
