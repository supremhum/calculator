package lv1Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 처음은 클래스 없이 절차지향적으로 계산기를 만듭니다

        //입력을 받는다. 이 입력을 공백을 포함해서 받을건가? 아니면 하나하나 따로따로 받을건가? 공백으로 받자.
        long leftValue, rightValue; // 받을 숫자 롱타입
        char operator;
        String temp; // 버퍼 비우는용도
        Scanner scanner = new Scanner(System.in);

        // 예외처리 1 : 숫자입력 원하는 타입이 아닌경우
        // 예외처리 2 : 나눗셈 분모 0으로 가지 않기

        // 예외처리 1 : 입력받을때 다른타입이면 오류가 뜨니 오류를 감지하는 try catch 구문을 사용
        // 생각할거리 : 개행이 있는 상태로 입력을 받을수도 있다. 그러면 모든 버퍼를 지워야 한다
        while (true) {
            try {
                System.out.printf("숫자 숫자 연산기호를 입력해 주세요 (계산결과는 정수형입니다) : ");
                leftValue = scanner.nextLong();
                rightValue = scanner.nextLong();
                operator = scanner.nextLine().charAt(1);
                switch (operator) {
                    case '+' :
                        System.out.println(leftValue + rightValue);
                        break;
                    case '-' :
                        System.out.println(leftValue - rightValue);
                        break;
                    case '*' :
                        System.out.println(leftValue * rightValue);
                        break;
                    case '/' :
                        System.out.println(leftValue / rightValue);
                        break;
                    default:
                        System.out.println("잘못된 연산 입력입니다. (+,-,*,/)");
//                        temp = scanner.nextLine(); 연산기호 받는 부분은 후순위고 nextLine 이므로 버퍼가 비워졌으니 필요없음
                        continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("잘못 입력하셨습니다");
                temp = scanner.nextLine();
                // 버퍼 비우기. 입력을 다시 받아야 하기 때문이고. 숫자에서 에러나면 뒤의 개행을 지워야 하기 때문
                // 그런데 만약 엔터로 점철된 입력이였을 수도 있으니
                // 반복문으로 수정할 필요 있음!

            }
        }
        scanner.close(); // 스캐너는 닫아주는게 예의
    }
}