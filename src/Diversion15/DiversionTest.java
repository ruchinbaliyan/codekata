package Diversion15;

import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// to find the number of binary numbers with length n ,which do not have two consecutive 1's
public class DiversionTest {
    @Test
    public void TestDiversion()
    {
        assertEquals( Diversion.findNumber(2),3);
        assertEquals( Diversion.findNumber(3),5);



    }
}
