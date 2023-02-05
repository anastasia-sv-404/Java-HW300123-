import java.util.LinkedList;
//Реализуйте очередь с помощью LinkedList со следующими методами
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class NewClass {
    private LinkedList<Integer> linkedList;

    NewClass(){
        linkedList = new LinkedList<Integer>();
    }

    void enqueue (int element){
        linkedList.addLast(element);
    }

    boolean empty(){
        return linkedList.isEmpty();
    }
    Object dequeue(){
        if (empty()) {
            return null;
        }
        int firstElement = linkedList.getFirst();
        linkedList.removeFirst();
        return firstElement;
    }

    Object first(){
        if (empty()) {
            return null;
        }
        return linkedList.getFirst();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (int item : linkedList){
             sb.append(item);
             sb.append(" ");
        }

        return String.valueOf(sb);
    }

}
