package crackingCodingInterview.linkedLists;

public class CircularLinkdedList {
    Node head = null;
    Node tail = null;

    class Node{
        int value;
        Node nextNode;
        Node(int value){
            this.value = value;
        }
    }

    private void add(int i) {
        Node newNode = new Node(i);
        if (head == null){
            head = newNode;
        }else {
            tail.nextNode = newNode;
        }
        tail = newNode;
        tail.nextNode = head;
    }

    private boolean find(int value){
        Node currentNode = head;
        if (head == null){
            return false;
        }else{
            do{
                if(currentNode.value == value){
                    return true;
                }
                currentNode = currentNode.nextNode;
            }while (currentNode != head);
            return false;
        }
    }

    private void delete(int value) {
        Node currentNode = head;

        if (head != null) {
            if (currentNode.value == value) {
                head = head.nextNode;
                tail.nextNode = head;
            } else {
                do {
                    Node nextNode = currentNode.nextNode;
                    if (nextNode.value == value) {
                        currentNode.nextNode = nextNode.nextNode;
                        break;
                    }
                    currentNode = currentNode.nextNode;
                } while (currentNode != head);
            }
        }
    }

    private void traverseList(){
        System.out.print("Traverse List : ");
        Node currentNode = head;
        if(head !=null){
            do{
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.nextNode;
            }while(currentNode != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkdedList cl = new CircularLinkdedList();
        cl.add(1);
        cl.add(2);
        cl.add(4);
        cl.add(5);
        cl.add(6);
        System.out.println("Element found : " +cl.find(41));
        cl.traverseList();
        cl.delete(6);
        cl.traverseList();
    }


}
