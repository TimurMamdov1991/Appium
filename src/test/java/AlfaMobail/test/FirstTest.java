package AlfaMobail.test;

import AlfaMobail.CoreTestCase;
import org.junit.Test;

public class FirstTest extends CoreTestCase {



    @Test
    public void testLogin() {
        //Авторизация
        preparatorySteps.authorizationIn("20302306");

        //Проверка авторизации
        assertionSteps.assertNameClient();
    }

}