public class Main {
  static boolean quit =  false;
  public static void main(String[] args) {
    Queue myQueue = new Queue();

    myQueue.enqueue('A');
    myQueue.enqueue('B');
    myQueue.enqueue('C');
    System.out.print("Queue: "); myQueue.printQueue();

    System.out.println("Dequeue: " + myQueue.dequeue());

    System.out.println("enqueue: D");
    myQueue.enqueue('D');
    System.out.print("End result: "); myQueue.printQueue();
  }
}

class Queue {
  char[] queue;
  int front;
  int size;

  public Queue() {
    this.queue = new char[10];
    this.front = 0;
    this.size = 0;
  }

  public void enqueue(char element) {
    queue[(front + size)] = element;
    size++;
  }

  public char dequeue() {
    char item = queue[front];
    front = (front + 1);
    size--;
    return item;
  }

  public int size() {
    return size;
  }

  public void printQueue() {
    for (int i = 0; i < size; i++) {
      System.out.print(queue[(front + i)] + " ");
    }
    System.out.println();
  }
}