package C16EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("pear");

//        enhanced for문 : 원본 변경 안됨, remove 불가
        for(String Lis2t : myList){
            System.out.println(Lis2t);
//            remove 메소드 없음
        }
//        Iterator : 참조하고 있는 원본데이터 삭제 가능 -> remove
        Iterator<String> ddf = myList.iterator();
        while (ddf.hasNext()){
            if(ddf.next().equals("banana")){
                ddf.remove();
            }
        }
        System.out.println(myList);
//            System.out.println(ddf.next());
//        }


    }
}
