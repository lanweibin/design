package bridge;

public abstract class AbstractRemoteControl {
    private  ITV itv;
    public  AbstractRemoteControl(ITV itv){
        this.itv = itv;
    }

    public void turnOn(){
        itv.on();
    }

    public void turnOff(){
        itv.off();
    }

    public void setChannel(int channel){
        itv.swichChannel(channel);
    }
}
