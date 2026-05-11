import java.util.Stack;

public class MinStack {
    Stack<Integer> principal;
    Stack<Integer> minimos;

    public MinStack(){
        principal = new Stack<>();
        minimos = new Stack<>();
    }

    public void push(int val){
        principal.push(val);

        if(minimos.isEmpty() || val <= minimos.peek()){
            minimos.push(val);
        }
    }

    public void pop(){
        int sacado = principal.pop();

        if(sacado == minimos.peek()){
            minimos.pop();
        }
    }

    public int getMin(){
        return minimos.peek();
    }
}
