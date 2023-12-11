import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08Class {
    public static void main(String[] args) {
//        list의 선언방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList = new ArrayList<>();
//        가장흔한방식
//        왼쪽에 인터페이스 오른쪽 구현체
        List<String> myList = new ArrayList<>();

//        초기값 생성방법 1.myList에 add
        myList.add("java");
        myList.add("python");
        myList.add("c++");
        System.out.println(myList);
//        초기값 생성방법2. 한꺼번에 add
//        List<String> myList2 = new ArrayList<>(Arrays.asList("java","python","C++"));
        String[] myArr = {"java","python","C++"};
        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr));
        System.out.println(myList2);
//        배열이 int인 경우 ->문제발생(형변환이슈)
        int[] myInt = {1,2,3};
        List<Integer> myIntList = new ArrayList<>();
        for(int a : myInt){
            myIntList.add(a);
        }



    }
}
