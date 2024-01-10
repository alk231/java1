import java.util.*;
public class InsertNode {
  Node head;
  class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public void InsertAtBeginning(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
    {
      head=newNode;
    }
    else
    {
      newNode.next=head;
      head=newNode;
    }
  }
  public void InsertNode(int pos,int value)
  {
    Node newNode=new Node(value);
    if(head==null)
    {
      head=newNode;
    }
    Node temp=head;
    for(int i=0;i<pos-1;i++)
    {
      temp=temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    return;
  }
  public void display()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
  public static void main(String[] args)
  {
    InsertNode list=new InsertNode();
    list.InsertAtBeginning(6);
    list.InsertAtBeginning(5);
    list.InsertAtBeginning(4);
    list.InsertAtBeginning(2);
    list.InsertAtBeginning(1);
    list.InsertNode(2, 3);
    list.display();
  }
}
