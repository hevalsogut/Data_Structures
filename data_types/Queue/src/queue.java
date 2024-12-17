import java.util.LinkedList;
import java.util.Queue;

public class queue {
  public static void main(String[] args) {
    // ****************************************** */
    // Queue: FIFO. First In First Out(Exapmle: A Line of people)
    // stores objects into a sort of "horizontal line"

    // add = enqueue, offer()
    // remove = dequeue, poll()

    // ****************************************** */
    Queue<String> queue = new LinkedList<String>();
    queue.offer("G");
    queue.offer("Ü");
    queue.offer("L");
    queue.offer("F");
    queue.offer("E");
    queue.offer("M");
    // queue.poll();
    // queue.poll();
    // queue.poll();
    // queue.poll();

    // System.out.println(queue);
    // System.out.println(queue.isEmpty());
    // System.out.println(queue.contains("Harold"));

    Queue<Integer> queue2 = new LinkedList<Integer>();
    for (int i = 0; i < 10; i++) {
      queue2.offer(i);
    }

    queue2.peek();
    System.out.println(queue);
    while (!queue.isEmpty()) {
      queue.poll();
      System.out.println(queue);
    }
    
  }
}
