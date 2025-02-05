package org.ismaylov;

public class _1550 {

    public boolean threeConsecutiveOdds(int[] arr) {

        if (arr.length <3){
            return false;
        }

        if (arr.length == 3 && arr[0] % 2 == 0 || arr.length == 3 && arr[1] % 2 == 0 || arr.length == 3 && arr[2] % 2 == 0){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            int counterOdd = 0;

            int lastPosition = i + 2;
            int firstOddIndex = -1;

            if (lastPosition > arr.length - 1){
                return false;
            }

            if (arr[i] % 2 == 1) {
                counterOdd++;
                if (firstOddIndex == -1){
                    firstOddIndex = i;
                }
            }
            if (arr[i+1] % 2 == 1) {
                counterOdd++;
                if (firstOddIndex == -1){
                    firstOddIndex = i;
                }
            }
            if (arr[lastPosition] % 2 == 1) {
                counterOdd++;
                firstOddIndex = lastPosition-1;
            }

            if (counterOdd == 1 && firstOddIndex == lastPosition-1) {
                i = firstOddIndex;
            }

            if (counterOdd == 2) {
                i = firstOddIndex;
            }else if(firstOddIndex != lastPosition-1){
                i = lastPosition;
            }

            if (counterOdd == 3) {
                return true;
            }

        }

        return false;


    }

}
