package C11Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

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
//        int[] arr = {5,1,2,7,3,1,2};
//        int[] new_arr = Arrays.stream(arr) //arr을 대상으로 Stream 객체 생성하는방법
//                        .boxed() //Integer로 형변환 한 스트림객체 생성
//                        .sorted(Comparator.reverseOrder()) //내림차순 정렬
//                        .mapToInt(a->a) //Integer -> int로 변환
//                        .toArray(); //배열로 변환


//        선택정렬
//        int[] arr = {30, 22, 20, 25, 12};
//       for(int i =0; i<arr.length-1;i++){
//           for(int j=i+1; j<arr.length; j++){
//               if(arr[i]>arr[j]){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//               }
//               if(arr[i]<arr[j]){
//                   int temp = arr[i];
//                   arr[i] = arr[j];
//                   arr[j] = temp;
//               }
//               내림차순
//           }
//       }
//        System.out.println(Arrays.toString(arr));

//        숫자조합의 합: 각기 다른 숫자의 배열이 잇을때 만들어 질 수 있는 2개의 조합의 합을 출력
//        int[] arr = {10,20,30,40,50,60};
//        int count = 0;
//        for(int i =0; i<arr.length-1;i++){
//           for(int j=i+1; j<arr.length; j++){
////                 int temp = arr[i];
////                 arr[i] = arr[j];
////                 arr[j] = temp;
////                 count++;
//               System.out.println(arr[i] + "+" + arr[j] + "=" +(arr[i]+arr[j]));
//           }
//       }

//        System.out.println(count);
//        중복제거하기
//        int[] temp = {10,10,40,5,7};
//        Arrays.sort(temp);
//////        배열복사
//        int[] new_temp = new int[temp.length];
////        System.out.println(Arrays.toString(new_temp));
////        Arrays.sort(); 정렬

//        System.out.println(Arrays.toString(temp));
//
//        int[] temp = {10,10,40,5,7};
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index = 0;
//        for(int i = 0; i<temp.length;i++){
//            if(i==temp.length-1){
//                new_temp[index] = temp[i];
//                index++;
//                break;
//            }
//            if(temp[i] != temp[i+1]){
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(new_temp));
//        System.out.println(index);
//        for(int i = 0; i<temp.length-1;i++){
//            if(temp[i] != temp[i+1]){
//                new_temp[i] = temp[i+1];
//            }
//        }
//        System.out.println(Arrays.toString(new_temp));

//        int[] temp = {10, 10, 40, 5, 7};
//        Arrays.sort(temp);
//        System.out.println("Sorted Array: " + Arrays.toString(temp));
//
//        int newSize = 1;
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[i] != temp[i - 1]) {
//                newSize++;
//            }
//        }
//
//        int[] new_temp = new int[newSize];
//        new_temp[0] = temp[0];
//        int idx = 1;
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[i] != temp[i - 1]) {
//                new_temp[idx] = temp[i];
//                idx++;
//            }
//        }
//
//        new_temp = Arrays.copyOfRange(new_temp, 0, newSize);
//        System.out.println("Array with unique elements: " + Arrays.toString(new_temp));
//
//        int[] numberas = {2,1,3,4,1};
//        int[] numbers_com = new int[numberas.length*numberas.length];
//        int count = 0;
//        for(int i =0; i<numberas.length-1; i++){
//            for (int j = i+1; j<numberas.length; j++){
//                numbers_com[count] = numberas[i]+ numberas[j];
//                count++;
//            }
//        }
//        int[] temp = Arrays.copyOfRange(numbers_com,0,count);
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index=0;
//        for(int i=0; i<temp.length-1;i++){
//            if(temp[i] != temp[i+1]){
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        new_temp[index++] =temp[temp.length-1];
//        int[] answer = Arrays.copyOfRange(new_temp,0,index);
//        System.out.println(Arrays.toString(answer));

//        두 개 뽑아서 더하기(다시뽑기)
//        내가쓴거
//        import java.util.*;
//        class Solution {
//            public int[] solution(int[] numbers) {
//                int[] answer = {};
//                Arrays.sort(numbers);
//                int[] result =new int[numbers.length*numbers.length];
//                int index = 0;
//                for(int i=0; i<numbers.length-1;i++){
//                    for(int j=i+1;i>j;j++){
//                        result[i] = numbers[i]+numbers[j];
//                    }
//                }
//            }if(result[i] != result[i+1]){
//                answer[index] = result[i+1];
//                index++;
//
//
//                return answer = Arrays.copyOfRange(result, 0, index);
//            }
//        }
        
//        버블정렬  
//        1)i는 전체 반복횟수를 결정, 2)j는 전체반복중 각 수의 index를 의미 3)j는 i가 증가할수록 마지막자리가 i만큼 줄어듬
//        오름차순/내림차순(내가한거)
//       int[] arr = {7,10,5,1,2};
//                 for(int i =0; i<arr.length;i++){
//                     for(int j=0;j<arr.length;j++){
//                               if(arr[i]<arr[j]){
//                                   int temp = arr[i];
//                                   arr[i] = arr[j];
//                                   arr[j] = temp;
//                               }
//                     }
//                 }
//        System.out.println(Arrays.toString(arr));


//        int[] arr = {7,10,5,1,2};
//        for(int i =0; i<arr.length;i++){
//        boolean isChanged = false;
//            for(int j=0;j<arr.length-1;j++){
//                if(arr[j+1]<arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//        isChanged =true;
//                }
////                               if(arr[i]<arr[j]){
////                                   int temp = arr[i];
////                                   arr[i] = arr[j];
////                                   arr[j] = temp;
////                               }
//        if(isChanged =false){
//            break;
//        }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int a = 8;
//        int ans = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==a){
//                ans = i;
//                break;
//            }
//        }
//        System.out.println(ans);

//        이진검색(Binary Search)
//        사전에 오름/내림차순 정렬이 되어있어야만 가능
//        int[] arr = {1,2,3,4,5,6,7,8,9,8,8,8,8,8,8,8,8,8,8,10,11};
//        int ans = Arrays.binarySearch(arr,8);
//        System.out.println(ans);
        
//        stream Api를 이용한 검색
//        int index = IntStream.range(0, arr.length)
//                .filter(i -> arr[i] == 8)
//                .findFirst()
//                .orElse(-1);
//        System.out.println(index);
//        배열간 비교 : equals, 순서까지 동일해야 true
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {20,30,10};
//        int[] arr3 = {10,20,30};
//        System.out.println(Arrays.equals(arr1,arr2));

//        배열복사 : copyOf(대상배열,endindex),copyOFRange(배열, start, end);
//        int[] arr = {10,20,30,40,50};
//        int[] new1 = Arrays.copyOf(arr,4);
//        int[] new2 = Arrays.copyOfRange(arr, 2,4);
//        System.out.println(Arrays.toString(new1));
//        System.out.println(Arrays.toString(new2));

//        2차원배열
        int[][] arr = new int[2][3]; //선언 후
        //1,2,3,4,5,6
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
//        2차원 가변배열 선언 및 할당
        int[][] arr_2 = new int[3][];
        arr_2[0] =new int[1];
        arr_2[1] =new int[2];
        arr_2[2] =new int[3];
//        arr_2[0][0] = 10;
//        arr_2[1][0] = 11;
//        arr_2[2][0] = 12;
//        System.out.println(Arrays.deepToString(arr_2));
//        가변배열 리터럴 방식
        int[][] arr_3 = {{10},{10,20},{10,20,30}};
//        System.out.println(Arrays.deepToString(arr_3));
        int[][] arr2  = new int[2][];//선언 후 //가변배열
        int[][] arr3  = {{1,2,3},{1,2,3}}; //리터럴
        int[][] arr4  =  {{1,2,3},{1,2,3},{10,20,30,40}}; //리터럴
        
//        실습 1~12까지의 숫자값 각 배열에 할당
//        int[][] test = new int[3][4];
//        int count =1;
//        for(int i=0;i<test.length;i++){
//            for (int j=0; j<test[i].length; j++){
//                test[i][j] = count ++;
//            }
//        }
//        System.out.println(Arrays.deepToString(test));

//        가변배열만들기 : 전체사이즈5 각배열마다 1,2,3,4,5로 커지도록 각 사이즈별로 1은 10이 모두 들어가고 2는 20이 들어가도록
        int[][] test2 = new int[5][];
        int count=0;
        for(int i =0; i< test2.length; i++){
            test2[i] = new int[i + 1];
            for(int j=0; j<test2[i].length;j++){
                test2[i][j] = 10*(i+1);
            }
            count++;
        }
        System.out.println(Arrays.deepToString(test2));
        System.out.println(count);


    }
}
