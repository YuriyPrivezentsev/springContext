import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 *
 * @author Yuriy Privezentsev
 * @since 11/11/2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:appConfiguration.xml")
public class MessengerTest {
    @Inject
    Messenger messenger;

    @Test
    public void test() {
        messenger.printMessage();
    }

}
