import java.util.Arrays;

public class Newhello {

  public static void main(String a[]) {

    // int num1 = 120;
    // int num2 = 100;

    // System.out.println("NewHeelow World");
    // System.out.println(num2 + num1);

    // int x = 30;
    // int y = 20;
    // int z = 40;

    // if (x > y && x > z) {
    // System.out.println(x);

    // } else if (y > x && y > z) {
    // System.out.println(y);
    // } else {
    // System.out.println(z);
    // }

    // int nums[]=new int[4];
    // nums[3]=5;
    // System.out.println(Arrays.toString(nums));

    // int nums[][] = new int[3][4];

    // for (int i = 0; i < nums.length; i++) {
    // for (int j = 0; j <= nums.length; j++) {
    // System.out.println(nums[i][j] + " ");
    // }
    // System.out.println();
    // }

    // int nums [][]=new int[3][];

    // nums[0]=new int[3];
    // nums[1]=new int[4];
    // nums[2]=new int[2];

    // for( int i=0;i<nums.length;i++){
    // for( int j=0;j<nums[i].length;j++){
    // System.out.println(nums[i][j]+" ");
    // }
    // System.out.println();
    // }

    // int nums[]=new int [2];

    // nums[0]=1;
    // nums[1]=2;
    // for( int i=0; i<=nums.length;i++){
    // System.out.println(nums[i]);
    // }
    // int num1 = 5;
    // int count = 0;

    // for (int i = 1; i < num1; i++) {
    // if (num1 % i == 0) {
    // count++;
    // }
    // }
    // if (count == 1) {
    // System.out.println("Prime number");
    // } else {
    // System.out.println("Not Prime");
    // }

    String name = "Ravikumar";

    String name2 = "aeiou";
    int count = 0;

    for (int i = 0; i < name.length(); i++) {
      for (int j = 0; j < name2.length(); j++) {
        if (name.charAt(i) == name2.charAt(j)) {
          count++;
        }

      }
    }
    System.out.println("Voles are inthis" + count);
    System.out.println("Consonenents are in this is" + (name.length() - count));

  }

}
