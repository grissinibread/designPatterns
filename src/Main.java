import adapter.exercise.EmailClient;
import adapter.exercise.GmailAdapter;

public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter());

        emailClient.downloadEmails();
    }
}