import com.stringSearchSet.exceptions.ExceptionMessages;
import com.stringSearchSet.exceptions.InvalidInputException;
import com.stringSearchSet.service.StringSetSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Efrem  on 4/28/19
 * @project SetContainsString
 */
public class TestStringSetSearchExceptions extends SpringBootStringSearchTests {

    @Autowired
    StringSetSearch setSearch;

    @Test
    public void testInValidSetException() {

        String input= "xalike";

        Exception exception = Assertions.assertThrows(InvalidInputException.class, () -> setSearch.findStringInSet(input));
        assertEquals(ExceptionMessages.INVALID_SET.getMessage(), exception.getMessage());
    }

    @Test
    public void testInValidStringInputException() {

        Set<String> inputSet= new HashSet<>();
        inputSet.add("i");
        inputSet.add("like");
        inputSet.add("ice");
        inputSet.add("cream");

        String input= "";

        setSearch.setLookUpSet(inputSet);

        Exception exception = Assertions.assertThrows(InvalidInputException.class, () -> setSearch.findStringInSet(input));
        assertEquals(ExceptionMessages.INVALID_STRING_INPUT.getMessage(), exception.getMessage());
    }
}
