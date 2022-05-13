/**
 * 622. 设计循环队列
 * <a href="https://leetcode-cn.com/problems/design-circular-queue/">题目链接</a>
 */
public class $622 {

    private int[] data;
    private int front;
    private int tail;
    private int size;

    public $622(int k) {
        data = new int[k];
        front = tail = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % data.length;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty())return -1;
        return data[front];
    }

    public int Rear() {
        if (isEmpty())return -1;
        return data[tail - 1 < 0 ? data.length - 1 : tail - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}
