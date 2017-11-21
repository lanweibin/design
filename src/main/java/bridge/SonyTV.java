package bridge;

public class SonyTV implements ITV {
    public void on() {
        System.out.println("Sony is turn on.");
    }

    public void off() {
        System.out.println("Sony is turn off.");

    }

    public void swichChannel(int Channel) {
        System.out.println("sony: channel" + Channel);

    }
}
