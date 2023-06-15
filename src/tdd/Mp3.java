package tdd;

public class Mp3 {
  private String name;
  private int volumeUp;
  private int volumeDown;
    public void setName(String ben) {
      this.name = ben;
    }


    public String getName() {
        return name;
    }

  public boolean getIsOn() {
      return true;
  }

    public boolean getPlay() {
      return true;
    }

  public boolean getPause() {
      return true;
  }
  public void setVolumeUp(int volumeUp) {
      this.volumeUp = volumeUp;
  }
  public int getVolumeUp() {
      return volumeUp = volumeUp + 1;
  }

    public void setVolumeDown(int volumeDown) {
        this.volumeDown = volumeDown;
    }

    public int getVolumeDown() {
        return volumeDown = volumeDown - 1;
    }
}
