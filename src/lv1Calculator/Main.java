package lv1Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 처음은 클래스 없이 절차지향적으로 계산기를 만듭니다

        // 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

        //입력을 받는다. 이 입력을 공백을 포함해서 받을건가? 아니면 하나하나 따로따로 받을건가? 공백으로 받자.
        long leftValue, rightValue; // 받을 숫자 롱타입
        char operator;
        String temp; // 버퍼 비우는용도
        int exitCatch = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (true) {
                System.out.println("계산기가 작동중입니다. 종료하시려면 exit를 입력해 주시면 되고");
                System.out.printf("숫자 숫자 연산기호를 입력해 주세요 (계산결과는 정수형입니다) : ");
                String lineText = scanner.nextLine();
                Scanner scanner2 = new Scanner(lineText); // 입력받은 버퍼를 활용하기 위해서 여기가 킥!
                if (lineText.indexOf("exit") >= 0) { // exit 입력과 계산입력을 병렬적으로 사용하기 위해 고민했음
                    exitCatch++;
                    break;
                }
                try {
                    leftValue = scanner2.nextLong();
                    rightValue = scanner2.nextLong();
                    operator = scanner2.nextLine().charAt(1);
                    switch (operator) {
                        case '+':
                            System.out.println(leftValue + " + " + rightValue + " = " + (leftValue + rightValue));
                            break;
                        case '-':
                            System.out.println(leftValue + " - " + rightValue + " = " + (leftValue - rightValue));
                            break;
                        case '*':
                            System.out.println(leftValue + " * " + rightValue + " = " + (leftValue * rightValue));
                            break;
                        case '/':
                            try {
                                System.out.printf(leftValue + " / " + rightValue + " 의 몫 = ");
                                if (leftValue < 0) {
                                    if (rightValue < 0) {
                                        System.out.println((leftValue / rightValue) + 1);
                                    } else {
                                        System.out.println((leftValue / rightValue) - 1);
                                    }
                                } else {
                                    System.out.println((leftValue / rightValue));
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("분모에 0이 들어올 수 없습니다.");
                                continue;
                            }
                        default:
                            System.out.println("잘못된 연산 입력입니다. (+,-,*,/)");
                            continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("숫자를 잘못 입력하셨습니다");
                    temp = scanner2.nextLine();
                    // 버퍼 비우기. 입력을 다시 받아야 하기 때문이고. 숫자에서 에러나면 뒤의 개행을 지워야 하기 때문
                    // 그런데 만약 엔터로 점철된 입력이였을 수도 있으니
                    // 반복문으로 수정할 필요 있음!
                }
            }
            if (exitCatch == 1) {
                break;
            }
        }
    }
}