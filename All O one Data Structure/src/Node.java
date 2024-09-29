import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Node{
    int freq;
    Node prev;
    Node next;
    Set<String> keys = new HashSet<>();

    Node(int freq){
        this.freq = freq;
    }
}

class AllOne{

    Node head;
    Node tail;
    Map<String, Node> map = new HashMap<>();

    AllOne(){
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }
}
