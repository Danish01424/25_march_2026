import java.util.*;

public class palidrome 
{
  public static void polidromenum(int num) {
    int originalnum = num;
    int reversesum = 0;
    while (num > 0) {
        int rem = num % 10;
        reversesum = reversesum * 10 + rem;
        num = num / 10;
    }  
    if (originalnum == reversesum) {
        System.out.println(originalnum + "polidrome" + reversesum);
    } else {
        System.out.println(originalnum + "Not polidrome");
    }
  } 
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      int num = sc.nextInt();

      polidromenum(num);
  } 
}
