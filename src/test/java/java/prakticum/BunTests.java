package prakticum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTests {
    private final String nameExpected;
    private final float priceExpected;
    private Bun bun;

    public BunTests(String nameExpected, float priceExpected) {
        this.nameExpected = nameExpected;
        this.priceExpected = priceExpected;
    }

    @Parameterized.Parameters
    public static Object[][] bunData() {
        return new Object[][]{
                {"", Float.MAX_VALUE},
                {"!@#!$%^&*()", 0f},
                {"null", -99999f},
                {"234234234", 345323.533f},
                {"loooooooooooooooooooooooooooong name of bun", 1f},
                {"0", Float.MIN_VALUE}
        };
    }

    @Test
    public void createBunGetNameTest() {
        bun = new Bun(nameExpected, priceExpected);
        assertEquals(nameExpected, bun.getName());
    }

    @Test
    public void createBunGetPriceTest() {
        bun = new Bun(nameExpected, priceExpected);
        assertEquals(priceExpected, bun.getPrice(), 0);
    }
}
