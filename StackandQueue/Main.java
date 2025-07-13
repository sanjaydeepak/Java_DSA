package StackandQueue;

public class Main {
    public static void main(String[] args) throws Exception {
           DynamicStack stack=new DynamicStack(6);
        stack.push(94);
        stack.push(93);
        stack.push(92);
        stack.push(91);
        stack.push(90);
        stack.push(89);
        stack.push(88);
        stack.push(87);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop( ));
    }
}
