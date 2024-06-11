import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AntSequenceAlgorithm2Test {

    @DisplayName("보고 말하기 수열의 중앙값을 테스트한다.")
    @ParameterizedTest
    @CsvSource({"3,21", "5,12", "8,21", "30,0"})
    void testLookAndSaySequence(int n, String answer) {
        // given
        AntSequenceAlgorithm2 antSequenceAlgorithm = new AntSequenceAlgorithm2();

        // when
        String result = antSequenceAlgorithm.solution(n);

        // then
        assertThat(result).isEqualTo(answer);
    }
}
