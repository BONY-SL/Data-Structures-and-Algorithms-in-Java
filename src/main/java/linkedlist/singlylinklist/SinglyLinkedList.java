package linkedlist.singlylinklist;

import java.util.Scanner;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{

        private final int dataValue;
        private ListNode next;

        public ListNode(int dataValue) {
            this.dataValue = dataValue;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Get the length of the list");
            System.out.println("4. Display the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert at the beginning: ");
                    int beginValue = scanner.nextInt();
                    singlyLinkedList.insertBegin(beginValue);
                    break;
                case 2:
                    System.out.print("Enter the value to insert at the end: ");
                    int endValue = scanner.nextInt();
                    singlyLinkedList.insertEnd(endValue);
                    break;
                case 3:
                    System.out.println("Length of the list: " + singlyLinkedList.getLength());
                    break;
                case 4:
                    System.out.println("List contents:");
                    singlyLinkedList.displaySinglyLinkedList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    // display Singly Linked List
    public void displaySinglyLinkedList(){

        ListNode current = head;

        while (current != null){
            System.out.print(current.dataValue + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // get length
    public int getLength(){

        int count = 0;
        ListNode current = head;

        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    // Insert data for beginning
    public void insertBegin(int data){

        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert data for End
    public void insertEnd(int data){

        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

}
