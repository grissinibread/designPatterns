package bridge;

public class SonyTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony: setChannel");
    }
}
