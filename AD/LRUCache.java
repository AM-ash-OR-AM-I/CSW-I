package AD;

import java.util.HashMap;

class Node {
  int key;
  int value;
  Node nextNode;
  Node prevNode;

  Node() {

  }

  Node(int key, int value) {
    this.key = key;
    this.value = value;
  }
}

class MyLinkedList {
  Node front, rear;
  HashMap<Integer, Node> hashNode = new HashMap<>();
  static int maxLength;
  int length = 0;

  MyLinkedList(int length) {
    maxLength = length;
  }

  void enqueue(int key, int value) {
    if (length < maxLength) {
      length++;
      Node newNode = new Node(key, value);
      if (front == null) {
        front = rear = newNode;
      } else {
        Node tempPrev = rear;
        rear.nextNode = newNode;
        rear = rear.nextNode;
        rear.prevNode = tempPrev;
      }
      hashNode.put(key, newNode);
      System.out.println(hashNode);

    } else {
      System.out.println("Max length of queue execeeded.");
    }
  }

  int remove(int key, String choice) {
    // Unlinks the node from the linked list
    int value = -1;
    if (hashNode.containsKey(key)) {
      length--;
      Node removeNode = hashNode.get(key);
      Node nextNode = removeNode.nextNode;
      Node prevNode = removeNode.prevNode;
      if (removeNode == front) {
        value = removeFront();
      } else if (removeNode == rear) {
        value = removeRear();
      } else {
        prevNode.nextNode = nextNode;
        value = removeNode.value;
        hashNode.remove(key);
      }
    } else if (length == maxLength) {
      if (choice == "put") {
        length--;
        removeFront();
        value = -1;
      }
    }
    return value;
  }

  int removeFront() {
    if (length == -1) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      int removed = front.value;
      hashNode.remove(front.key);
      front = front.nextNode;
      return removed;
      // System.out.printf("Element removed: %s%n", removed);
    }
  }

  int removeRear() {
    if (length == 0) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      int removed = rear.value;
      hashNode.remove(rear.key);
      rear = rear.prevNode;
      rear.nextNode = null;
      return removed;
      // System.out.printf("Element removed: %s%n", removed);
    }
  }

  void display() {
    if (length > 0) {
      System.out.print("Queue = ");
      Node curNode = front;
      if (length == 1) {
        System.out.printf("{%d : %d}%n", front.key, front.value);
      } else {
        System.out.printf("{%d : %d, ", front.key, front.value);
        curNode = curNode.nextNode;
        while (curNode != rear) {
          System.out.printf("%d: %d, ", curNode.key, curNode.value);
          curNode = curNode.nextNode;
        }
        System.out.printf("%d: %d}%n", rear.key, rear.value);
      }
    }

  }
}

public class LRUCache {
  MyLinkedList ll;
  int capacity;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    ll = new MyLinkedList(capacity);
  }

  public int get(int key) {
    System.out.printf("%nget(%d)%n", key);
    /*
     * This doesn't work. [3, 6, 10, 9, 2]
     * get(6) -> [6, 10, 9, 2, 6] X
     * [3, 6, 10, 9, 2,__]
     * \___________/
     * Instead we need [3, 10, 9, 2, 6]
     * {2: Node@xtyz}
     */
    // System.out.println(ll.hashNode);
    int value = ll.remove(key, "get");
    if (value != -1)
      ll.enqueue(key, value);
    ll.display();
    return value;
  }

  public void put(int key, int value) {
    System.out.printf("%nput(%d, %d)%n", key, value);
    ll.remove(key, "put");
    ll.enqueue(key, value);
    // System.out.println(ll.length);
    ll.display();
  }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */