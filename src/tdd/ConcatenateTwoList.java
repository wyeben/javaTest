package tdd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateTwoList {
    public static List<Object> concatenateList(List<Object> list1, List<Object> list2) {
        List<Object> result = new ArrayList<>();

        for (Object item : list1) {
            result.add(item);
        }

        for (Object item : list2) {
            result.add(item);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList("a", "b", "c");
        List<Object> list2 = Arrays.asList(1, 2, 3);
        List<Object> concatenatedList = concatenateList(list1, list2);
        String result = Arrays.toString(concatenatedList.toArray());
        System.out.println(result);
    }
}