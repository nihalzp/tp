package athleticli.ui.dietgoal;

import athleticli.dietgoal.DietGoal;
import athleticli.dietgoal.DietGoalList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DietGoalListTest {

    @Test
    void addGoal_addOneGoal_expectSizeOne() {
        DietGoalList dietGoals = new DietGoalList();
        DietGoal proteinGoal = new DietGoal("protein", 10000);
        dietGoals.addGoal(proteinGoal);
        assertEquals(1, dietGoals.getSize());

    }

    @Test
    void getSize_initialiseArgs_expectZero() {
        DietGoalList dietGoals = new DietGoalList();
        assertEquals(0, dietGoals.getSize());
    }

    @Test
    void getSize_addTenGoals_expectTen() {
        DietGoalList dietGoals = new DietGoalList();
        DietGoal proteinGoal = new DietGoal("protein", 10000);
        for (int i = 0; i < 10; i++) {
            dietGoals.addGoal(proteinGoal);
        }
        assertEquals(10, dietGoals.getSize());
    }

}
