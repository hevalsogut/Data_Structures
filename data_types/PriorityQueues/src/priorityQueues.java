import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {
  public static void main(String[] args) {

    // a FIFO data structure that serves elments with the highest
    // priorities first before elements with lower priority.
    Queue<Double> queue = new PriorityQueue<>();

    queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(4.0);
    queue.offer(1.0);
    queue.offer(2.0);
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
