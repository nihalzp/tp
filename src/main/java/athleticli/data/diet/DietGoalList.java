package athleticli.data.diet;

import athleticli.data.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents a list of diet goals.
 */
public class DietGoalList extends ArrayList<DietGoal> implements Serializable {
    /**
     * Constructs a diet goal list.
     */
    public DietGoalList() {
        super();
    }

    /**
     * Returns a string representation of the diet goal list.
     *
     * @return A string representation of the diet goal list.
     */
    public String toString(Data data) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            result.append("\t").append(i + 1).append(". ").append(get(i).toString(data));
            if (i != size() - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
