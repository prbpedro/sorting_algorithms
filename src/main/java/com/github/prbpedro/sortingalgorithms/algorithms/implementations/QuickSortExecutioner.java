package com.github.prbpedro.sortingalgorithms.algorithms.implementations;

import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;

public class QuickSortExecutioner implements ISortAlgorithmExecutioner<Integer> {

    @Override
    public void sort(Integer[] unsortedArr) {
        executeQuickSort(unsortedArr, 0, unsortedArr.length-1);
    }
    
    private void executeQuickSort(Integer[] arr, int lo, int hi){
        
        if(lo<hi){
            int p = partitionateArr(arr, lo, hi);
            executeQuickSort(arr, lo, p-1);
            executeQuickSort(arr, p+1, hi);
        }
    }

    private int partitionateArr(Integer[] arr, int start, int end) {
        final int pivot=arr[end];
        int i=start-1;
        
        for(int j=start; j<end; j++){
            if(arr[j]<pivot){
                i++;
                final int swapTemp = arr[i];
                arr[i]=arr[j];
                arr[j]=swapTemp;
            }
        }
        
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        
        return i+1;
    }
}
