package tencent50.easy._155_min_stack;

import java.util.Arrays;

/**
 * Created by hank on 2019/11/12
 */
public class MinStack {

    int[] array;
    int min;
    int end;
    final static int INIT_SIZE = 10;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        array = new int[INIT_SIZE];
        end = 0;
    }

    public void push(int x) {
        int len = array.length;
        if (end == 0) {
            // 第一次压入
            min = x;
        } else if (end == len) {
            // 需要扩容
            array = Arrays.copyOf(this.array, 2 * len);
        }
        array[end++] = x;
        // 与最小值比较
        if (x < min) {
            min = x;
        }
    }

    public void pop() {
        // 1.长度减1
        // 2. 重新选取最小值
        if (end >= 1) {
            end -= 1;
            int[] temp = Arrays.copyOf(array, end);
            Arrays.sort(temp);
            min = temp[0];
        }
    }

    public int top() {
        return array[--end];
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
