package abstractFactory.material;

import abstractFactory.Button;
import abstractFactory.TextBox;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("MaterialButton");
    }
}
