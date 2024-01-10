import java.util.*;

public class PalindromeLinkedList {
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
  public boolean checkPalindrome()
  {
    ArrayList<Integer>   list=new  ArrayList<>();
    Node temp=head;
    while(temp!=null)
    {
      list.add(temp.data);
      temp=temp.next;
      System.out.println(temp);
    }
    int low=0;
    int high=list.size()-1;
    while(low<high)
    {
      if(list.get(low)!=(list.get(high)))
      {
        return false;
      }
      low=low+1;
      high=high-1;
    }
    return true;
  }
  public static void main(String[] args)
  {
    PalindromeLinkedList list=new PalindromeLinkedList();
    list.InsertAtBeginning(1);
    list.InsertAtBeginning(2);
    list.InsertAtBeginning(2);
    list.InsertAtBeginning(2);
    list.InsertAtBeginning(1);
    boolean result=list.checkPalindrome();
    if(result==false)
    {
      System.out.println("It's not a Palindrome linked list");
    }
    else
    {
      System.out.println("it's a Palindrome linked list");
    }
  }
}
