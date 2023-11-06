//class Node<T> {
//    T val;
//    Node<T> next;
//
//    public Node(T val) {
//      this.val = val;
//      this.next = null;
//    }
//  }
//
//  class Source {
//    public static <T>  Node<T> reverseList(Node<T> head)
//    {
//            Node prev = null;
//            Node current = head;
//            Node next = null;
//            while (current != null) {
//                next = current.next;
//                current.next = prev;
//                prev = current;
//                current = next;
//            }
//            head = prev;
//
//
//      // todo
//      return head;
//    }
//
//    public static void main(String[] args) {
//        Node<String> x = new Node<>("x");
//        Node<String> y = new Node<>("y");
//        Node<String> z = new Node<>("z");
//
//        x.next = y; // x -> y
//        y.next = z;
//
//        // y -> x
//
//        // Printing solution
//        Node<String> head = Source.reverseList(x);
//
//        while (head != null) {
//            System.out.println(head.val);
//            head = head.next;
//        }
//    }
//  }