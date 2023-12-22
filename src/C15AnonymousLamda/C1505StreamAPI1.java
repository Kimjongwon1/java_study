package C15AnonymousLamda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
//        전통적인 출력 방식/ 데이터접근 방식
////        int[] arr ={20,10,4,12};
////        for(int i : arr){
////            System.out.println(i);
////        }
//////        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그램이 방식
//////        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
//////      foreach는 stream의 각 요소를 소모하면서 동작을 수행한다.
////
////        Arrays.stream(arr).forEach(a -> System.out.println(a));
//////        스트림의 소모
////        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
////        List<String> mylist= new ArrayList<>(Arrays.asList("hleoo","hi","siu"));
////        int n=9;
////        int answer = 0;
////
//////         스트림의 생성
////        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//////        stream<객체>:제네릭 타입으로 stream객체 생성
////        Stream<String> stStream = Arrays.stream(stArr);
////
////        int[] intArr = {10,20,30,40,50};
////        IntStream intStream = Arrays.stream(intArr);
////        int[] intArr2 = intStream.filter(a->a>20).toArray();
////        System.out.println(Arrays.toString(intArr2));
////
//////        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생, 제네릭의 타입소거란?  자바버전의 호환성을 위해 제네릭타입을 런타임 시점에 제거하는것
////        String[] starr2 = stStream.filter(a->a.length()<=4).toArray(String[]::new);
//////        메소드 참조 방식으로 표현하는것이 더 일반적
//////        메소드 참조방식 : 클래스 :: 메소드
////        System.out.println(Arrays.toString(starr2));
////      stream의 중개연산 : filter , map, sorted, distinct
////        distince : 중복제거 후 반환
//        int[] intArr = {10,10,30,50,50};
////        중복 제거 후 총합
//        int answer = Arrays.stream(intArr).distinct().sum();
////
////        String[] strArr = {"java","java","python","C--"};
//////        중복 제거 후 새 배열
////        String[] stArr2 = Arrays.stream(strArr).distinct().toArray(String[]::new);
////        System.out.println(Arrays.toString(stArr2));
//////        중복 제거하고 길이가 3개 이하인것으로 제한, 남은배열의 길이총합
//////        mapToInt를 통해 Intstream으로 변환
//////       int mystrema = Arrays.stream(stArr2).distinct().filter(a->a.length()<=3).mapToInt(String::length).sum();
////       IntStream mystrema2 = Arrays.stream(stArr2).distinct().filter(a->a.length()<=3).mapToInt(a->a.length());
////        System.out.println(mystrema2);
//
////        sorted
//        int[] arr = {5,2,1,3,6,7,4};
////       int[] new_a = Arrays.stream(arr).sorted().toArray();
////        System.out.println(Arrays.toString(new_a));
////
////        List<Integer> myList= new ArrayList<>(Arrays.asList(6,2,4,3,5,1));
//////        collect(변환할 컬렉션 객체 명시);
////        List<Integer> new_b = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
////        System.out.println(new_b);
//
////        List<String> stList= new ArrayList<>(Arrays.asList("java","pythoend","sorted","C++","javascript"));
//////        StreamApi 사용, 문자열의 길이를 기준으로 정렬(내림) 후 신규List생성 , 문자열의 길이가 4개이상
////        List<String> new_st = stList.stream().filter(a->a.length()>=4).sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
//////        System.out.println(new_st);
////
//////        int[] arr_new = Arrays.stream(arr).map(a-> a+10).toArray();
//////        System.out.println(Arrays.toString(arr_new));
////
//////        arr에서 짝수만 골라서 해당 수의 제곱에 총합을 구하라.
////        int arr_new2 = Arrays.stream(arr).filter(a -> (a % 2 == 0)).map(a->a*a).sum();
////        System.out.println(arr_new2);
//
////        소모 foreach, reduce
//        int[] arr = {10,20,30,40};
////        Arrays.stream(arr).forEach(System.out::println);
//
////        reduce는 누적연산,  초기값을 지정하지않으면 optional객체 리턴
////        optional 객체는 값이 있을수도 없을수도 있다는 뜻
//
////        int result = Arrays.stream(arr).reduce((a,b)-> a*b).getAsInt();
//        int result = Arrays.stream(arr).reduce(1,(a,b)->a*b);
//        int result2 = Arrays.stream(arr).reduce(0,(a,b)-> a+b);
////        System.out.println(result);
//        System.out.println(result2);
////        Optional<String> myopt = Optional.ofNullable("hi");
////        if(myopt.isPresent()){System.out.println(myopt.get().length());}
//
////
//        String[] stArr = {"Hello","java","World"};
//         Optional<String>  answer = Arrays.stream(stArr).reduce((a,b)->a+","+b);
//        String answer2 = Arrays.stream(stArr).reduce((a,b)->a+","+b).get();
//        System.out.println(answer2);
//        if(answer.isPresent()){
//            System.out.println(answer.get());
//        }
//
////        min, max, sum, average,count
//        List<Integer> mylist  = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int min = mylist.stream().mapToInt(a->a).min().getAsInt();
//        System.out.println(min);
//        int max = mylist.stream().max((a,b)-> a-b).orElse(Integer.MIN_VALUE);
//        System.out.println(max);
//        int sum = mylist.stream().mapToInt(a->a).sum();
//        System.out.println(sum);
//        double avg = mylist.stream().mapToDouble(a->a).average().getAsDouble();
//        System.out.println(avg);
//        int count = (int) mylist.stream().count();
//        System.out.println(count);
//        findFirst, findAny
        List<Student> myStu = new ArrayList<>();
        myStu.add(new Student("kim",20));
        myStu.add(new Student("Lee",30));
        myStu.add(new Student("Park",33));
        myStu.add(new Student("Heo",25));
        myStu.add(new Student("Seo",40));
        Optional min_stu = myStu.stream().filter(a->a.getAge()>=30).findFirst();
        Student min_stu1 = myStu.stream().filter(a->a.getAge()>=30).findFirst().get();
//        System.out.println(min_stu1);
//        Student any_stu = myStu.stream().findAny().get();
//        System.out.println(any_stu);

//        Student 객체로 실습 1)가장 나이 어린사람 2)30대가 몇명인지 3)평균나이 4)30세이하 선착순 객체 출력
//        Student first = myStu.stream().findFirst().get();
//        System.out.println(first);
//        long Second = myStu.stream().filter(a->a.getAge()>=30).count();
//        System.out.println(Second);
//        OptionalDouble Third = OptionalDouble.of(myStu.stream().mapToInt(a->a.getAge()).average().getAsDouble());
//        System.out.println(Third);
//        Student fourth = myStu.stream().filter(a->a.getAge()<=30).findAny().get();
//        System.out.println(fourth);

//        기존 java null처리
//        String str =null;
//        if( str != null){
//            System.out.println(str.compareTo("abc"));
//        }
//
////        Optional객체를 통해 특정객체에 값이 없을지도 모른다는것을 명시
        Optional<String> opt = Optional.empty(); //        빈값을 명시적으로 넣는방법(근데 그냥 "" 이랑 다름)
//        opt.isPresent();            //   빈값인지 아닌지 체크하는 메소드
//        if(opt.isPresent()){
//            System.out.println(opt.get().compareTo("abc"));
//        }
//          Optional 객체
        Optional<String> opt2  = Optional.ofNullable("hello");//null이 있을수도 있음을 의미
//      OrElse 관련 메소드 사용하여 null값 처리
//      OrElse(), OrElseGet(), OrElseThrow()
//        OrElse()는 값이 있으면 없으면 디폴트값 리턴
//        System.out.println(opt2.orElse("").compareTo("abc"));
//        opt.orElseGet(()->new String()); //값이 있으면 매개변수로 람다함수 또는 메소드 참조
//        opt.orElseThrow();//값이 있으면 return 없으면 지정된 예외 강제 발생
        opt.get();
        int result = opt2.orElseThrow(()->new NoSuchElementException("객값없")).compareTo("abc");
        System.out.println(result);

//        OptionalInt, OptiionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
//        isPresent로 check
        if(oi.isPresent()){

        }else {

        }
//        orelse 등의 방법활용
        System.out.println(oi.orElseThrow(()->new NoSuchElementException("no vaule")));

//        peek() 별도로 알고싶으면?
    }
}
