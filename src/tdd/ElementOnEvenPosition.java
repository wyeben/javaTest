package tdd;
    import java.util.ArrayList;
import java.util.List;

    public class ElementOnEvenPosition {
        public static List<Integer> getElementsAtEvenPositions(int[] arr) {
            List<Integer> evenElements = new ArrayList<>();

            for (int i = 1; i < arr.length; i += 2) {
                evenElements.add(arr[i]);
            }

            return evenElements;
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            List<Integer> evenElements = getElementsAtEvenPositions(numbers);
            System.out.println("Elements at even positions: " + evenElements);
        }
    }

