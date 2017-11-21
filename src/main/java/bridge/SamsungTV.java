package bridge;

public class SamsungTV implements ITV {
    public void on() {
        System.out.println("Samsung is turn on.");
    }

    public void off() {
        System.out.println("Samsung is turn off");
    }

    public void swichChannel(int Channel) {
        System.out.println("Samsung; channel -"+Channel);
    }
}
