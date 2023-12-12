import java.util.*;

public class A0practice {
    public static void main(String[] args) {
    //좋아하는 운동종목& 사람숫자(map) basket ball 5/ base ball 3/ soccer 2/ tennis 4
        List<String> List_Arr = new ArrayList<>(Arrays.asList("basketball","basketball","basketball","basketball","basketball",
                "baseball","baseball","baseball", "soccer","soccer","tennis","tennis","tennis","tennis"));
        System.out.println(List_Arr);
        Map<String, Integer> mymap = new HashMap<>();

        for(int i =0; i<List_Arr.size(); i++){
            String a = List_Arr.get(i);
            if(mymap.containsKey(a)){
                    mymap.put(a,mymap.get(a)+1);
            }else {
                    mymap.put(a,1);
            }
        }
        System.out.println(mymap);
    }
}
