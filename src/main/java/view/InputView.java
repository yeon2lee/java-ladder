package view;

import java.util.List;
import java.util.Scanner;

public class InputView {
    Scanner scan = new Scanner(System.in);

    public List<String> getPeopleName() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String input = scan.nextLine();
        return splitName(input);
    }

    private List<String> splitName(String input) {
        return List.of(input.split(","));
    }

    public int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String input = scan.nextLine();
        return parseNumeric(input);
    }

    private int parseNumeric(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("사다리 높이는 숫자여야 합니다.");
        }
    }
}