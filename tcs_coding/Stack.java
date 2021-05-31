package tcs_coding;

import java.util.*;
// import java.util.Stack;
public class Stack {
    int stack[]=new int [10];
    int top=0;
    public void push(int data){
        stack[top] = data;
        top++;
        
    }
    public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public int peek(){
        int data;
        data=stack[top-1];
        return data;
    }
    public void show(){
        for(int n:stack){
            System.out.println(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan=null;
        try{
            scan=new Scanner(System.in);
            Stack nums=new Stack();
            for(int i=0;i<10;i++){
                nums.push(scan.nextInt());
            }
            for (int i=0;i<10;i++){
                System.out.println("So Now we have removed the TOP Element i.e "+nums.pop());
                System.out.println("So now the stack elements are ");
                nums.show();
                System.out.println("The Current PEEK Element of the stack is : "+nums.peek());
            }

        }
        finally{
            scan.close();
        }
    }
}
