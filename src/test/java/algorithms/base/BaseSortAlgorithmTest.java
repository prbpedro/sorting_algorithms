
package algorithms.base;

import com.github.prbpedro.sortingalgorithms.algorithms.interfaces.ISortAlgorithmExecutioner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.ArrayGeneratorUtil;
import java.util.Arrays;
import static org.testng.Assert.*;

public abstract class BaseSortAlgorithmTest {
    
    private ArrayGeneratorUtil arrayGenerator;
    
    @BeforeClass
    public void initialize(){
        arrayGenerator = new ArrayGeneratorUtil();
    }
    
    @Test
    public void sortTest() {
        for(int i=0; i<10; i++){
            Integer[] toSort = arrayGenerator.getUnsortedIntArray(1000);
        
            ISortAlgorithmExecutioner<Integer> executioner = getExecutionerImpl();

            Integer[] javaSorted = Arrays.copyOf(toSort, toSort.length);
            Arrays.sort(javaSorted);

            executioner.sort(toSort);

            assertTrue(Arrays.equals(javaSorted, toSort));
        }
    }
    
    public abstract ISortAlgorithmExecutioner<Integer> getExecutionerImpl();
}
