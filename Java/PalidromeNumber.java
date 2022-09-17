package Java;

import java.util.ArrayList;

/**
 * PalidromeNumber
 */
public class PalidromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }

    public static boolean isPalindrome(int x) {
        String intToString = Integer.toString(x);
        String[] vectInput = intToString.split("");

        ArrayList<String> vect = new ArrayList<>();

        for (int index = 0; index < vectInput.length; index++) {
            vect.add(vectInput[index]);
        }

        ArrayList<String> vectReverse = new ArrayList<>();

        for (int index = vect.size() - 1; index > -1; index--) {
            vectReverse.add(vect.get(index));
        }

        boolean check = false;

        for (int index = 0; index < vect.size(); index++) {
            if (vect.get(index).equals(vectReverse.get(index))) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        return check;
    }

}