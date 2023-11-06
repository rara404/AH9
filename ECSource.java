import java.util.HashMap;
import java.util.Map;

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class ECSource {

    static Map<String, Integer> map = new HashMap<>();

    public static <T> boolean isUnivalueList(Node<T> head) {

        while (head != null) {
            if (map.containsKey(head.val))
                return false;
            else
                map.put((String) head.val, map.getOrDefault(head.val, 0) + 1);

            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));
    }
}
