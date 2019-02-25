package Collection;

import java.util.Collections;
import java.util.Stack;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
public class AssignSev {
    public static void main(String[] args) {
        SpecialStack st = new SpecialStack();
        st.pushStack(st.stack,10);
        st.pushStack(st.stack,20);
        st.pushStack(st.stack,30);
        st.pushStack(st.stack,40);
        st.pushStack(st.stack,50);
        System.out.println("After pushing values, the stack is: "+st.stack);
        boolean b=st.isFullStack(st.stack);
        System.out.println("isFull function : "+ b);
        System.out.println("Minimum value in stack: "+Collections.min(st.stack));
        st.popStack(st.stack);st.popStack(st.stack);st.popStack(st.stack);st.popStack(st.stack);st.popStack(st.stack);
        System.out.print("After pop() ");
        System.out.println(st.stack);
        boolean b1=st.isEmptyStack(st.stack);
        System.out.println("isEmpty function : "+b1);
    }
}

class SpecialStack {
    final int max_size = 5;
    Stack<Integer> stack = new Stack<>();
    public void pushStack(Stack stack,int ele){
        stack.push(ele);
    }
    public void popStack(Stack stack){

        stack.pop();
    }public boolean isEmptyStack(Stack stack){
        return stack.empty();

    }public boolean isFullStack(Stack stack){
        boolean ret=false;
        if(stack.size()==5){
            ret=true;
        }
        return ret;

    }
}
