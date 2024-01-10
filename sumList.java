public class sumList {
  static Node head1;
  static Node head2;
  static Node head3;
  static class Node {
    int data;
    Node next;
    
    Node(int d) {
      data = d;
      next = null;
    }
  }
  public static void InsertAtBeginning(int data)
    {
      Node newNode=new Node(data);
        newNode.next=head3;
        head3=newNode;

      }
  public static Node ResultantList(Node head1,Node head2) {

    String result = "";
    String result1="";
    int result2;
    Node temp = head1;
    while (temp != null) {
      result = result + temp.data;
      temp = temp.next;
    }
    Node temp1=head2;
    while(temp1!=null)
    {
      result1= result1+ temp1.data;
      temp1=temp1.next;
    }
    result2=Integer.parseInt(result)+Integer.parseInt(result1);
    while(result2>0)
    {
      int rem=result2%10;
      InsertAtBeginning(rem);
      result2=result2/10;
    }
    return head3;
  }
  public static void display(Node head3)
  {
    Node temp=head3;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }

  public static void main(String[] args) {
    sumList list1 = new sumList();
    sumList list2 = new sumList();
    list1.head1 = new Node(7);
    list1.head1.next = new Node(5);
    list1.head1.next.next = new Node(9);
    list2.head1.next.next.next = new Node(4);
    list2.head1.next.next.next.next= new Node(6);
    list2.head2 = new Node(8);
    list2.head2.next = new Node(4);
    Node temp3=ResultantList(list1.head1,list2.head2);
    display(temp3);
  }
}

