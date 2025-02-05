package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 881,
        name = "Boats to Save People",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Greedy", "Sorting"}
)
public class _881 {

    public int numRescueBoats(int[] people, int limit) {

        int numBoats = 0;

        Arrays.sort(people);

        if (people.length == 0) {
            return 0;
        }
        if (people.length == 1 && people[0] <= limit) {
            numBoats = 1;
        }
        if (people.length == 1 && people[0] > limit) {
            return 0;
        }

        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (left == right) {
                numBoats++;
                break;
            }
            if (people[left] + people[right] <= limit) {
               left++;
               right--;
               numBoats++;
            }
            else {
                right--;
                numBoats++;
            }
        }

       /* for (int i = 0; i < people.length; i++) {

            if (i+1 < people.length && people[i] + people[i+1] <= limit){
                numBoats++;
                i++;
            } else if (i+1 < people.length && people[i] + people[i+1] > limit) {
                numBoats++;
            }
            else {
                numBoats++;
            }

        }*/

        return numBoats;

    }

}
