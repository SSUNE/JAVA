package Ex021_package;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    //get
    public boolean isPowerOn() { return isPowerOn; }
    public int getChannel() { return channel; }
    public int getVolume() { return volume; }

    //set
    public void setPowerOn(boolean powerOn) { isPowerOn = powerOn; }
    public void setChannel(int channel) { this.channel = channel; }
    public void setVolume(int volume) { this.volume = volume; }
}

