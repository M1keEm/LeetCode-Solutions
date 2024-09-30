public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class CustomStack {

    private int[] stackArray; //array for stack elements
    private int topIndex; //index of the top element in the stack

    public CustomStack(int maxSize) {
        stackArray = new int[maxSize];
        topIndex = -1;
    }

    public void push(int x) {
        if (topIndex < stackArray.length - 1) {
            stackArray[++topIndex] = x;
        }
    }

    public int pop() {
        if (topIndex >= 0) {
            return stackArray[topIndex--];
        } else {
            return -1; //-1 if the stack is already empty
        }
    }

    public void increment(int k, int val) {
        if (k > topIndex + 1) {
            for (int i = 0; i < topIndex + 1; i++) {
                stackArray[i] += val;
            }
        } else {
            for (int i = 0; i < k; i++) {
                stackArray[i] += val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */