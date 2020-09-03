package doublelinkedlist;

public class Node {

    Object value;
    Node next;
    Node previous;
   
    public Node (Object n_value, Node n_next,Node n_previous)
    {
        this.value=n_value;
        this.next=n_next;
        this.previous=n_previous;
    }
}


package doublelinkedlist;

public class DoubleLinkedList<T> {
    Node headNode;
    
    
    public DoubleLinkedList()//Constructor method varsayılan yapıcı metot 
    {
        headNode=null;
    }
    public void add(Object val)
    {
        Node newnode=new Node(val, null, null);
        if(headNode==null)
        {
            headNode=newnode;
        }
        else
        {
            newnode.next=headNode;
            headNode.previous=newnode;
            headNode=newnode;
        }
    }
    public void delete()
    {
        headNode=headNode.next;
        headNode.previous=null;
    }
    public void display()
    {
        Node n=headNode;
        while(n!=null)
                {
                    System.out.println(n.value);
                    n=n.next;
                }
    }
}


package doublelinkedlist;

 





package doublelinkedlist;
public class DoubleLınkedListTest {
    
    public static void main(String [] args)
    {
       DoubleLinkedList <String> d_list=new DoubleLinkedList <>();
       System.out.println("..................");
        d_list.add("Canan");
        d_list.add("BATUR");
        d_list.add("ŞAHİN");
        d_list.display();
         System.out.println("..................");
        d_list.delete();
        d_list.display();
        System.out.println("..................");
        d_list.delete();
        d_list.display();
        System.out.println("..................");
    }
    
}
