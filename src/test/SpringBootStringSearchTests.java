import com.stringSearchSet.main.Main;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;


/**
 * @author Efrem  on 4/28/19
 * @project SetContainsString
 */


@SpringBootTest(classes = Main.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class SpringBootStringSearchTests {

    @Test
    public void contextLoads() {

    }
}

