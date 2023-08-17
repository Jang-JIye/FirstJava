import java.util.Scanner;

public class Recipes {
    public static void main(String[] args) {
//     **요리 레시피 메모장 만들기**
//        * 입력값
        Scanner sc = new Scanner(System.in);
//        - 내가 좋아하는 요리 제목을 먼저 입력합니다.
        String title = sc.next();
//        - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
        float star = sc.nextFloat();
        int intStar = (int) star;
        float perStar = intStar * 100 / 5;
//        - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String input4 = sc.next();
        String input5 = sc.next();
        String input6 = sc.next();
        String input7 = sc.next();
        String input8 = sc.next();
        String input9 = sc.next();
        String input10 = sc.next();

//        * 출력값
//        - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
        System.out.println("[" + title + "]");
//        - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
//        - 바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
        System.out.println("별점 : " + intStar + " (" + perStar + "%)");
//        - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5. " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);

    }
}
