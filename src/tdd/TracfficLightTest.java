package tdd;

public class TracfficLightTest {
        public static void main(String[] args) throws InterruptedException {
            TrafficLight trafficLight = new TrafficLight();

            while (true) {
                trafficLight.displayState();
                Thread.sleep(2000);

                trafficLight.changeState();
                Thread.sleep(1000);
            }
        }
    }
