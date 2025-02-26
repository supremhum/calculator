package lv1Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 처음은 클래스 없이 절차지향적으로 계산기를 만듭니다

        //입력을 받는다. 이 입력을 공백을 포함해서 받을건가? 아니면 하나하나 따로따로 받을건가? 공백으로 받자.
        short leftValue, rightValue; // 받을 숫자 변수 설정
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자 숫자 연산기호를 입력해 주세요 : ");
        leftValue = scanner.nextShort();
        rightValue = scanner.nextShort();
//        scanner.nextline();//버퍼비우기?
        operator = scanner.next(); // 공백이후 문자열을 받는것으로 해결

        switch (operator) {
            case "+" :
                System.out.println(leftValue + rightValue);
                break;
            case "-" :
                System.out.println(leftValue - rightValue);
                break;
            case "*" :
                System.out.println(leftValue * rightValue);
                break;
            case "/" :
                System.out.println(leftValue / rightValue);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        scanner.nextLine(); // 버퍼 지움 공부 필요
        scanner.close(); // 스캐너는 닫아주는게 예의
    }
}