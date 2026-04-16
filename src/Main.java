public class Main {
  static boolean quit =  false;
  public static void main(String[] args) {
    Queue myQueue = new Queue(10);

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
  int capacity;

  public Queue(int capacity) {
    this.capacity = capacity;
    this.queue = new char[capacity];
    this.front = 0;
    this.size = 0;
  }

  public void enqueue(char element) {
    if (size == capacity) {
      System.out.println("Queue is full");
      return;
    }
    queue[(front + size) % capacity] = element;
    size++;
  }

  public char dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return '\u0000'; // Null character
    }
    char item = queue[front];
    front = (front + 1) % capacity;
    size--;
    return item;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void printQueue() {
    for (int i = 0; i < size; i++) {
      System.out.print(queue[(front + i) % capacity] + " ");
    }
    System.out.println();
  }
}