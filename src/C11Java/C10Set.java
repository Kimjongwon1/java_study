package C11Java;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        set 은 중복이랑 순서가 없다.
//        Set<String> myset = new HashSet<>();
//        myset.add("hi");
//        myset.add("h");
//        myset.add("e");
//        myset.add("l");
//        myset.add("l");
//        myset.add("o");
//        System.out.println(myset);

//        반학생들 좋아하는 종목, list로 만들고, 좋아하는 종목명의 개수를 set

//        List<String> myList = new ArrayList<>();
//        int count=0;
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("soccer");
//        list를 인자값으로 받아 초기값 세팅가능
//        Set<String> mySet = new HashSet<>(myList);
//        for(int i =0;i<mySet.size();i++){
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(mySet.size());
//        배열을 인자값으로 받아 초기값 세팅
//        String[] Str_arr = new String[]{"가나","다라","마바","사아","가나","다라"};
////        System.out.println(Arrays.toString(Str_arr));
//        Set<String> myset = new HashSet<>(List.of(Str_arr));
//        Set<String> myset1 = new HashSet<>(Arrays.asList(Str_arr));
////        System.out.println(myset);
//        myset.remove("가나");
//        System.out.println(myset);
//        System.out.println(myset1);

        Set<String> myset = new HashSet<>(Arrays.asList("java","python","javascript"));
        Set<String> myset1 = new HashSet<>(Arrays.asList("java","html","Css"));

//        교집합 retainAll
//        Set<String> temp1 = new HashSet<>(myset);
//        temp1.retainAll(myset1);
//        System.out.println(temp1);
//        합집합:AddAll
        Set<String> temp1 = new HashSet<>(myset);
            temp1.addAll(myset1);
        System.out.println(temp1);
//        차집합:removeAll
        Set<String> temp2 = new HashSet<>(myset);
        temp1.removeAll(myset1);
        System.out.println(temp2);
//        프로그래머스 전화번호 목록
        
//        순서가 없으니 향상된for문/iterater 사용

//        LinkedHashSet, TreeSet
        Set<String> temp3 = new TreeSet<>();
        temp3.add("hell05");
        temp3.add("hell04");
        temp3.add("hell03");
        temp3.add("hell02");
        temp3.add("hell01");
        System.out.println(temp3);
//      두개 뽑아서 더하기

//      Set<>에 처음부터 담아서 쓰기        
        
//        Stack //LIFO 후입선출 나중에 저장된 데이터가 먼저 인출

    }
}
