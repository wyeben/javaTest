package tdd;

public class Television {
 private boolean powerOn;
 private int volumeUp;
 private int volumeDown;
 private int channel;
 private boolean powerOff;
    public boolean getPowerOn() {
        return powerOn;
    }
    public void setVolumeUp(int volumeUp){
        this.volumeUp = volumeUp+1;
    }

    public int getVolumeUp() {
        return volumeUp;
    }

    public void setVolumeDown(int volumeDown) {
        this.volumeDown = volumeDown;
    }
    public int getVolumeDown(){
        return volumeDown = volumeDown - 1;
    }

    public void setIncreaseChannel(int channel) {
        this.channel = channel + 1;
    }

    public int getIncreaseChannel() {
        return channel = channel;
    }

    public void setDecreaseChannel(int channel) {
        this.channel = channel - 1;
    }

    public int getDecreaseChannel() {
        return channel;
    }

    public void setPowerOff() {
        this.powerOff = powerOff;
    }

    public boolean getPowerOff() {
        return powerOff;
    }
}
