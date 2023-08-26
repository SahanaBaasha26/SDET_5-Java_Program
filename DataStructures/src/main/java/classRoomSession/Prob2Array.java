package classRoomSession;

public class Prob2Array {
    public static void main(String[] args) {
        // Step 1: Initialize Arrays and Output Array
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5};
        int[] output = new int[arr1.length];

        // Step 2: Calculate the Result for Each Element
        for (int i = 0; i < arr1.length; i++) {
            int sumArr2ExcludingIndex = 0;

            for (int j = 0; j < arr2.length; j++) {
                if (j != i) {
                    sumArr2ExcludingIndex += arr2[j];
                }
            }

            output[i] = sumArr2ExcludingIndex - arr1[i];
        }

        // Step 3: Print the Results
        for (int result : output) {
            System.out.println(result);
        }
    }
}
