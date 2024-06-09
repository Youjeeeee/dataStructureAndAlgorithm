package linkedList;

public class LinkedList {
    Node currentNode;

    public void add(Node head, Node nextNode) {
        head.nextNode = nextNode;
    }

    public Node search(Node nowNode, String data) {
        while (!nowNode.data.equals(data)) {
            if (nowNode.nextNode == null) {
                return null;
            }

            nowNode = nowNode.nextNode;
        }
        return nowNode;
    }

    public void nextNodeDelete(Node nowNode, String data) {
        while (!nowNode.data.equals(data)) {
            if (nowNode.nextNode == null) {
                break;
            }

            nowNode = nowNode.nextNode;
        }
        nowNode.setNextNode(null);
    }
}
