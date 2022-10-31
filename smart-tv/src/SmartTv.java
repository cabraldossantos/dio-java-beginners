public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        on = true;
    }

    public void toSwitchOff() {
        on = false;
    }

    public void turnUpTheVolume() {
        ++volume;
    }

    public void lowerTheVolume () {
        --volume;
    }

    public void increaseChannel() {
        ++channel;
    }

    public void decreaseChannel() {
        --channel;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}
