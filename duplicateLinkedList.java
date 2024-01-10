import java.util.*;

public class duplicateLinkedList {
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
    public void deleteDuplicateElement()
    {
      ArrayList<Integer> List=new ArrayList<>();
      ArrayList<Integer> List1=new ArrayList<>();
      Node temp=head;
      while(temp!=null)
      {
        List.add(temp.data);
        temp=temp.next;
      }
      Collections.sort(List);
      for(int i=0;i<List.size()-1;i++)
      {
        if(List.get(i)!=List.get(i+1))
        {
          List1.add(List.get(i));
        }
      }
      List1.add(List.get(List.size()-1));
      for(int i=0;i<List1.size();i++)
      {
        System.out.print(List1.get(i)+" ");
      }
    }
    public static void main(String[] args)
    {
      duplicateLinkedList list=new duplicateLinkedList();
      list.InsertAtBeginning(3);
      list.InsertAtBeginning(3);
      list.InsertAtBeginning(2);
      list.InsertAtBeginning(1);
      list.InsertAtBeginning(1);
      list.deleteDuplicateElement();
      
    }
  }


  

  