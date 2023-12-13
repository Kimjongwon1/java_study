import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        list의 선언방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList = new ArrayList<>();
//        가장흔한방식
//        왼쪽에 인터페이스 오른쪽 구현체
//        List<String> myList = new ArrayList<>();
//
////        초기값 생성방법 1.myList에 add
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);
////        초기값 생성방법2. 한꺼번에 add
////        List<String> myList2 = new ArrayList<>(Arrays.asList("java","python","C++"));
//        String[] myArr = {"java","python","C++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr));
//        System.out.println(myList2);
////        배열이 int인 경우 ->문제발생(형변환이슈)
//        int[] myInt = {1,2,3};
//        List<Integer> myIntList = new ArrayList<>();
//        for(int a : myInt){
//            myIntList.add(a);
//        }
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
////        add(int inddex, int element) 중간삽입은 기본적으로 성능저하
//        myList.add(1,15);
//        System.out.println(myList);

//        List<Integer> myList2 = new ArrayList<>();
//        myList.add(30);
//        myList.add(40);
//        myList.add(50);
////        addAll(collection객체) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
////      get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
////        for문 이용 전체출력
////        size() : 리스트의 개수 반환
////        for(int i = 0; myList.size();i++)
//        for(int a : myList){
//            System.out.println(a);
//        }
////      remove : 요소삭제
////      value삭제, index를 통한 삭제, 삭제한 결과를 boolean으로 리턴가능
//         myList.remove(0);
//         myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//  get(int index) : 특정 위치의 요소를 반환
////        System.out.println(myList.get(0)); // 10
////
//////        size() : 리스트의 개수 반환
////        for(int i=0; i<myList.size(); i++) {
////            System.out.println(myList.get(i));
////        }
////
//////        remove() : 요소 삭제
//////        index삭제
////        myList.remove(0);
////        System.out.println(myList); // 15, 20, 30, 40, 50
//////        값 삭제 : Integer.valueOf 사용
////        myList.remove(Integer.valueOf(15));
////        System.out.println(myList); // 20, 30, 40, 50
////
//////        set(int index, E element) : index 자리에 값 변경
////        myList.set(myList.size()-1, 100);
////        System.out.println(myList); // 20, 30, 40, 100
////
//////        contains(E element) : 특정값이 있는지 없는지 boolean return
////        System.out.println(myList.contains(100)); // true
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        indexOf : 몇번째 index에 위치한 지 return; 같은숫자가 있으면 첫번째 index값 리턴, 해당요소를 포함하지않으면 -1을 반환
//        System.out.println(myList.indexOf(20));
////        clear() : 전체삭제
////        isempty : 값이 있는지 없는지
//
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(myList.isEmpty());

//        리스트 출력
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{1,2,3});
//        myList.add(new int[2]);
//        myList.add(new int[3]);
//        myList.get(1)[0] = 10;
//        myList.get(1)[1] = 20;
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
//        List<List<Integer>> myList = new ArrayList<>();
////        myList.add(new ArrayList<>(Arrays.asList(1,2,3)));
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        for(int i=0; i<myList.size();i++){
//            myList.get(i).add(10);
//        }
//        System.out.println(myList);

//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[]{1,2,3});
//        myList.add(new ArrayList<>(Arrays.asList(1,2,3));
//        myList.add(new int[3]);
////        위 list에 값, 1,2,3 10,20,30 ,100,200,300
//        int n = 1;
//        for(int i = 0; i<myList.size();i++){
//            for(int j=0; j<myList.get(i).length;j++){
//                myList.get(i)[j] = (j+1)*n;
//            }
//            n *=10;
//        }
//        for(int[] arr : myList) {
//            for(int num : arr) {
//                System.out.print(num + " ");
//            }
//            System.out.println();}

//        for (int i = 0; i < myList.size(); i++) {
//            int[] arr = myList.get(i);
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println(); // 다음 행으로 넘어가기 위해 개행
//        }

//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
////        리스트 정렬1 : Collection.sort
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
////        리스트 정렬2 : 객체.sort(); //자바9부터
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

//        1.String 배열 -> list로 변환
//        String[] arr = {"java","Spring","django"};
////        1-1 Arrays.aslist
//        List<String> stList = new ArrayList<>(Arrays.asList(arr));
////        1-2 for문담기
//        List<String> arr2 = new ArrayList<>();
//        for(String a : arr){
//            arr2.add(a);
//        }
//        System.out.println(arr2);
//
////        1-3 StreamApi
//        List<String> arr3 = Arrays.stream(arr).collect(Collectors.toList());
//        System.out.println(arr3);
//        
////        int배열 -> list
////        1-1 Arrays.asList사용불가 객체 타입필요
////        1-2 for문 사용가능
////        1-3 streamAPI 사용가능
//        int[] intarr = {10,20,30,40};
//        List<Integer> intList = Arrays.stream(intarr).boxed().collect(Collectors.toList());
        
//        String list를 String 배열로 변환
//        3-1 for문으로 할당
//        List<String> stList = new ArrayList<>(Arrays.asList("java","Spring","django"));
//        String[] arr = new String[stList.size()];
//        for (int i = 0; i < stList.size(); i++) {
//            arr[i] = stList.get(i);
//        }
//        3-2 stream api :참고만
//        String[] starr2 = stList.stream().toArray(a->new String[a]);

//        4.int 리스트를 int 배열로변환
//        1)for문으로
//        2)streamapi로

//        두 개 뽑아서 더하기 :리스트
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                int sum = numbers[i] + numbers[j];
//                if (!list.contains(sum)) {
//                    list.add(sum);
//                }
//            }
//        }
//        list.sort(Comparator.naturalOrder());
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//
//        return result;
//    }

//        n의 배수 고르기 프로그래머스 (개열받음 다시 ㄱㄱ)
//        int n = 3;
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer> myList = new ArrayList<>();
//        for(int a : numlist){
//            if(a%n==0){
//                myList.add(a);
//            }
//        }
//        System.out.println(myList);
//        int[] answer = new int[myList.size()];
//        for(int i=0; i<answer.length;i++){
//            answer[i]=myList.get(i);
//        }

    }
}
