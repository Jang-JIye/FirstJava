package week02;

import java.util.*;

public class Recipes02 {
    public static void main(String[] args) {
        // 레시피를 입력하고 다시 저장할 수 있도록 루프를 걸어줍니다.
        while (true) {

            //*입력값  - 저장할 자료구조명을 입력합니다. (List / Set / Map)
            Scanner sc = new Scanner(System.in);
            System.out.println("저장할 방법을 적어주세요 - (List / Set / Map)");
            String collectionName = sc.next();
            System.out.println("-----------------------");

            //- 내가 좋아하는 요리 제목을 먼저 입력합니다.
            System.out.println("요리 제목을 입력하세요 : ");
            String title = sc.next();
            System.out.println("별점을 매겨주세요 : ");
            float star = sc.nextFloat();
            int intStar = (int) star;
            float perStar = intStar * 100 / 5;
            System.out.println("-----------------------");

            //- 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
            System.out.println("요리 레시피를 한문장씩 입력해주세요! : ");
            switch (collectionName) {
                case "List":
                    ArrayList<String> strList = new ArrayList<>();
                    while (true) {
                        String yori = sc.next();
                        //- 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
                        if (strList.size() > 9) {
                            System.out.println("요리 레시피는 최대 10문장만 가능합니다 :)");
                            System.out.println(" ");
                            break;
                        }
                        if (Objects.equals(yori, "끝")) {
                            break;
                        }
                        strList.add(yori);
                    }
                    //*출력값      - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
                    System.out.println("[ List 형식의 '" + title + "' ]");
                    System.out.println("별점 : " + intStar + " (" + perStar + "%)");
                    //- 이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.
                    for (int i = 0; i < strList.size(); i++) {
                        int num = i + 1;
                        System.out.println(num + ". " + strList.get(i));
                    }
                    break;

                case "Set":
                    Set<String> strSet = new HashSet<>();
                    while (true) {
                        String yori = sc.next();
                        if (Objects.equals(yori, "끝")) {
                            break;
                        }
                        strSet.add(yori);
                    }
                    System.out.println("[ Set 형식의 '" + title + "' ]");
                    System.out.println("별점 : " + intStar + " (" + perStar + "%)");

                    Iterator iterator = strSet.iterator();
                    for (int i = 0; i < strSet.size(); i++) {
                        int num = i + 1;
                        System.out.println(num + ". " + iterator.next());
                    }
                    break;

                case "Map":
                    Map<Integer, String> strMap = new HashMap();
                    int keyNum = 0;
                    while (true) {
                        String yori = sc.next();
                        if (Objects.equals(yori, "끝")) {
                            break;
                        }
                        strMap.put(keyNum++, yori);
                    }
                    System.out.println("[ Map 형식의 '" + title + "' ]");
                    System.out.println("별점 : " + intStar + " (" + perStar + "%)");

                    for (int i = 0; i < strMap.size(); i++) {
                        int num = i + 1;
                        System.out.println(num + ". " + strMap.get(i));
                    }
                    break;

                default:
                    System.out.println("저장할 수 있는 자료구조가 아닙니다.(only : List / Set / Map)");
            }
            System.out.println("계속해서 레시피를 저장하시겠습니까? (Y / N) : ");
            String yesNo = sc.next();
            if (yesNo.equals("N")) {
                System.out.println("레시피 저장을 마쳤습니다!");
                break;
            }
        }
    }
}


