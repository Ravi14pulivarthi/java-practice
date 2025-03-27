 
 class Calculater{
   public int add(int n1,int n2){
      int r=n1+n2;
     return r;
   }
 }



public class Condection {
    public static void main(String a[]) {

        // int i = 1;

        // while (i <= 4) {
        // System.out.println("Hii Ravi" + i);
        // int num2 = 3;
        // for (int j = 1; j <= num2; j++) {
        // System.out.println("Extra " + j);
        // }
        // i++;
        // }

        // int num = 10;
        // for (int j = 1; j <= num; j++) {
        // System.out.println("For loop" + j);
        // }

        // int num1 = 10;
        // int num2 = 10;

        // for (int i = 1; i <= num1; i++) {

        //     for (int j = 1; j <= num2; j++) {

        //         System.out.println(i + "*" + j + "=" + (i * j));

        //     }
        // }


         int num1=1;
         int num2=2;

         Calculater calc=new Calculater();
        int result= calc.add(10,20);
         System.out.println(result);


   

    }

}
