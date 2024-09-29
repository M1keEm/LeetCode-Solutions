import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Node {
    int freq;
    Node prev;
    Node next;
    Set<String> keys = new HashSet<>();

    Node(int freq) {
        this.freq = freq;
    }
}

class AllOne {

    Node head;
    Node tail;
    Map<String, Node> map = new HashMap<>();

    AllOne() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    public void inc(String key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            int freq = node.freq;
            node.keys.remove(key);

            Node nextNode = node.next;
            if (nextNode == tail || nextNode.freq != freq + 1) {
                Node newNode = new Node(freq+1);
                newNode.keys.add(key);
                newNode.prev = node;
                newNode.next = nextNode;
                node.next = newNode;
                nextNode.prev = newNode;
                map.put(key, newNode);
            }else{
                nextNode.keys.add(key);
                map.put(key, nextNode);
            }

//            if (node.keys.isEmpty()) {
//                removeNode(node);
//            }
        } else {
            Node firstNode = head.next;
            if (firstNode == tail || firstNode.freq > 1) {
                Node newNode = new Node(1);
                newNode.keys.add(key);
                newNode.prev = head;
                newNode.next = firstNode;
                head.next = newNode;
                firstNode.prev = newNode;
                map.put(key, newNode);
            } else {
                firstNode.keys.add(key);
                map.put(key, firstNode);
            }
        }
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}
