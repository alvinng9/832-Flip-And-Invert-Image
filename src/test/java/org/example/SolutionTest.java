package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void flipAndInvertImageTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][]{
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] outputOne = new int[][]{
                {1,0,0},
                {0,1,0},
                {1,1,1}
        };
        assertArrayEquals(outputOne, solution.flipAndInvertImage(inputOne));

        int[][] inputTwo = new int[][]{
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        int[][] outputTwo = new int[][]{
                {1,1,0,0},
                {0,1,1,0},
                {0,0,0,1},
                {1,0,1,0}
        };
        assertArrayEquals(outputTwo, solution.flipAndInvertImage(inputTwo));
    }

}