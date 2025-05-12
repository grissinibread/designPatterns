package proxy.exercise;

public class ProductProxy implements Product {
    RealProduct product;

    public ProductProxy(RealProduct product) {
        this.product = product;
    }

    @Override
    public void setName(String name) {

    }
}
