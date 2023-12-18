package C12ClassLecture;

import java.util.Arrays;

public class C1206RecursiveBasic {
    public static void main(String[] args) {
//        for문을 이용해서 1~10까지 누적합계
//        int sum =0;
//        for(int i=1; i<11 ; i++){
//            sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(add_acc(10));
//        누적곱하기값(팩토리얼 10*9*8....)
        System.out.println(multi_acc(10));
        System.out.println(pivo_for());
        System.out.println(fibonacci(10));
        System.out.println(facto(10));
        int n=10;
        int[] arr = new int[n];
//    fibo for문(배열)
//    memorization(기억알고리즘 - DP)
//    단계마다 계산결과값이 필요할 때 메모이제이션 활용
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<n; i++){
            arr[i] =arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[n-1]);
    }

//    메소드가 자기자신을 호출하는 메소드를 재귀함수라고하고, 이러한 호출방식을 재귀호출이라고 한다.
    static int add_acc(int n){
        if(n==1){
            return 1;
        }
        return n+add_acc(n-1);
    }
    static int multi_acc(int n){
        if(n==1){
            return 1;
        }
        return n*multi_acc(n-1);
    }
   static int pivo_for(){
       int a = 0;
       int b = 1;
       int sum = 0;

       for (int i = 0; i < 9; i++) {
           sum = a + b;
           a = b;
           b = sum;
       }

       return sum;
    }
//    fibonaci 재귀함수

    static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return  fibonacci(n-1) + fibonacci(n-2);
    }
    static int facto(int n){
        if(n<=1){
            return 1;
        }
        return n*facto(n-1);
    }
//    fibo배열



}
