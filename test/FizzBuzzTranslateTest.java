import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @DisplayName("number :3")
    @org.junit.jupiter.api.Test
    void testTranslate() {
        int numberTest=3;
         String expected="Fizz";
         String result=FizzBuzzTranslate.translate(numberTest);
         assertEquals(expected,result);
    }
}