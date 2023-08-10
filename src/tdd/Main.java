package tdd;
import java.util.Arrays;
import java.util.List;
    enum GeopoliticalZone {
        
        NORTH_WEST(Arrays.asList("Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Zamfara")),
        NORTH_EAST(Arrays.asList("Adamawa", "Bauchi", "Borno", "Bauchi", "Taraba", "Yobe")),
        NORTH_CENTRAL(Arrays.asList("Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau", "Federal Capital Territory")),
        SOUTH_SOUTH(Arrays.asList("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers")),
        SOUTH_WEST(Arrays.asList("Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"));

        private final List<String> states;

        GeopoliticalZone(List<String> states) {
            this.states = states;
        }

        public List<String> getStates() {
            return states;
        }
    }

    public class Main {
        public static void main(String[] args) {
            List<String> northWestStates = GeopoliticalZone.NORTH_WEST.getStates();
            System.out.println("States in North-West zone: " + northWestStates);

            List<String> NORTH_EAST = GeopoliticalZone.NORTH_EAST.getStates();
            System.out.println("States in North-West zone: " + NORTH_EAST);

            List<String> NORTH_CENTRAL = GeopoliticalZone.NORTH_CENTRAL.getStates();
            System.out.println("States in North-West zone: " + NORTH_CENTRAL);

            List<String> SOUTH_SOUTH = GeopoliticalZone.SOUTH_SOUTH.getStates();
            System.out.println("States in North-West zone: " +SOUTH_SOUTH);

            List<String> SOUTH_WEST = GeopoliticalZone.SOUTH_WEST.getStates();
            System.out.println("States in North-West zone: " + SOUTH_WEST);
        }
    }


