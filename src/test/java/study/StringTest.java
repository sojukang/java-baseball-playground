package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
	@Test
	void replace() {
		String actual = "abc".replace("b", "d");
		assertThat(actual).isEqualTo("adc");
	}

	@Test
	@DisplayName("(,) split test")
	void splitTest() {
		String[] actual = "1,2".split(",");
		assertThat(actual).isEqualTo(new String[] {"1", "2"});
	}

	@Test
	@DisplayName("1 split test")
	void splitNoTest() {
		String[] actual = "1".split(",");
		assertThat(actual).isEqualTo(new String[] {"1"});
	}

    @Test
    @DisplayName("()제거")
    void removeParenthesisTest() {
        String actual = "(1,2)";
        actual = actual.substring(1, actual.length()-1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치 문자 가져오기")
    void charAtTest() {
        String actual = "abc";
        assertThat(actual.charAt(0)).isEqualTo('a');
    }

    @Test
    @DisplayName("chatAt StringIndexOutOfBoundsException")
    void charAtExceptionTest() {
        String actual = "abc";
        assertThatThrownBy(() -> {
            actual.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("range: 3");
    }
}
