package program.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberProblem {
    public static void main(String[] args)
    {
        int value=20   ;

       boolean  flag = isHappy(value);
        System.out.println(flag);


    }
    private static boolean isHappy(int value) {
        System.out.println("value="+value);
        if( value==1 || value==7 )
        {
            return true;
        }
        int sum = 0;
        if(value>9) {


            while (value != 0) {
                int k = value % 10;
                sum = sum + k * k;
                value = value / 10;
            }
            if(sum==1)
            {
                return true;
            }
        }else{
            return false;
        }
        return isHappy(sum);
    }
}
