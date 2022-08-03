import io.javalin.Javalin;

public class RandomNumberServiceStub {

  public static void main(String[] args) {
    Javalin.create()
            .get("/hashcode",get -> get.result(get7777()))
            .start(7070);
  }

  private static String get7777(){
    return "7777";
  }
}
