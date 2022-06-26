import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void totalMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.totalMonth(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void averageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageMonth(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {1_000_000, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 3_000_000};

        long actual = service.maxSales(sales);
        long expected = 12;

        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, -5, 13, 15, 17, 20, 19, 20, 7, 14, 0, 18};

        long actual = service.minSales(sales);
        long expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 7_000, 19, 20, 7, 14, 14, 18};

        long actual = service.belowAverageSales(sales);
        long expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {25, 15, 13, 15, 17, 2_000, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveAverageSales(sales);
        long expected = 1;

        assertEquals(expected, actual);
    }
}
