
class Computer {

  public void playmusic() {

    System.out.println("Plying music");
  }

  public String givemepen(int cost) {

    if (cost >= 10) {
      return "Pen";
    } else {
      return "No pen";
    }
  }
}

public class Class {

  public static void main(String a[]) {

    Computer play = new Computer();
    play.playmusic();

    String result = play.givemepen(1);

    System.out.println(result);

  }

}
