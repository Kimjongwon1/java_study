package C15AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
//        전통적인 출력 방식/ 데이터접근 방식
        int[] arr ={20,10,4,12};
        for(int i : arr){
            System.out.println(i);
        }
//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그램이 방식
//        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
//      foreach는 stream의 각 요소를 소모하면서 동작을 수행한다.

        Arrays.stream(arr).forEach(a -> System.out.println(a));
//        스트림의 소모
        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
        List<String> mylist= new ArrayList<>(Arrays.asList("hleoo","hi","siu"));

    }
}
