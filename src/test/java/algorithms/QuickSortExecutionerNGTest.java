package algorithms;

import algorithms.base.BaseSortAlgorithmTest;
import com.github.prbpedro.sortingalgorithms.algorithms.implementations.QuickSortExecutioner;
import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;

public class QuickSortExecutionerNGTest extends BaseSortAlgorithmTest{

    @Override
    public ISortAlgorithmExecutioner<Integer> getExecutionerImpl() {
        return new QuickSortExecutioner();
    }
}