import java.util.LinkedList;

public class Linkedlist {
  public static void main(String[] args) {
    LinkedList nums = new LinkedList();
    nums.add(5);
    nums.add(9);
    nums.addLast(4);
    
    nums.addFirst(6);


    System.out.println(nums.get(2));

    System.out.println("LinkedList: " + nums);
  }
}
