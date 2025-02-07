import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Problem 1
    System.out.println("Enter array length: ");
    int len = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter values: ");
    String arr1 = new String[len];
    for (int i = 0; i < len; i++){
      arr1[i] = sc.nextLine();
    }
    reverse(arr1);
  }

  public static void reverse(String[] arr)
  {
    System.out.println(" ");
  }

  public int product(int[] arr)
  {
    return 0;
  }

  public double average(double[] arr)
  {
    return 0.0;
  }
}
