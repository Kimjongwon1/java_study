import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
        //  표현식 1 리터럴
        int[] intArr = {1,2,3,4};
        //  표현식 2
//        int[] intArr2 = new int[4];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;

//        표현식3
//        int[] intArr3 = new int[]{1,2,3,4};
//        표현식4 <- 안됨
//        int[]  inArr4 = new int[];

//        String배열 초기값은 null이어서 nullpointexcep이 뜸 다채워야함
//        String[] arr_st = new String[5];
//        for(int i=0; i<arr_st.length;i++){
//            if(arr_st[i].isEmpty()){
//                System.out.println("비어있다");
//            }
//        }
//
//        int[] arr_int = new int[5];
//        for(int i=0; i<arr_int.length;i++){
//            arr_int[i] += 10;
//        }

//        숫자가 85,65,90인 int 배열 선언 ->총합, 평균 for문 이용(배열선언하는거잘보기)
//        int[] intArr4 = {85,65,90};
//        int sum = 0;
//        int avg = 0;
//        for(int i = 0; i<intArr4.length; i++){
//          sum +=intArr4[i];
//         }
//         avg=(sum/intArr4.length);
//
//        System.out.println(sum);
//        System.out.println(avg);

//        최대값,최고값(개념다시보기)
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0];
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++){
//               if(max <arr[i]){
//                    max = arr[i];
//                }
//                if(min > arr[i]){
//                    min = arr[i];
//                }
//        }
//        배열순서바꾸기(length 잘보기 Arrays.toString 기억)
//        int[] arr = {10,20};
//        int a = arr[0];
//        arr[0] = arr[1];
//        arr[1] = a;
//        System.out.println(Arrays.toString(arr));

//        int[] arr2 = {10,20,30,40,50,60,70};
//        for(int i=0; i<arr2.length-1; i++){
//            int b = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = b;
//        }
//        System.out.println(Arrays.toString(arr2));
//      배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        배열 하나를 신규 배열 선언 (arr.length 다시보기)
//        int[] arr1 = new int[5];
//        for(int i=0;arr.length>i;i++){
//            //arr1[i] = arr[(arr.length-1-i)];
//            arr1[(arr1.length-1-i)] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr1));

//        배열뒤집기2 :arr 그 자체를 뒤집기
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));

//      정렬 : sort()함수사용
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        내림차순
//        방법.1 Comparator 객체 사용 *객체타입인 경우에만
//        String[] st_arr = {"Hello","HI","Bye","GoodMorning"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_INTEGER = {5,1,2,7,3,1,2};
//        Arrays.sort(arr_INTEGER, Comparator.reverseOrder());
//        Comparator클래스는 기본형 타입은 처리불가

//        방법2. 배열뒤집기
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        StreamApi, lamda를 활용한 내림차순 정렬
        int[] arr = {5,1,2,7,3,1,2};
        int[] new_arr = Arrays.stream(arr) //arr을 대상으로 Stream 객체 생성하는방법
                        .boxed() //Integer로 형변환 한 스트림객체 생성
                        .sorted(Comparator.reverseOrder()) //내림차순 정렬
                        .mapToInt(a->a) //Integer -> int로 변환
                        .toArray(); //배열로 변환

    }
}
