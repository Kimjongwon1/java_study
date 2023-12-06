import java.util.Arrays;
import java.util.Scanner;

public class C06LoopStatements {
    public static void main(String[] args) {

//        while (true){
//            System.out.println("비밀번호를 입력하시오");
//            Scanner sc = new Scanner(System.in);
//            String pw = "1234";
//            String input = sc.nextLine();
//            if (pw.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else{  // 문자열비교 : equals()
//                    System.out.println("비밀번호가 틀렸습니다.");
//                }
//            }
//        int a =0;
//        while (a<5){
//            System.out.println("비밀번호를 입력하시오");
//            Scanner sc = new Scanner(System.in);
//            String pw = "1234";
//            String input = sc.nextLine();
//            if (pw.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else{  // 문자열비교 : equals()
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//        }
//
//        while (true){
//            System.out.println("비밀번호를 입력하시오");
//            Scanner sc = new Scanner(System.in);
//            String pw = "1234";
//            String input = sc.nextLine();
//            if (pw.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else{  // 문자열비교 : equals()
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5){
//                System.out.println("입력횟수초과");
//                break;
//            }
//        }
//    int a=0;
//        while (true){
//            System.out.println("비밀번호를 입력하시오");
//            Scanner sc = new Scanner(System.in);
//            String pw = "1234";
//            String input = sc.nextLine();
//            if (pw.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else{  // 문자열비교 : equals()
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5){
//                System.out.println("입력횟수초과");
//                break;
//            }
//        }
//        int a = 2;
//        do{
//            System.out.println(a++);
//        }
//        while(a < 11);


//        for

//            for(int a=2;a<11;a++){
//                System.out.println(a);
//            }

//        continue; 예제
//        for(int a=1;a<11;a++){
//            if(a % 2 !=0){
//                System.out.println(a);
//            }else {
//                continue;
//            }
//
//        }

//        enhanced for 문/배열
//        int[] myArr = {1, 2, 3, 4, 5};
//        for(int i = 0; i<5; i++){
//            System.out.println(myArr[i]);
//        }
//        enhanced for문
//        for(int a : myArr){
//            System.out.println(a);
//        }
//      일반 for문을 통해 myArr의 값에 10씩 더한뒤 출력

//        for(int i = 0; i<myArr.length; i++){
//            myArr[i] +=10;
//        }
//
//        System.out.println(Arrays.toString(myArr));
//
//        for(int a : myArr){
//            a +=10;
//        }
//        System.out.println(Arrays.toString(myArr));


//        {}까지 유효하다(자바에서)
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); //if문 밖에서 선언된 변수값을 if문안에서 접근하여 변경하는것은 가능
////        System.out.println(abc); //if문에서 정의된 변수는 인지불가
//        }
//        다중반복문

//        System.out.println("구구단 단수를 입력하세요.");
//        int input = sc.nextInt();
//        int a = 1;
//        while (a < 10) {
//            System.out.println(input + " X " + a + " = " + (input * a));
//            a++;
//        }
//        int sum =0;
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i+"단입니다.");
//            for(int j =1; j< 10; j++){
//                sum=i*j;
//                System.out.println(i+"X"+j+"="+sum);
//            }
//        }
//       2중for문을 통해 배열 접근
        int[][] arr = {{1,2,3,4,5},{5,6,7,8,9}};
//        System.out.println(arr[0][1]);
        for(int i=0; i<2; i++){
            for (int j=0; j<5; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
//        while

