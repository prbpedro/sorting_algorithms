package com.github.prbpedro.sortingalgorithms.algorithms.implementations;

import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;

public class BubbleSortExecutioner implements ISortAlgorithmExecutioner<Integer> {

    @Override
    public void sort(Integer[] unsortedArr) {
        
        while(true){
            boolean hasSwapped = false;
            for(int i=0; i<unsortedArr.length; i++){
                if(i+1 < unsortedArr.length && unsortedArr[i] > unsortedArr[i+1]){
                    int iValue = unsortedArr[i];
                    int iPOneValue = unsortedArr[i+1];
                    unsortedArr[i] = iPOneValue;
                    unsortedArr[i+1] = iValue;
                    hasSwapped = true;
                }
            }
            
            if(!hasSwapped){
                break;
            }
        }
    }
}
