public class FizzBuzzTranslate {
    public static String translate(int number){
        String trans;
        if(checkBuzz(number) && checkFizz(number)){
            trans="FizzBuzz";
        }else if(checkFizz(number)){
            trans= "Fizz";
        }else if(checkBuzz(number)){
            trans="Buzz";
        }else {
            trans=checkNumber(number);
        }
        return trans;
    }
    public static boolean checkFizz(int number){
        boolean tens=(number-number%10)/10==3;
        boolean unis=number%10==3;
        if (number %3==0){
            return true;
        }
        if (tens||unis){
            return true;
        }
        return false;
    }
    public static boolean checkBuzz(int number){
        int tens=(number-number%10)/10;
        int unis=number%10;
        if (number %5==0){
            return true;
        }
        if (tens==5||unis==5){
            return true;
        }
        return false;
    }
    public static String checkNumber(int number){
        String trans;
        if(number>10) {
            int tens = (number - number % 10) / 10;
            int unis = number % 10;
            trans = read_a_digit(tens) +" "+ read_a_digit(unis);
        }else {
            trans=read_a_digit(number);
        }
        return trans;
    }

    private static String read_a_digit(int number) {
        String trans=null;
        switch (number){
            case 1: trans="Một";
                    break;
            case 2: trans="Hai";
                    break;
            case 4: trans="Bốn";
                    break;
            case 6: trans="Sáu";
                    break;
            case 7: trans="Bảy";
                    break;
            case 8: trans="Tám";
                    break;
            case 9: trans="Chín";
                    break;
        }
        return trans;
    }

}
