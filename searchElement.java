import java.util.*;
public class searchElement {
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
  public void searchElement(int ele)
  {
    if(head==null)
    {
      System.out.println("No");
      return;
    }
    else
    {
      int c=0;
      Node temp=head;
      while (temp!=null) 
      {
       if(temp.data==ele)
       {
        c=1;
        break;
       }
       temp=temp.next;
      }
      if(c==1)
      {
        System.out.println("yes");
        return;
      }
      else
      {
        System.out.println("No");
      }
    }
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
    searchElement List=new searchElement();
    List.InsertAtBeginning(2);
    List.InsertAtBeginning(4);
    List.InsertAtBeginning(5);
    List.InsertAtBeginning(6);
    List.searchElement(5);
    
  }
}

