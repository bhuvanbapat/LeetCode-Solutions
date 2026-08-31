class Solution {
    public void duplicateZeros(int[] arr) {
        int zc = 0;
        if (arr.length == 1) {
            return;
        }
        int i = 0;
        int boundary = -1;
        while (i + zc < arr.length) {
            if (arr[i] == 0) {
                if (i + zc == arr.length - 1) {
                    boundary = i;
                }
                zc++;
            }
            i++;
        }
        int j;
        if (boundary != -1) {
            arr[arr.length - 1] = 0;
            i = boundary - 1;
            j = arr.length - 2;
        } else {
            i--;
            j = arr.length - 1;
        }
        while (i >= 0) {
            if (arr[i] == 0) {
                arr[j] = 0;
                arr[j - 1] = 0;
                i--;
                j -= 2;
            } else {
                arr[j] = arr[i];
                i--;
                j--;
            }
        }
    }
}