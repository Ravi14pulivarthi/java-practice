public class object {

    class details {
        String name = "Ravikumar";
        int age = 12;
        int role = 23;
    }

    public static void main(String[] args) {

        object outer = new object();
        details Totaldetail = outer.new details();

        System.out.println("name is " + Totaldetail.name);
         System.out.println("age"+Totaldetail.age);
    }

}
