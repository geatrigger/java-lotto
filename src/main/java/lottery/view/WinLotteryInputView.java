package lottery.view;

import lottery.domain.Lottery;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WinLotteryInputView implements InputView<Lottery> {
    Scanner scanner = new Scanner(System.in);
    @Override
    public Lottery receive() {
        System.out.println("지난 주 당첨 번호를 입력해주세요.");
        List<Integer> numbers = Arrays.stream(scanner.next().split(",")).map(Integer::parseInt).collect(Collectors.toList());
        return Lottery.createLottery(numbers);
    }
}
