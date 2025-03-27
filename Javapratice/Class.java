class Calculater {
  int num10=100;
   
   public int add(int n1,int n2,int n3){
 
    System.out.println(num10);
     return n1+n2+n3;
   }
   public int add(int n1,int n2){

    return n1+n2;
  }
 }

public class Class {

  public static void main(String a[]) {

   
     Calculater cale=new Calculater();
     Calculater cale1=new Calculater();

      int totalnum=cale.add(1,2);
       int totalnum2=cale1.add(10,20);

    System.out.println(totalnum);
     System.out.println(totalnum2);

  }

}
