package algorithms;

import algorithms.base.BaseSortAlgorithmTest;
import com.github.prbpedro.sortingalgorithms.algorithms.implementations.MergeSortExecutioner;
import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;

public class MergeSortTestNGTest extends BaseSortAlgorithmTest{

    @Override
    public ISortAlgorithmExecutioner<Integer> getExecutionerImpl() {
        return new MergeSortExecutioner();
    }
}