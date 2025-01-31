package circularLinkedList.Practice;

public class cicularlinkedList {
    public class Node{
         int data;
         Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;

    public cicularlinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void AddAtStart(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            newNode.next=head;
        }
        else{
            newNode.next=head;
            head = newNode;
            tail.next=head;
        }
    }
    public void AddAtEnd(int data){
        Node newNode = new Node(data);
        if(tail==null){
            AddAtStart(data);
        }
        else{
         tail.next=newNode;
         tail=newNode;
         tail.next=head;
        }
    }
    public void AddAtIndex(int data,int index){
        int i=1;
        Node newNode = new Node(data);
        if(index==1){
            AddAtStart(data);

        }
        else
        {
            Node temp=head;

            while(temp!=null && i<index-1){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("error");
            }
            else{
                newNode.next=temp.next;
                if(temp.next==head){

                    tail=newNode;
                }
                temp.next=newNode;

            }
        }
    }


    public void Display(){
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while (temp!=head);
    }
    public void DeleteByData(int data){
        if(head==null){
            System.out.println("Sorry");
            return;
        }
        if(head.data==data){
            head=head.next;
            tail.next=head;
            return;
        }

        Node temp=head;
        while(temp!=null && temp.next.data!=data){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("sorry");
            return;
        }
        else{
            if(temp.next.next==head){
                tail=temp;
                tail.next=head;
                return;
            }
            temp.next=temp.next.next;

        }

    }

    public static void main(String[] args) {
        cicularlinkedList listt= new cicularlinkedList();
        listt.AddAtStart(1);
        listt.AddAtStart(2);
        listt.AddAtStart(3);
        listt.AddAtEnd(4);
        listt.AddAtIndex(5,2);
        listt.DeleteByData(4);
        listt.Display();
    }
}

