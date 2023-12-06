public class C04Operator {
    public static void main(String[] args) {
//        산술연산
//        int num1=8,num2=3;
////        *(곱셈),/(나눗셈),%(나머지)
//        System.out.println("num1 + num2 ="+(num1+num2));
//        System.out.println("num1 - num2 ="+(num1-num2));
//        System.out.println("num1 * num2 ="+(num1*num2));
//        System.out.println("num1 / num2 ="+(num1/(double)num2));
//        System.out.println("num1 % num2 ="+(num1%num2));

//      대입 연산자
//        int a =10;
//        a +=20; => a+20=30;
//        a -=20; => a-20=10;
//            int n1=7, n2=7, n3=7;
//            n1 = n1-3;
//            n2 -= 3;
//            n3 = -3;

//            /= , %=

//        int n4 = 10; int n5 = 10;
////        n4  /= 3;
////        n5  %=3; ->이렇게 해도 됨
//        System.out.println("/=의 결과는 "+ (n4 /= 3));
//        System.out.println("%=의 결과는 "+ (n5 %= 3));
//
//        증감연산자
//        전위증감 현재라인의 명령문이 실행되기전에 값이 증감 ++x , --x
//        int c=5;
//        int d=++c;
//        System.out.println(c);
//        System.out.println(d);
//
////        후위증감  현재 라인의 명령문이 실행되고 나서 값이 증감 x++, x--
//        int a =5;
//        int b =a++;
//        System.out.println(a);
//        System.out.println(b);

//        비교연산자
//                ==, !=,>,>=,<,<=
//        char char1 = 'a';
//        char char2 = 'A';
//        System.out.println(char1 == char2);
//        System.out.println(char1 != char2);

//        논리연산자
//        &&, ||, !
//        int num1 = 10; int num2 = 20;
//        boolean result1, result2;
//        result1 =(num1>5) && (num1<20);
////        result1 =(num1>5) && !(num1<20);  //false
//        result2 =(num2<10)|| (num2<30);
////      result1 에 num1이 5보다 큰 지 num1이 20보다 작은지 조건은 and조건을 통해 boolean값 담기
//        System.out.println(result1);
////      result2 가 10보다 작은 조건, 30보다 작은 조건이 or조건을 통해 boolean값 담기
//        System.out.println(!result2);

//      비트연산자 : &, 각 자리의 수가 모두 1일때만 1
//        System.out.println(2 & 1);
////        비트연산자
////        0000101  0000110
//        int n1 = 5, n2 = 6;
////        &(and) : 각 자리의 수가 모두 1일 경우만 1
//        System.out.println(n1 & n2); // 0000100 => 4
////        |(or) : 각 자리의 수에 1이 하나만 있어도 1
//        System.out.println(n1 | n2); // 0000111 => 7
////        ^(xor) : 각 자리수가 일치하지 않은 경우만 1
//        System.out.println(n1 ^ n2); // 0000011 => 3
////        ~(not) : 각 자리의 반대 숫자 반환
//        System.out.println(~n1);

////        시프트연산자 : <<(x2), >>(/2) 곱셈과 나눗셈의 효과가 발생
//        System.out.println(n1 << 1); // 001010 => 10

//        컴퓨터의 덧셈 과정
        int a = 13; // 00001101
        int b = 9;  // 00001001
        while(b!=0) {
            int same_index = a & b; // and연산으로 구한 carry 생성
            a = a ^ b; // xor연산으로 구한 비트값 a에 할당
            b = same_index << 1;
            /* 첫번째 반복
            sameindex:1001
            a:00100
            b:10010
               두번째 반복
            sameindex:0
            a:10110
            b:0         */
        }
        System.out.println(a); // 10110 => 22



    }
}
