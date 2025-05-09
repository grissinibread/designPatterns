package facade.exercise;

import java.util.List;

public class TokenService {
    public List<Tweet> getTwitterClient(String appKey, String appSecret) {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }
}
