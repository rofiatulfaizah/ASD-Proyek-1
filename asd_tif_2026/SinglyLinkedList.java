/**
 * SinglyLinkedList
 */
public class SinglyLinkedList implements LinkedList{

    public Node head,tail;
    private int size=0;

    public SinglyLinkedList(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return(size==0);
    }
    public int size(){
        return size;
    }
    public void addFirst(Object inputData){
        Node baru = new Node(inputData);
        if (isEmpty()){
            head = baru;
            tail = baru;
            size++;
        }
        else {
            baru.pointer = head;
            head = baru;
            size++;
        }
    }

    public void addLast(Object inputData){
        Node baru = new Node(inputData);
        if (isEmpty()){
            head = baru;
            tail = baru;
            size++;
        }
        else {
            tail.pointer = baru;
            tail = baru;
            size++;
        }
    }

    public void addAfter(int index,Object inputData){
        Node baru = new Node(inputData);
        Node C=head;
        for(int i=0;i<index;i++){
            C = C.pointer;
        }
        baru.pointer = C.pointer;
        C.pointer = baru;
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.err.println("Linked list kosong");
        }
        else if(size==1){//else if(head==tail)
            head = null;
            tail = null;
            size--;
        }
        else{
            head = head.pointer;
            size--;
        }
    }

    public void deleteLast(){
        if(isEmpty()){
            System.err.println("Linked list kosong");
        }
        else if(size==1){//else if(head==tail)
            head = null;
            tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i=1;i<size;i++){
                temp = temp.pointer;
            }
            tail = temp;
            tail.pointer = null;
            size--;
        }
    }

    public void deleteAfter(int index){
        if(isEmpty()){
            System.err.println("Linked list kosong");
        }
        else if(size==1){//else if(head==tail)
            head = null;
            tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.pointer;
            }
            temp.pointer = temp.pointer.pointer;
            size--;
        }
    }

    public void print(){
        Node currentNode = head;
        for(int i =0;i<size;i++){
            System.out.println(currentNode.data);
            currentNode = currentNode.pointer;
        }
    }
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.pointer;
        }
        return current.data;
    }
    @Override
    public int indexOf(Object targetData) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (targetData == null ? current.data == null : targetData.equals(current.data)) {
                return index;
            }
            current = current.pointer;
            index++;
        }
        return -1;
    }
    @Override
    public void printReverse() {
        Object[] arr = toArray();
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    @Override
    public boolean remove(Object targetData) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            if (targetData == null ? current.data == null : targetData.equals(current.data)) {
                if (prev == null) {
                    head = current.pointer;
                } else {
                    prev.pointer = current.pointer;
                }
                if (current == tail) {
                    tail = prev;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.pointer;
        }
        return false;
    }
    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            arr[i] = current.data;
            current = current.pointer;
        }
        return arr;
    }
}