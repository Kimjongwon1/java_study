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
//        int a =24; int b = 36;
//        int ans = a>b? b: a;
//        int maxNum =0;
//        for(int i=1; i<=ans;i++){
//            if((a%i == 0) && (b%i == 0)){
//                maxNum = i;
//            }
//        }
//        System.out.println(maxNum);

//        int minNum = a/maxNum * b/maxNum;


//        라벨문/loop활용
//        int[][] matrix = {{1,2,3,4},{5,6,7},{8,9},{10,11,12,13,14}};
//        int target = 11;
////        target이 matrix에 i,j번째 배열에 있는지 출력
//        for(int i =0; i<matrix.length;i++){
//            loop2:
//            for(int j=0; j<matrix[i].length; j++){
//                if(target == matrix[i][j]){
//                    System.out.println(matrix[i][j]);
//                    System.out.println(i+","+j+"번째에 있습니다");
//                    break; //15번
//                    // break loop1; //3번
//                }
//
//            }
//        }
//        1~20의 숫자 중 약수를 5개 이상가진 숫자 중 가장 작은 숫자를 구하시오
//        내가 한 거(count 위치 틀림 , j값 범위 생각안함)
//        int count = 0;
//        loop1:
//        for(int i =1; i<21;i++){
//            loop2:
//            for(int j=1; j<21; j++){
//                if(i % j == 0){
//                    count ++;
//                    if(count>=5){
//                        System.out.println(i);
//                        break loop1; //15번
//                    }
//                   // break loop1; //3번
//                }
//            }
//        }
//        강사님이 한 거
        int ans=0;
        l1:
        for(int i=1; i<21;i++){
            int count = 0;
            for(int j=1; j<=i; j++)
            {
                if(i % j==0){
                    count ++;
                }
                if(count == 5){
                    ans = i;
                    break l1;
                }
            }
//            if(count>=5){
//                ans = i;
//                break;
//            }
        }
        System.out.println(ans);
    }
}
