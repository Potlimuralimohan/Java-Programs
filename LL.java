public class LL {
    class Node{
        String data;
        Node next;
        //constructor.

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //add -first,last.
    public void addfirst(String data)
    {
        Node newNode =new Node(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        LL list =new LL();
        list.addfirst("a");
        list.addfirst("is");

    }
}
