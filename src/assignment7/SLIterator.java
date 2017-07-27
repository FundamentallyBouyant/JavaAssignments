package assignment7;

/**
 * Created by Jay Dadhania on 24/7/17.
 */

/**
 * Iterator for the singly linked list
 * @param <U>
 */
class SLIterator<U> {
    Node<U> current;
    SLIterator(Node<U> node){
        current = node;
    }
    public Node<U> next(){
            current = current.next;
            return current;
    }
    public void insert(U item){
        current.next = new Node(item,current.next);
        current = current.next;
    }
    public void delete(){
        if(current.next!=null){
            current.next = current.next.next;
        }
    }
    public Boolean hasNext(){
        return current.next!=null;
    }
}
