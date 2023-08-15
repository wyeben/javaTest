package tdd;

public class TrafficLight {
        private String state;

        public TrafficLight() {
            this.state = "red";
        }

        public void changeState() {
            switch (state) {
                case "red":
                    state = "green";
                    break;
                case "green":
                    state = "yellow";
                    break;
                case "yellow":
                    state = "red";
                    break;
            }
        }

        public void displayState() {
            System.out.println("Traffic light is " + state);
        }
    }


