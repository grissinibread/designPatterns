package factory.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> conext) {
        var engine = createViewEngine();
        var html = engine.render(viewName, conext);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
