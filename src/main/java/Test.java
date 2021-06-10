import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
      int an=reverse(123456);
    }
    public static int reverse(int x) {
        if(x == 0) return 0;
        int sign = 1;
        int temp = 0;
        int module = 0;
        int reversed = 0;
        if(x < 0){
            sign = -1;
            x = 0 - x;
        }
        while(x!=0){
            temp = reversed;
            module = x % 10;
            x = x/10;
            reversed = reversed*10 + module;

            if((reversed - module)/10 != temp) return 0;

        }

        return sign*reversed;

    }
}
