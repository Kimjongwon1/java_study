package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
//              안쓴예제
//        String[] stArr = {"java","string","kotlin"};
////        0번째와 1번째
//        String[] temp = new String[stArr.length];
//        temp[0]=stArr[1];
//        stArr[1]=stArr[0];
//        stArr[0]=temp[0];
//        System.out.println(Arrays.toString(stArr));
//        Integer[] inArr = {1,2,3,4,5};
////        1번째와 2번쨰 자리 체인지
//        Integer[] temp1 = new Integer[inArr.length];
//        temp1[0]=inArr[1];
//        inArr[1]=inArr[0];
//        inArr[0]=temp1[0];
//        System.out.println(Arrays.toString(inArr));

        GenericStudent<String> age = new GenericStudent<>();
        age.setAge("Hey");
        System.out.println(age.getAge());
        System.out.println(age.getAge().getClass());
        GenericStudent<Integer> age2 = new GenericStudent<>();
        age2.setAge(134);
        System.out.println(age2.getAge());


//        String[] 배열 change메소드 생성
//       int a = 1;
//       int b = 2;
////        change_str(stArr,temp,a,b);
//////        Integer[] 배열 change메소드 생성
////
////        change_int(inArr,temp1,a,b);
//        change_general(stArr,temp,a,b);
//        change_general(inArr,temp1,a,b);
    }
//    static void change_str(String[] stArr,String[] temp, int a, int b){
//        temp[0] =stArr[a];
//        stArr[a]=stArr[b];
//        stArr[b]=temp[0];
//        System.out.println(Arrays.toString(stArr));

//    }
//    static void change_int(Integer[] inArr,Integer[] temp1,int a, int b){
//        temp1[0] =inArr[a];
//        inArr[a]=inArr[b];
//        inArr[b]=temp1[0];
//        System.out.println(Arrays.toString(inArr));
//    }

    //            제네릭 메소드  : 반환 타입 왼쪽에 <T>
//                제네릭은 객체 타입이 들어와야함에 유의
    
    static <T> void change_general(T[] arr,T[] temp1,int a, int b){
       // T temp = arr[a];  //이렇게 써도 됨
        temp1[0] =arr[a];
        arr[a]=arr[b];
        arr[b]=temp1[0];
        System.out.println(Arrays.toString(arr));
    }
    
}
class GenericClass<T>{
    T value;
    void setValue(T value){this.value = value;}
    T getValue(){return value;}
}
class GenericStudent<T>{
    private String name;

    private T age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age =age;
    }



}
