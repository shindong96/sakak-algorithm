import java.util.ArrayList;
import java.util.List;

public class AntAlgorithm2 {

    public String solution(final int n) {
        List<Integer> lN = new ArrayList<>();
        lN.add(1);

        for (int i = 1; i < n; i++) {
            lN = nextStep(lN);
        }

        int size = lN.size();

        return String.valueOf(lN.get(size / 2 - 1))
                + lN.get(size / 2);
    }

    private List<Integer> nextStep(final List<Integer> lN) {
        List<Integer> nextLN = new ArrayList<>();

        for (int i = 0; i < lN.size(); i++) {
            int num = lN.get(i);
            int count = 1;
            int idx = 1;

            while (count < 3 && i + idx < lN.size()) {
                if (!lN.get(i + idx).equals(num)) {
                    break;
                }

                count++;
                idx++;
            }

            nextLN.add(count);
            nextLN.add(num);
            i += (idx - 1);
        }

        return nextLN;
    }
}
