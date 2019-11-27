package tencent50.easy._155_min_stack;

import org.junit.jupiter.api.Test;

/**
 * Created by hank on 2019/11/12
 */
public class MinStackTest {
    @Test
    public void test() {
        MinStack minStack = new MinStack();
/**
 * ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
 * [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
 */

        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
