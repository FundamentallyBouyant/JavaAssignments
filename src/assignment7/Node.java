package assignment7;

/**
 * Created by Jay Dadhania on 24/7/17.
 */

/**
 * Node class for the linked list
 * @param <U>
 */
class Node<U> {
    U item;
    Node<U> next;

    Node(U item, Node<U> next) {
        this.item = item;
        this.next = next;
    }
    Node(U item){
        this(item,null);
    }
}