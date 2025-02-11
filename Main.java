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
    String[] arr1 = new String[len];
    for (int i = 0; i < len; i++){
      arr1[i] = sc.nextLine();
    }
    System.out.println("Reversed:");
    reverse(arr1);

    // Problem 2
    System.out.println("Enter array length: ");
    len = sc.nextInt();

    System.out.println("Enter values: ");
    int[] arr2 = new int[len];
    for (int i = 0; i < len; i++){
      arr2[i] = sc.nextInt();
    }
    System.out.println("Product is: " + product(arr2));

    // Problem 3
    System.out.println("Enter array length: ");
    len = sc.nextInt();

    System.out.println("Enter values: ");
    double[] arr3 = new double[len];
    for (int i = 0; i < len; i++){
      arr3[i] = sc.nextDouble();
    }
    System.out.println("Average is: " + average(arr3));
  }

  public static void reverse(String[] arr)
  {
    for (String word : arr){
      for (int j = word.length(); j > 0; j--){
        System.out.print(word.substring(j-1, j));
      }
      System.out.println("");
    }
  }

  public static int product(int[] arr)
  {
    int num = 1;
    for (int i : arr){
      num *= i;
    }
    return num;
  }

  public static double average(double[] arr)
  {
    double avg = 0;
    for (double i : arr){
      avg += i;
    }
    return avg/arr.length;
  }
}
