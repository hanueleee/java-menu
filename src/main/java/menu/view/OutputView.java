package menu.view;

import java.util.List;

public class OutputView {
    private final String START_MESSAGE = "점심 메뉴 추천을 시작합니다.\n";
    private final String END_MESSAGE = "\n추천을 완료했습니다.";
    private final String RESULT_MESSAGE = "\n메뉴 추천 결과입니다.";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printResult(List<String> categoryResult, List<List<String>> menuResult) {
        System.out.println(RESULT_MESSAGE);
        System.out.println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
        for (int i = 0; i < categoryResult.size(); i++) {
            if (i == 0) {
                System.out.print("[ " + categoryResult.get(i) + " | ");
            }
            if (i == categoryResult.size() - 1) {
                System.out.println(categoryResult.get(i) + " ]");
            }
            if (0 < i && i < categoryResult.size() - 1) {
                System.out.print(categoryResult.get(i) + " | ");
            }
        }
        for (List<String> strings : menuResult) {
            for (int i = 0; i < strings.size(); i++) {
                if (i == 0) {
                    System.out.print("[ " + strings.get(i) + " | ");
                }
                if (i == strings.size() - 1) {
                    System.out.println(strings.get(i) + " ]");
                }
                if (0 < i && i < strings.size() - 1) {
                    System.out.print(strings.get(i) + " | ");
                }
            }
        }
    }

    public void printEndMessage() {
        System.out.println(END_MESSAGE);
    }
}
