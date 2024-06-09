import linkedList.LinkedList;
import linkedList.Node;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Node node1 = new Node("aa"); //head
        Node node2 = new Node("bb");
        Node node3 = new Node("cc"); //tail

        LinkedList linkedList = new LinkedList();

        linkedList.add(node1, node2);
        linkedList.add(node2, node3);

        Node searchedNode = linkedList.search(node1, "dd");
        if (searchedNode != null) {
            System.out.println(searchedNode.getData());
        } else {
            System.out.println("No such a Node");
        }
    }
}