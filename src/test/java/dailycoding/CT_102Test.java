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

//        assertThat(ct_102.getAlpha(1), is("A"));
//        assertThat(ct_102.getAlpha(26), is("Z"));
//        assertThat(ct_102.getAlpha(27), is("AA"));
//        assertThat(ct_102.getAlpha(106), is("DB"));
        assertEquals("AAD", ct_102.getAlpha(706));
    }

}
