import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        AntSequenceAlgorithm antSequenceAlgorithm = new AntSequenceAlgorithm();

        String insertion = insert(scanner);

        while (!insertion.equals("z")) {
            try {
                int n = Integer.parseInt(insertion);

                if (n < 3 || n > 100) {
                    throw new IllegalArgumentException();
                }
                System.out.println("결과값: " + antSequenceAlgorithm.solution(n) + "\n");
            } catch (IllegalArgumentException e) {
                printInputErrorMessage();
            }

            insertion = insert(scanner);
        }
    }

    private static String insert(final Scanner scanner) {
        System.out.print("n(3부터 100)을 입력하세요(종료를 원하면 z를 입력하세요): ");
        return scanner.nextLine();
    }

    private static void printInputErrorMessage() {
        System.out.println("3부터 100까지의 숫자를 입력하세요!\n");
    }
}
