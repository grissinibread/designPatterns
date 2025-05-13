package factory.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> data) {
        return "View rendered by Matcha";
    }
}
