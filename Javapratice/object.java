public class object {

    String brand = "Toyota";

    public static void main(String[] args) {

        object mycar = new object();
        mycar.show();
    }

    void show() {
        System.out.println("Car brand is " + brand);
    }
}
