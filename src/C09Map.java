import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        String, String -> map 데이터 insert와 순서가 상관없다.
//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
////        System.out.println(myMap);
////        System.out.println(myMap.get("basketball"));
//////        전체개수 : size(); , isEmpty();
////        myMap.put("basketball", "탁구");  //이미 키가 있으면 덮어쓰기
////        myMap.putIfAbsent("baseball","배구"); //없으면 put
////        System.out.println(myMap);
//////        myMap.getOrDefault(); 없으면 디폴트값을 리턴
////        System.out.println(myMap.getOrDefault("tennis","sports"));
////        System.out.println(myMap.containsKey("tennis"));
////        myMap.remove("baseball");
////
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
////        enhanced for : key값 하나씩 출력.
//        for(String i : myMap.keySet()){
//            System.out.println(i);
//        }

//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        iterator를 통해 key값 하나씩 출력.
//        Iterator <String> myiter = myMap.keySet().iterator();
//        next()메서드는 데이터를 소모시키면서 return
//        System.out.println(myiter.next());
//        System.out.println(myiter);
//        hasnext(); 값이 있는지 없는지

//        while (myiter.hasNext()){
//            System.out.println(myiter.next());
//            if(myiter.hasNext()==false){
//                break;
//            }
//        }

//        아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오
//        List<String> myList = new ArrayList<>();
//        Map<String,Integer> myMap = new HashMap<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        for(String a : myList){
//            if(myMap.containsKey(a)){
//                myMap.put(a,myMap.get(a)+1);
//            }else{
//                myMap.put(a,1);
//            }
////            myMap.put(a, myMap.getOrDefault(a, 0)+1);
//        }
//        System.out.println(myMap);

//        String answer = "";
//        List<String> myList = new ArrayList<>();
//        Map<String,Integer> myMap = new HashMap<>();
//        for(int i = 0 ; i<participant.length;i++){
//            for(int j=0; j<completion.length;j++){
//                if(participant[i] != completion[j]){
//                    myList.add("participant[i]"");
//                }
//            }
//        }
//        for(String a : myList){
//            myMap.put(a, myMap.getOrDefault(a, 0)+1);
//        }
//        return answer;
//    }
//       LinkedHashmap: 데이터 삽입순서유지
//        Map<String, Integer> myMap1 = new LinkedHashMap<>();
//        myMap1.put("hell05",1);
//        myMap1.put("hell04",1);
//        myMap1.put("hell03",1);
//        myMap1.put("hell02",1);
//        myMap1.put("hell01",1);
//        myMap1.put("hell00",1);
//        System.out.println(myMap1);
////        TreeMap Key를 통해 데이터 정렬
//        Map<String, Integer> myMap2 = new TreeMap<>();
//        myMap2.put("hell05",1);
//        myMap2.put("hell04",1);
//        myMap2.put("hell03",1);
//        myMap2.put("hell02",1);
//        myMap2.put("hell01",1);
//        myMap2.put("hell00",1);
//        System.out.println(myMap2);
        }
    }

