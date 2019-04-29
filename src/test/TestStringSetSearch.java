
import com.stringSearchSet.exceptions.InvalidInputException;
import com.stringSearchSet.service.StringSetSearch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Efrem  on 4/28/19
 * @project Algorithms2
 */
public class TestStringSetSearch extends SpringBootStringSearchTests {

    @Autowired
    StringSetSearch setSearch;


    @Test
    public void testSetOfStringsContainsString_1() throws InvalidInputException {
        Set<String> inputSet= new HashSet<>();
        inputSet.add("i");
        inputSet.add("like");
        inputSet.add("ice");
        inputSet.add("cream");

        String input= "ilike";


        setSearch.setLookUpSet(inputSet);
        boolean actualOutput= setSearch.findStringInSet(input);

        assertTrue(actualOutput);
    }

    @Test
    public void testSetOfStringsContainsString_2() throws InvalidInputException {
        Set<String> inputSet= new HashSet<>();
        inputSet.add("x");
        inputSet.add("a");
        inputSet.add("alywu");
        inputSet.add("g");

        String input= "xalywug";

        setSearch.setLookUpSet(inputSet);

        boolean actualOutput= setSearch.findStringInSet(input);

        assertTrue(actualOutput);

    }

    @Test
    public void testSetOfStringsContainsString_DuplicateValues() throws InvalidInputException {
        Set<String> inputSet= new HashSet<>();
        inputSet.add("x");
        inputSet.add("a");
        inputSet.add("alywu");
        inputSet.add("g");

        String input= "xalywugxx";

        setSearch.setLookUpSet(inputSet);

        boolean actualOutput= setSearch.findStringInSet(input);

        assertTrue(actualOutput);

    }


    @Test
    public void testSetOfStringsContainsString_falseResult() throws InvalidInputException {
        Set<String> inputSet= new HashSet<>();
        inputSet.add("i");
        inputSet.add("like");
        inputSet.add("ice");
        inputSet.add("cream");

        String input= "xalike";

        setSearch.setLookUpSet(inputSet);

        boolean actualOutput= setSearch.findStringInSet(input);

        assertFalse(actualOutput);
    }




}
