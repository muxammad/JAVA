package JavaFundamentals2.Classes.Initializers;

import java.util.Arrays;

public class IntialDemo {
    

    private static char[] alph;

    final byte i;{
        i = 10;
    }

    static {

        alph = new char[26];
        int i = 0;
        for(char c = 'a'; i < alph.length; c++, i++){
            alph[i] = c;
        }

    }

    public static void print(){
        System.out.println(Arrays.toString(alph));
    }

}
