
public class InsertDeleteTest {
        InsertDeleteTest() {

        Node list = new Node(85);
        list = new Node(65, list);
        list = new Node(45, list);
        list = new Node(25, list);
        print(list);
        insertLast (list, 95);
        print(list);
        deleteLast(list);
        print(list);
        }
        void insertLast (Node list, int v){
            Node newNode = new Node(v);
            while(list.next != null){
                list = list.next;
             }
             list.next = newNode;
        }
        void deleteLast(Node list) {
            while(list.next != null){
                if(list.next.next == null ){
                    list.next = list.next.next;
                }
                else {
                    list = list.next;
                }
                        }

        }

         void print (Node start) {

             for (Node p =start; p != null ;p = p.next)
                 System.out.print(p.data + " ");
             System.out.println();
         }
         public static void main(String[] args) {
             new InsertDeleteTest();
         }
         class Node {
             private int data;
             private Node next;

             public Node(int data) {

                 this.data = data;
             }
             public Node(int data, Node next) {
                 this.data = data;
                 this.next = next;
             }
         }}

