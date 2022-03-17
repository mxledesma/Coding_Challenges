package ProjectOnboarding;

/*


Implement a stack that has the following methods:
        • push ( v a 1 ) : push v a 1 onto the stack
        • pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
        • max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

        Each method should run in constant time.

*/


import java.util.Stack;

public class StackCoding {

    public void stackPopulate(Stack<Object> stack) {
        stack.push(5);
        stack.push(9);
        stack.push("d");
        stack.push(7);
        stack.push("c");
        stack.push(5);
        System.out.println(stack+"\n");
    }

    public void pushStack(Stack<Object> stack) {
        stack.push("v");
        stack.push("a");
        stack.push(1);
        System.out.println(stack+"\n");
    }

    public void maxStack(Stack<Object> stack) throws Exception {
        int a = 0;
        int b = 0;
        for(Object temp: stack) {
            if(stack.empty()) {
                throw new Exception("Stack is Empty");
            }
            if(temp instanceof Integer) {
                a = (int) temp;
                if(b == 0) {
                    b = a;
                }
                else if(a>b) {
                    b = a;
                }
            }
        }

        System.out.println(b);
    }

    public void popStack(Stack<Object> stack) throws Exception {
        if(stack.empty()) {
            throw new Exception("Stack is Empty");
        }
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }

    public static void main(String[] args) throws Exception {

        StackCoding st = new StackCoding();

        Stack<Object> stack = new Stack<Object>();

        st.stackPopulate(stack);

        st.pushStack(stack);
        st.maxStack(stack);
        st.popStack(stack);



    }
}
