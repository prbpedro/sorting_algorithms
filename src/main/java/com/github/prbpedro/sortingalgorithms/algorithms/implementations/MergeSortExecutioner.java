package com.github.prbpedro.sortingalgorithms.algorithms.implementations;

import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;
import java.util.Arrays;

public class MergeSortExecutioner implements ISortAlgorithmExecutioner<Integer> {

    @Override
    public void sort(Integer[] unsortedArr) {
        executeMerge(unsortedArr, unsortedArr.length);
        
    }
    
    private void executeMerge(Integer[] unformattedArr, int arrayLenght){
        if(arrayLenght<2){
            return;
        }
        
        int middle = unformattedArr.length / 2;
        
        var unformattedL = Arrays.copyOfRange(unformattedArr, 0, middle);
        var unformattedR = Arrays.copyOfRange(unformattedArr, middle, unformattedArr.length);
        
        executeMerge(unformattedL, unformattedL.length);
        executeMerge(unformattedR, unformattedR.length);
        
        merge(unformattedArr, unformattedL, unformattedR, middle, arrayLenght - middle);
    }
    
    public static void merge(Integer[] original, Integer[] leftArr, Integer[] rightArr, int left, int right) {

          int i = 0, j = 0, k = 0;
          
          while (i < left && j < right) {
              
              if (leftArr[i] <= rightArr[j]) {
                  original[k++] = leftArr[i++];
              }
              else {
                  original[k++] = rightArr[j++];
              }
          }
          
          while (i < left) {
              original[k++] = leftArr[i++];
          }
          
          while (j < right) {
              original[k++] = rightArr[j++];
          }
    }
}
