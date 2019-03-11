import java.util.*;
public class Armstrong{
   public static void main(String[] args)
   {
      int l=99,h=999;
      for(int n = l + 1; n < h; ++n) {

            if (checkArmstrong(n))
                System.out.print(n + " ");
        }
   }
   public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNumber = num;
        
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = num;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if (result == num)
            return true;

        return false;
    }
}
