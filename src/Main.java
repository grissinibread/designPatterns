import bridge.AdvancedRemoteControl;
import bridge.RemoteControl;
import bridge.SamsungTV;
import bridge.SonyTv;
import flyweight.exercise.Demo;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}