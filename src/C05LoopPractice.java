public class C05LoopPractice {
    public static void main(String[] args) {
//        짝수의 핪
//        int sum = 0;
//        for(int a = 0; a<21; a++){
//            if(a%2 == 0){
//                sum += a;
//            }
//        }
//        System.out.println(sum);
//
////        숫자뒤집기
//        int a = 2345;
//        int b = 0;
//        int c = 0;
////        System.out.println(a%10);
//        while(true){
//            b=(a%10);
//            c=c*10+b;
//            a /= 10;
//            if(a==0){
//                break;
//            }
//        }
//        System.out.println(c);

//        최대 공약수 구하기
        int a =24; int b = 36;
        int ans = a>b? b: a;
        int maxNum =0;
        for(int i=1; i<=ans;i++){
            if((a%i == 0) && (b%i == 0)){
                maxNum = a;
            }
        }
        System.out.println(ans);

        int minNum = a/maxNum * b/maxNum;

    }
}
