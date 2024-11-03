package lotto.view;

public class OutputView {
    private static final String PURCHASE_AMOUNT_REQUEST = "구입금액을 입력해 주세요.";
    private static final String WINNING_LOTTO_NUMBERS_REQUEST = "당첨 번호를 입력해 주세요.";

    public void printPurchaseAmountRequestMessage() {
        printMessage(PURCHASE_AMOUNT_REQUEST);
    }

    public void printPurchaseDetailsMessage(String purchaseDetailsMessage) {
        printNewLine();
        printMessage(purchaseDetailsMessage);
    }

    public void printExitMessage(String message) {
        printMessage(message);
    }

    public void printWinningNumbersRequestMessage() {
        printNewLine();
        printMessage(WINNING_LOTTO_NUMBERS_REQUEST);
    }

    private void printNewLine() {
        printMessage("");
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
