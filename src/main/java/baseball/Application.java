package baseball;

import baseball.domain.Judgment;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 객체 지향 프로그래밍
 * 1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
 * 2. 필요한 기능을 (역활에 맞는) 인스턴스가 수행한다.(의인화)
 * 3. 각 결과를 종합한다.
 */
public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Referee referee = new Referee();
        List<Integer> computer = generator.createRandomNumber();

        String result = "";
        while (!result.equals("0 볼 3 스트라이크")){
            result = referee.compare(computer,askNumber());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다.");

    }

    public static List<Integer> askNumber(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for( String number : input.split(" ")){
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
