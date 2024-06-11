public class AntSequenceAlgorithm {

    public String solution(final int n) {
        String lN = "1";

        for (int i = 1; i < n; i++) {
            lN = nextStep(lN);
        }

        return extractAnswer(lN);
    }

    private String nextStep(final String lN) {
        StringBuilder nextLN = new StringBuilder();
        char num = lN.charAt(0);
        int count = 0;

        for (int i = 0; i < lN.length(); i++) {
            if (lN.charAt(i) == num) {
                count++;
                continue;
            }

            nextLN.append(count)
                    .append(num);
            num = lN.charAt(i);
            count = 1;
        }

        nextLN.append(count)
                .append(num);

        return nextLN.toString();
    }

    private String extractAnswer(final String lN) {
        int length = lN.length();
        return lN.substring(length / 2 - 1, length / 2 + 1);
    }
}
