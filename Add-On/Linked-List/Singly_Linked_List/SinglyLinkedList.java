import java.io.*;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList 
{
    private Node head;

    public void insert(int n)
    {
        Node a = new Node(n);
        a.next = head;
        head = a;
    }

    public void inserttail(int n)
    {
        Node a = new Node(n);
        if(head == null)
        {
            head = a;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = a;
    }

    public void ipos(int p, int a)
    {
        if(p==1)
        {
            insert(a);
            return;
        }
        Node b = new Node(a);
        Node temp = head;
        int c = 1;
        while(c<p-1 && temp != null)
        {
            temp = temp.next;
            c++;
        }
        if(temp == null)
        {
            System.out.println("Position out of bounds.");
            return;
        }

        b.next = temp.next;
        temp.next = b;
    }

    public void disp()
    {
        if(head == null)
        {
            System.out.println("Nothing to show.");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data);
            if (temp.next != null) 
            {
                System.out.print("->");
            }
            temp = temp.next;
        }
    }

    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        disp();
    }

    public boolean search(int k)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == k)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void dpos(int p)
    {
        if(head == null)
        {
            System.out.println("Nothing to delete.");
            return;
        }
        if(p==1)
        {
            head = head.next;
            System.out.println("Node at position 1 deleted.");
            return;
        }

        Node temp = head;
        int c = 1;
        while(c<p-1 && temp != null)
        {
            temp = temp.next;
            c++;
        }
        if(temp == null || temp.next == null)
        {
            System.out.println("Position out of bounds.");
            return;
        }
        else
        {
            temp.next = temp.next.next;
            System.out.println("Node at position deleted successfully.");
        }
    }

    public void delete(int val)
    {
        if(head == null)
        {
            System.out.println("Nothing to delete.");
            return;
        }
        if(head.data == val)
        {
            head = head.next;
            System.out.println("Node with data " + val + " deleted.");
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != val)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            System.out.println("Node not found.");
        }
        else
        {
            temp.next = temp.next.next;
            System.out.println("Node with data " + val + " deleted.");
        }
    }

    public void rotate(int k) {
        if (k == 0 || head == null)
        {
            return;
        }

        Node curr = head;
        int c = 1;
        while (curr.next != null) 
        {
            curr = curr.next;
            c++;
        }
        curr.next = head; 

        k = k % c;
        for (int i = 0; i < c - k; i++) 
        {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;

        System.out.println("List after rotation:");
        disp();
    }

    public static void main(String[] args)throws IOException
    {
        SinglyLinkedList o = new SinglyLinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("\n----- Linked List Menu -----");
            System.out.println("1. Insert Node");
            System.out.println("2. Display");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert at Tail");
            System.out.println("5. Reverse the List");
            System.out.println("6. Search ");
            System.out.println("7. Delete Node ");
            System.out.println("8. Delete at position ");
            System.out.println("9. Rotate the List");
            System.out.println("10. Exit");
            System.out.print("\nEnter your Choice: ");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    {
                        System.out.print("\nEnter Node to insert: ");
                        int n = Integer.parseInt(br.readLine());
                        o.insert(n);
                        break;
                    }
                case 2:
                    {   
                        System.out.print("\nLinked List: ");
                        o.disp();
                        break;
                    }
                case 3:
                    {
                        System.out.print("\nEnter Position to insert node: ");
                        int p = Integer.parseInt(br.readLine());
                        System.out.print("\nEnter data: ");
                        int n = Integer.parseInt(br.readLine());
                        o.ipos(p,n);
                        break;
                    }
                case 4:
                    {
                        System.out.print("\nEnter Node to insert at tail: ");
                        int n = Integer.parseInt(br.readLine());
                        o.inserttail(n);
                        break;
                    }
                case 5:
                    {
                        System.out.print("\nReversed List: ");
                        o.reverse();
                        break;
                    }
                case 6:
                    {
                        System.out.print("\nEnter Node to Search: ");
                        int n = Integer.parseInt(br.readLine());
                        Boolean f = o.search(n);
                        System.out.print(f ? "Node found." : "Node not found");
                        break;
                    }
                case 7:
                    {
                        System.out.print("\nEnter Node to Delete: ");
                        int n = Integer.parseInt(br.readLine());
                        o.delete(n);
                        break;
                    }
                case 8:
                    {
                        System.out.print("\nEnter position to Delete: ");
                        int n = Integer.parseInt(br.readLine());
                        o.dpos(n);
                        break;
                    }
                case 9:
                    {
                        System.out.print("\nEnter position to rotate: ");
                        int n = Integer.parseInt(br.readLine());
                        o.rotate(n);
                        break;
                    }
                case 10:
                    {
                        System.out.println("Exiting....");
                        return;
                    }
                default:
                    {
                        System.out.println("Invalid choice!!!");
                        break;
                    }
            }
        }
    }
}
