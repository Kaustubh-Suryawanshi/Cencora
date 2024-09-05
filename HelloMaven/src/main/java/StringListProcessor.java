import java.util.ArrayList;
import java.util.List;

public class StringListProcessor {
    List<String> stringList;

    public StringListProcessor() {
        stringList = new ArrayList<>();
    }

    // Adds a string to the list

    public void addString(String str) {

        stringList.add(str);

    }



    // Removes a string from the list

    public boolean removeString(String str) {

        return stringList.remove(str);

    }



    // Retrieves the string at a specific index

    public String getString(int index) {

        if (index < 0 || index >= stringList.size()) {

            throw new IndexOutOfBoundsException("Invalid index");

        }

        return stringList.get(index);

    }



    // Returns the current size of the list

    public int getSize() {

        return stringList.size();

    }
}
