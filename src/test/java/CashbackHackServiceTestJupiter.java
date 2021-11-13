import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJupiter {

    @org.junit.jupiter.api.Test
    public void shouldTestRemainFrom0() {
        CashbackHackService service = new CashbackHackService();
        int payment = 0;

        int actual = service.remain(payment);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainFrom1() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1;

        int actual = service.remain(payment);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainFrom1000() {
        CashbackHackService service = new CashbackHackService();
        int payment = 1000;

        int actual = service.remain(payment);
        int expected = 1000;
        assertEquals(actual, expected);

    }
}