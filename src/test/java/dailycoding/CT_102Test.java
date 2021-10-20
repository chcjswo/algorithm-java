package dailycoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chcjswo on 2020-06-30
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
class CT_102Test {

    @Test
    void ct102Test() {
        CT_102 ct_102 = new CT_102();

        assertEquals("A", ct_102.getAlpha(1));
        assertEquals("Z", ct_102.getAlpha(26));
        assertEquals("AA", ct_102.getAlpha(27));
        assertEquals("DB", ct_102.getAlpha(106));
        assertEquals("AAD", ct_102.getAlpha(706));
    }

}
