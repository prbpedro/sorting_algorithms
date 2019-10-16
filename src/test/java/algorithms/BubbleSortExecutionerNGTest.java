package algorithms;

import algorithms.base.BaseSortAlgorithmTest;
import com.github.prbpedro.sortingalgorithms.algorithms.implementations.BubbleSortExecutioner;
import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;

public class BubbleSortExecutionerNGTest extends BaseSortAlgorithmTest{

    @Override
    public ISortAlgorithmExecutioner<Integer> getExecutionerImpl() {
        return new BubbleSortExecutioner();
    }
}