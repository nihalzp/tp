package athleticli.data.diet;

import athleticli.data.Findable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * Represents a list of diets.
 */
public class DietList extends ArrayList<Diet> implements Serializable, Findable {
    /**
     * Constructs a diet list.
     */
    public DietList() {
        super();
    }

    /**
     * Returns a string representation of the diet list.
     *
     * @return A string representation of the diet list.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            result.append(i + 1).append(". ").append(get(i).toString());
            if (i != size() - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Returns a list of diets matching the date.
     *
     * @param date The date to be matched.
     * @return A list of diets matching the date.
     */
    @Override
    public ArrayList<Diet> find(LocalDate date) {
        ArrayList<Diet> result = new ArrayList<>();
        for (Diet diet : this) {
            if (diet.getDateTime().toLocalDate().equals(date)) {
                result.add(diet);
            }
        }
        return result;
    }
}
