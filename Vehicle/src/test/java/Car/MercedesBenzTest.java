package Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercedesBenzTest {
    MercedesBenz Car1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Car1 = new MercedesBenz("Luxury", 176, 35000, "FiveWeeks");
    }

    @org.junit.jupiter.api.Test
    void getMercedesBenzCost() {
        Car1.GetMercedesBenzCost(10);
    }

    @org.junit.jupiter.api.Test
     void exchangeRates() {
        Car1.ExchangeRates("UGX", "USD", 10);
        double expected = 350000;
        assertEquals(expected, Car1.GetMercedesBenzCost(20));
    }
}