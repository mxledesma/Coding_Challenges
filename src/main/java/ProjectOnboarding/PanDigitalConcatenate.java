package ProjectOnboarding;

    /*
    Take the number 192 and multiply it by each of 1, 2, and 3:
192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product, we get the 1 to 9 pandigital, 192384576.
We will call 192384576 the concatenated product of 192 and (1,2,3)
The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,
giving the pandigital, 918273645, which is the concatenated product of 9 and(1,2,3,4,5).
What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated
product of an integer with (1,2, ... , n) where n >1?
     */

/* Explanation
  n cannot be 5 digits because if you multiple
  1 * 5 digits , you get 5 digits
  2 * 5 digits, you get 10 digits which bounds over the 9 digit number

  i choose n equals a 4 digit number.

 */

import java.util.HashSet;
import java.util.Set;

public class PanDigitalConcatenate {

    public static void main(String[] args) {

        System.out.print("The Largest PanDigital 9-digit number is: "+panDigital());

    }

    public static int panDigital() {

            // largest pandigital number
            int largest = 0;

            for (int i = 1; i < 10000; i++) {

                // value of concatenated product in a string format

                String multiplication = "";

                // (1,2,3,4,.....n)
                int integer = 1;

                // if the multiplication < 9 digits
                while (multiplication.length() < 9) {

                    // concatenating the product at each stage
                    multiplication += String.valueOf(i * integer);
                    integer += 1;
                }


            /*  I need:
                len(multiplication) == 9 # True
                len(set(multiplication)) == 9 # True
                '0' not in multiplication # True

                If all True, then i can get the largest 9 digit PanDigital Number
            */


                boolean isMultiplicationGood = true;

                if (multiplication.length() == 9) {                      // Checks to see if there are 9 digits

                    for (int j = 0; j < multiplication.length(); j++) {  // Checks to see if any '0' in the 9 digits
                        if (multiplication.charAt(j) == '0') {
                            isMultiplicationGood = false;
                        }
                    }

                    if (isMultiplicationGood) {                         // True, In here is when there are NO zeros

                        Set<Character> checkUnique = new HashSet<>();  // This will check to see if there are any duplicates

                        // Inserting character of String into set
                        for (int c = 0; c < multiplication.length(); c++) {
                            checkUnique.add(multiplication.charAt(c));    // I only want unique values
                        }

                        if (checkUnique.size() == 9) {

                            //  check if multiplication is greater than largest
                            int checkPanDigital = Integer.parseInt(multiplication);
                            if (checkPanDigital > largest) {
                                largest = checkPanDigital;
                            }

                        }

                    }


                }


            }



        return largest;



    }

}
