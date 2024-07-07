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
}