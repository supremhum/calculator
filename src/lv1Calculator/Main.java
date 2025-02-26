package lv1Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 처음은 클래스 없이 절차지향적으로 계산기를 만듭니다

        //입력을 받는다. 이 입력을 공백을 포함해서 받을건가? 아니면 하나하나 따로따로 받을건가? 공백으로 받자.
        int leftValue, rightValue; // 받을 숫자 변수 설정
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자 숫자 연산기호를 입력해 주세요 : ");
        leftValue = scanner.nextInt();
        rightValue = scanner.nextInt();
        operator = scanner.nextLine();
        System.out.println("operator = " + operator);
        operator.charAt(0);
        System.out.println("operator = " + operator);
        System.out.println(leftValue + " " + operator + " " + rightValue + " = "+(leftValue+operator.charAt(0)+rightValue));//35
//        System.out.println(operator);
        // plus를 받아 입력을. 이건 글자로 받겠지 컴퓨터가 해석하는데 글자로 해석하잖아.
        // 변수와 리터럴의 관계를 생각해봐.
        // 아니 일단 그래 입력한 연산기호를 변수로 설정은 해뒀어 근데 그 연산기호의 이미지를 바꾸겠다는게 아니잖아.
        // 만약에 operator가 이젠 키보드입력 + 랑 같다고 쳐봐. 그래서 뭘 할수있는데?
        // 따라서 그냥 스위치 구문으로 생각이나 하렴 재영아.
        
    }
}