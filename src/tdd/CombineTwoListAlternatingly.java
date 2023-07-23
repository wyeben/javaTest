package tdd;

import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

public class CombineTwoListAlternatingly {
    public static List<Object> combineAlternately(List<?> list1, List<?> list2) {
        int minSize = Math.min(list1.size(), list2.size());

        List<Object> combinedList = IntStream.range(0, minSize)
                .mapToObj(i -> List.of(list1.get(i), list2.get(i)))
                .flatMap(List::stream)
                .collect(Collectors.toList());

        combinedList.addAll(list1.subList(minSize, list1.size()));
        combinedList.addAll(list2.subList(minSize, list2.size()));
        return combinedList;
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<Integer> list2 = List.of(1, 2, 3);

        List<Object> result = combineAlternately(list1, list2);
        System.out.println(result);
    }
}

