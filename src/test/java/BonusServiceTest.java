import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 10;
        long actual = service.calculate(1_000, false);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, false);

        Assertions.assertEquals(expected, actual);
    }
}