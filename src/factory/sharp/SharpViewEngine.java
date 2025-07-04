package factory.sharp;

import factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> data) {
        return "View rendered by SharpViewEngine";
    }
}
