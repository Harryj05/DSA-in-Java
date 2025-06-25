import java.util.Stack;

public class stack {
  public static void main(String[] args){
    Stack nums = new Stack();
    nums.push(10);
    nums.push(20);
    nums.pop();
    nums.push(30);
    nums.push(70);

    System.out.println(nums);
  }
}