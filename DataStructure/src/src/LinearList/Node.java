package src.LinearList;

/**
 * 链表节点
 * Created by Eddy on 2016/3/8.
 */
public class Node<E> {
    public E element ;
    public Node<E> next ;

    public Node(E element,Node<E> next){
        this.element = element;
        this.next = next;
    }

    public Node(E element){
        this.element = element;
        this.next = null;
    }
}
