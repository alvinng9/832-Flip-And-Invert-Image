package org.example;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //reverse the values in each row
        for (int[] row : image) {
            for (int i = 0; i < row.length/2; i++) {
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = temp;
            }
        }
        //swap 1 for 0 and 0 for 1 for each index
        for (int[] row : image) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == 0) {
                    row[i] = 1;
                } else {
                    row[i] = 0;
                }
            }
        }
        return image;
    }
}
