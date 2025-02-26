package lv1Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 처음은 클래스 없이 절차지향적으로 계산기를 만듭니다

        //입력을 받는다. 이 입력을 공백을 포함해서 받을건가? 아니면 하나하나 따로따로 받을건가? 공백으로 받자.
        long leftValue, rightValue; // 받을 숫자 롱타입
        char operator;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자 숫자 연산기호를 입력해 주세요 (계산결과는 정수형입니다) : ");

        leftValue = scanner.nextLong();
        rightValue = scanner.nextLong();
//        operator = scanner.next(); // 공백이후 문자열을 받을 수 있으고 이후 띄어쓰기부터 엔터까진 버퍼에 남는상태
        operator = scanner.nextLine().charAt(1);// 숫자를 받았고 버퍼엔 {space}연산기호{space}~라서 1번째인 연산기호를 저장
//        scanner.nextLine(); // 버퍼비움. 콘솔에 입력후 엔터치면 {enter}=\n 까지 버퍼에 들어간다. 이 {enter}까지 흡수해버리는 코드
//        현 상황에선 없어도 된다 오히려 콘솔창에 엔터입력을 해야돼서 느려짐

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
                System.out.println("잘못된 입력입니다.");
        }
        scanner.close(); // 스캐너는 닫아주는게 예의
    }
}