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
    @DisplayName("number :5")
    @org.junit.jupiter.api.Test
    void test2Translate() {
        int numberTest=5;
        String expected="Buzz";
        String result=FizzBuzzTranslate.translate(numberTest);
        assertEquals(expected,result);
    }
    @DisplayName("number :16")
    @org.junit.jupiter.api.Test
    void test3Translate() {
        int numberTest=16;
        String expected="Một Sáu";
        String result=FizzBuzzTranslate.translate(numberTest);
        assertEquals(expected,result);
    }
    @DisplayName("number :16")
    @org.junit.jupiter.api.Test
    void test4Translate() {
        int numberTest=31;
        String expected="Fizz";
        String result=FizzBuzzTranslate.translate(numberTest);
        assertEquals(expected,result);
    }
    @DisplayName("number :7")
    @org.junit.jupiter.api.Test
    void test5Translate() {
        int numberTest=7;
        String expected="Bảy";
        String result=FizzBuzzTranslate.translate(numberTest);
        assertEquals(expected,result);
    }
    @DisplayName("number :64")
    @org.junit.jupiter.api.Test
    void test6Translate() {
        int numberTest=64;
        String expected="Sáu Bốn";
        String result=FizzBuzzTranslate.translate(numberTest);
        assertEquals(expected,result);
    }

}