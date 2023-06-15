package tdd;

public class AirCondition {
  private String name;
  private int temperature;
    public boolean getIsOn() {
        return true;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  public void setTemperature(int temperature){
        if(temperature == 16);
        this.temperature = temperature +1;
  }
    public int getTemperature() {
        return temperature;
    }
}
