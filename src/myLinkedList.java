public class myLinkedList {
    private LLnode head, tail;
    private int size = 0;

    public myLinkedList()
    {
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void addIn(int i, int ind){
        if(ind == 0) {
            addFront(i);
        }
        else if(ind >= size)
            addBack(i);
        else {
            LLnode newNode = new LLnode(i);
            LLnode helpPtr = head;
            while (ind - 1 > 0)
            {
                helpPtr = helpPtr.next;
                ind--;
            }
            newNode.next = helpPtr.next;
            helpPtr.next = newNode;
            size++;
        }
    }

    public void addFront(int i){
        head = new LLnode(i, head);
        size++;
    }
    public void addBack(int i)
    {
        if(isEmpty()) {
            addFront(i);
        }
        else {
            LLnode helpPtr = head;
            while (helpPtr.next != null) {
                helpPtr = helpPtr.next;
            }
            helpPtr.next = new LLnode(i);
            tail = helpPtr.next;
            size++;
        }
    }
    public void deleteFront()
    {
        if(isEmpty())
            System.out.println("Empty List, Nothing to delete");
        else {
            head = head.next;
            size--;
        }
    }
    public void deleteBack()
    {
        if(isEmpty())
            System.out.println("Empty List, Nothing to delete.");
        else if (size == 1) {
            deleteFront();
        }
        else {
            LLnode helpPtr = head;
            while (helpPtr.next.next != null) {
                helpPtr = helpPtr.next;
            }
            helpPtr.next = null;
            size--;
        }
    }
    public void delete(int ind)
    {
        if(isEmpty())
            System.out.println("Empty List, Nothing to delete.");
        else if (ind == 0) {
            deleteFront();
        }
        else if (ind >= size) {
            System.out.println("Index not found, Out of Range.");
        }
        else {
            LLnode helpPtr = head;
            while (ind - 1 > 0) {
                helpPtr = helpPtr.next;
                ind--;
            }
            helpPtr.next = helpPtr.next.next;
            size--;
        }
    }
    public void print(){
        if(isEmpty())
            System.out.println("Empty List, nothing to display.");
        else {
            LLnode helpPtr = head;
            while (helpPtr != null) {
                System.out.println(helpPtr.id);
                helpPtr = helpPtr.next;
            }
        }
    }
    public int get_size()
    {
        return size;
    }
    public void sort()
    {
        LLnode ptr1 = head;
        for(int i = 0; i < size; ++i){
            LLnode ptr2 = ptr1.next;
            for(int j = i + 1; j < size; ++j){
                //if(ptr1.)
            }
        }
    }
    public void addToSortedList(int v)
    {
        if(head.id > v || isEmpty()){
            addFront(v);
        }
        else {
            LLnode helpPtr = head;
            while(helpPtr.next != null){
                if (helpPtr.next.id > v)
                    break;
                helpPtr = helpPtr.next;
            }
            helpPtr.next = new LLnode(v, helpPtr.next);
            size++;
        }
    }
    public void deleteNodesAfter(int v){// delete after equal node
        if(isEmpty()){
            System.out.println("Can't delete from an empty list");
        }
        else if(search(v)) {
            LLnode helpPtr = head;
            if (head.id == v){
                head.next = head.next.next;
            }
            else {
                while (helpPtr.next != null) {
                    if (helpPtr.id == v)
                        helpPtr.next = helpPtr.next.next;
                    helpPtr = helpPtr.next;
                    if(helpPtr.next == null && helpPtr.id == v)
                        System.out.println("there is no node to delete after that.");
                }
                System.out.println("node had been deleted successfully");
            }
        }
        else
            System.out.println("Can't Added,no node with that value.");
    }
    public void addNodesAfter(int v){// add after its divisor by 2
        if(isEmpty()){
            System.out.println("Can't added to an empty list");
        }
        else if(search(v)) {
            LLnode helpPtr = head;
            if (head.id == v){
                head.next = new LLnode(v*2, head.next);
            }
            else {
                while (helpPtr.next != null) {
                if (helpPtr.id == v) {
                    helpPtr.next = new LLnode(v*2, helpPtr.next);
                }
                helpPtr = helpPtr.next;
                }
                System.out.println("node had been added successfully");
            }
        }
            else
                System.out.println("Can't added, no node with that value.");
    }
    public void deleteFromSortedList(int v)
    {
        if(!isEmpty()) {
            if (head.id == v)
                head = head.next;
        }
        else {
            LLnode helpPtr = head;
            while(size > 0){
                if (helpPtr.next.id == v) {
                    helpPtr.next = helpPtr.next.next;
                    break;
                }
                //helpPtr = helpPtr.next;
                size--;
            }
        }
    }
    public boolean search(int value){
        LLnode helpPtr = head;
        while(helpPtr != null){
            if(helpPtr.id == value)
                return true;
            helpPtr = helpPtr.next;
        }
        return false;
    }
    public int countEvenNodes(){
        LLnode helpPtr = head;
        int c = 0;
        while(helpPtr != null){
            if(helpPtr.id % 2 == 0)
                c++;
            helpPtr = helpPtr.next;
        }
        return c;
    }
    public int countOddNodes(){
        return size - countEvenNodes();
    }
    public void printEvenNodes()
    {
        if(isEmpty())
            System.out.println("Empty list, nothing to display");
        else {
            LLnode helpPtr = head;
            while (helpPtr != null) {
                if (helpPtr.id % 2 == 0)
                    System.out.println(helpPtr.id + " ");
                helpPtr = helpPtr.next;
            }
        }
    }
    public void swapFirstLast()
    {
        if(size < 2)
            System.out.println("Can't swap, list has less than two nodes.");
        else if (size == 2) {
            LLnode tmp = head, helpPtr = head.next;
            helpPtr.next = head;
            head = helpPtr;
            tmp.next = null;
        } else {
            LLnode helpPtr = head;
            while(helpPtr.next.next != null){
                helpPtr = helpPtr.next;
            }
            LLnode tmp = head;
            helpPtr.next.next = head.next;
            head = helpPtr.next;
            helpPtr.next = tmp;
            tmp.next = null;
        }
    }

}
