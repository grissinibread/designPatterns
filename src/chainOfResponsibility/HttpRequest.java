package chainOfResponsibility;

public class HttpRequest {
    public String userName;
    public String password;

    public HttpRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
