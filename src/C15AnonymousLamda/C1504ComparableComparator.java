package C15AnonymousLamda;

import java.util.*;
import java.util.stream.Collectors;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 대표적인 인터페이스 2개가 있는데 하나가 comparable, 다른 하나는 Comparator라고 한다.
//        comparable 인터페이스에는 comparedTo메소드가 있고, 그리고 java의 많은 클래스에서 구현됨
//        Comparator 인터페이스에는 compare메소드가 선언
//        일반적으로 클래스내에 직접 구현 사용, Compare메소드가 선언 => 일반적으로 익명객체 만들어서 활용
//        Comparable;
//        Comparator;
        
//        두 문자열에 각 문자를 앞에서부터 순차적 비교
//        문자열의 자릿수의 차이를 발견 할 때, 그 문자의 유니코드값의 차이 반환
        
//        String a = "Heeeeeeee";
//        String b = "llllllooo0";
//
//        System.out.println(a.compareTo(b));
//        Integer intA = 1;
//        Integer intB = 1;
//        System.out.println(intA.compareTo(intB));
//
//        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//        Collections.sort(myList);//Comparable의 compareTo메소드 활용
//        Collections.sort(myList,Comparator.reverseOrder());//Comparable의 compareTo메소드 활용
//      Student객체 정렬
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(0,new Student("kim",20));
//        studentList.add(1,new Student("park",22));
//        studentList.add(2,new Student("choi",34));
//        System.out.println(studentList);
//        for (Student i : studentList){
//            System.out.println("이름은 : " + i.getName()+" 나이는 : " + i.getAge());
//           // System.out.println(i);
//        }
//        for(int i =0; i<studentList.size()-1;i++){
//            System.out.println(studentList.get(i).getName().compareTo(studentList.get(i+1).getName()));
//        }
////        방법 1:  Comparable 인터페이스 implements 후 compareTo메소드 구현 , 매개변수 1개
////        나이로 정렬
//       studentList.sort(new Comparator<Student>() {
//           @Override
//           public int compare(Student o1, Student o2) {
////               기본으로 오름차순 정렬
////               o1.getAge()가 더 작은 숫자라는 가정
//               return  o1.getAge()- o2.getAge();
////               o2 - o1 이면 양수인데 그럼 내림차순이 됨
//           }
//       });
//        studentList.sort(((o1, o2) -> o1.getAge()- o2.getAge()));
//        System.out.println(studentList);
////        이름으로 정렬
//        studentList.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
//        System.out.println(studentList);
//
//        String[] strArr = {"hello","java","C++","world22"};
//        Arrays.sort(strArr,((o1, o2) -> o1.length()-o2.length()));
//        System.out.println(Arrays.toString(strArr));
////        Arrays.sort(strArr,Comparator.reverseOrder());
////      Priority Queue 내림차순
////        Queue<String> myQue = new PriorityQueue<>(Comparator.reverseOrder());  // 내림차순
//        Queue<String> myQue = new PriorityQueue<>((o1, o2) -> 0);  //기본은 오름차순
//
//
////        방법 2: Comparator를 익명객체 방식으로 활용하여 정렬, 매개변수 2개
////        String answer = String.join("",strArr); //문자열 더하기
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        쓰레드 구현방식: 쓰레드 상속, Runnalbe방식
        System.out.println("main 의 쓰레드 입니다");
        Thread t1 = new Thread(() -> System.out.println("새로만든 스레드"));
        t1.start();
//        System.out.println(t1);
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//    조상클래스인 Object클래스의 toString을 overriding 하여 객체호출시 자동으로 toString 메소드 호출
    @Override
    public String toString(){
        return "나이는 " + this.name + " 이름은 " + this.age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
