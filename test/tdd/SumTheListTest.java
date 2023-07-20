package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTheListTest {

    @Test
    public void canFindLowestAndHighest(){
        SumTheList cal = new SumTheList();
        int findHighest = cal.findHighestSumNumber(new int[]{1,12,3,4,5});
        assertEquals(12,findHighest);

        int findLowest = cal.findLowestSumNumber(new int[]{1,12,3,4,5});
        assertEquals(1,findLowest);
    }
}
