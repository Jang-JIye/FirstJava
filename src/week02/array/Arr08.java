package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최댓값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        // 최대값 초기 세팅
        int max = arr[0];

        // 최대값 구하기 로직
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("최대값은 => " + max);
        System.out.println("------------------");

        // 최소값 구하기
        int[] arr1 = {3, 2, 1, 5, 1};

        // 최소값 초기 세팅
        int min = arr[0];

        // 최소값 구하기 로직
        for (int num1 : arr1) {
            if (num1 < min) {
                min = num1;
            }
        }
        System.out.println("최소값은 => " + min);
        System.out.println("=================");
    }
}
