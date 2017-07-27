package assignment7;

/**
 * Created by Jay Dadhania on 18/7/17.
 */
public class SList<U> {
    private Node<U> head = new Node(null,null);

    /**
     * Iterator method for linked list
     * @return A SLIterator class
     */
    SLIterator<U> iterator() {
        return new SLIterator<U>(head);
    }

    /**
     * Method to convert linked list to string
     * @return String
     */
    public String toString(){

        String s = "SList : { ";
        SLIterator it = new SLIterator(this.head);
        while(it.hasNext()){
//                System.out.println(it.current.item);
                s += it.next().item.toString();
                if(it.hasNext()) s+=","; else s+=" }";
        }
        return s;
    }
}




