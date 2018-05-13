Main Class: 


public class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }

}

---------------------------------------------------------------------------------------------------


// Parameterized via Constructor

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    private int numberA;
    private int numberB;
    private int expected;

    // Inject via constructor
    // for {8, 2, 10}, numberA = 8, numberB = 2, expected = 10
    public ParameterizedTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

	// name attribute is optional, provide an unique name for test
	// multiple parameters, uses Collection<Object[]>
    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }


    @Test
    public void test_addTwoNumbes() {
    	System.out.println(""+numberA+"+ "+numberB+"?= "+expected);
        assertThat(MathUtils.add(numberA, numberB), is(expected));
    }

}

---------------------------------------------------------------------------------------------------

package stable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    //default value = 0
    // all the Parameters should be defined public
    @Parameter(value = 0)
    public int numberA;

    @Parameter(value = 1)
    public int numberB;

    @Parameter(value = 2)
    public int expected;

    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }

    @Test
    public void test_addTwoNumbes() {
    	System.out.println(""+numberA+"+ "+numberB+" ?= "+expected);
        assertThat(MathUtils.add(numberA, numberB), is(expected));
    }

}

reference: https://www.mkyong.com/unittest/junit-4-tutorial-6-parameterized-test/
---------------------------------------------------------------------------------------------------
// Advanced Tests:

import java.util.Arrays;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class HelloLinkAdvancedTests{

    
    @Test(expected = IndexOutOfBoundsException.class) 
    public void IndexOutOfBoundsTest()
    {
        HelloLink vHelloLink = new HelloLink(5);
        vHelloLink.mVector.get( 6 );
    }

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSame() {
        assertEquals(1, 1);
    }

    @Test(timeout=1000)
    public void testWithTimeout() {
        //
    }

}