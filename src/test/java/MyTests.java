import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTests {

    @Test
    public void addHeadTest(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        assertEquals("Added head node with element one", myList.addFirst("element one"));
    }
}
