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

public class CircularLinkedList 
{
    private Node head;

    public void insert(int n)
    {
        Node a = new Node(n);
        if (head == null)
        {
            head = a;
            a.next = head;
        }
        else
        {
            Node temp = head;
            while(temp.next != head)
            {
                temp = temp.next;
            }
            a.next = head;
            temp.next = a;
            head = a;
        }
    }

    public void inserttail(int n)
    {
        Node a = new Node(n);
        if(head == null)
        {
            head = a;
            a.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head)
        {
            temp = temp.next;
        }
        temp.next = a;
        a.next = head;
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
        while(c < p-1 && temp.next != head)
        {
            temp = temp.next;
            c++;
        }
        if(c != p-1)
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
        do
        {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != head)
            {
                System.out.print("->");
            }
        } while(temp != head);
    }

    public void reverse()
    {
        if(head == null || head.next == head)
        {
            disp();
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        Node tail = head;
        do
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while(curr != head);
        tail.next = prev;
        head = prev;
        disp();
    }

    public boolean search(int k)
    {
        if(head == null)
            return false;
        Node temp = head;
        do
        {
            if(temp.data == k)
            {
                return true;
            }
            temp = temp.next;
        } while(temp != head);
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
            if(head.next == head)
            {
                head = null;
                System.out.println("Node at position 1 deleted.");
                return;
            }
            Node tail = head;
            while(tail.next != head)
            {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head;
            System.out.println("Node at position 1 deleted.");
            return;
        }

        Node temp = head;
        int c = 1;
        while(c < p-1 && temp.next != head)
        {
            temp = temp.next;
            c++;
        }
        if(temp.next == head || c != p-1)
        {
            System.out.println("Position out of bounds.");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Node at position deleted successfully.");
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
            if(head.next == head)
            {
                head = null;
                System.out.println("Node with data " + val + " deleted.");
                return;
            }
            Node tail = head;
            while(tail.next != head)
            {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head;
            System.out.println("Node with data " + val + " deleted.");
            return;
        }

        Node temp = head;
        while(temp.next != head && temp.next.data != val)
        {
            temp = temp.next;
        }
        if(temp.next == head)
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

        int c = 1;
        Node curr = head;
        while (curr.next != head) 
        {
            curr = curr.next;
            c++;
        }

        k = k % c;
        if(k == 0) return;

        for (int i = 0; i < k; i++) 
        {
            head = head.next;
            curr = curr.next;
        }
        System.out.println("List after rotation:");
        disp();
    }

    public static void main(String[] args)throws IOException
    {
        CircularLinkedList  o = new CircularLinkedList ();
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
