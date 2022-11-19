import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.winiol.TriangleCheck;

import java.util.ArrayList;



public class TriangleCheckTests {

    private ArrayList<sideLengths> numberList;

    /**
     * Get data for tests.
     */
    @Before
    public void prepareDataForTest() {
        numberList = new ArrayList<>();
        numberList.add(new sideLengths(2, 3, 4, true));
        numberList.add(new sideLengths(16, 13, 4, true));
        numberList.add(new sideLengths(6, 6, 6, true));
        numberList.add(new sideLengths(2, 3, 5, true));
    }
    /**
    Test if given sides lengths can create triangle.
     */
    @Test
    public void triangleCheckTest () {
        TriangleCheck check = new TriangleCheck();

        for(sideLengths sides: numberList){

            boolean result = check.isTriangle(sides.getA(), sides.getB(), sides.getC());
            Assert.assertEquals(sides.getResult(), result);
        }
    }

/**
    Get sides lengths of triangle;
 */
    public class sideLengths {
        private final int a;
        private final int b;
        private final int c;
        private boolean result;

         sideLengths(int a, int b, int c, boolean result) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.result = result;
        }

        public int getA() {
            return a;
        }
        public int getB() {
            return b;
        }
        public int getC() {
            return c;
        }
        public boolean getResult() { return result; }

    }
}

