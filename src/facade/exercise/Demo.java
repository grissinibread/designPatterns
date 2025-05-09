package facade.exercise;

public class Demo {
  public static void show() {
    TokenService tokenService = new TokenService();
    tokenService.getTwitterClient("appKey", "appSecret");
  }
}
