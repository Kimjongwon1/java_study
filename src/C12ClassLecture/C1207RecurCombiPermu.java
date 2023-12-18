package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        C1207RecurCombiPermu st = new C1207RecurCombiPermu();
        st.combination(combinations, temp, myList, 0);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }

//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i + 1; j < myList.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                combinations.add(temp);
//            }
//        }
//        for (List<Integer> combination : combinations) {
//            System.out.println(combination);
//        }
//        for (int i=0;i<myList.size();i++){
//            temp.add(myList.get(i));
//            for(int j=i+1;j<myList.size();j++){
//                temp.add(myList.get(j));
//                combinations.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(combinations);
//    }

    }void combination (List < List < Integer >> combinations, List < Integer > temp, List < Integer > myList,
                       int start){
        if (temp.size() == 2) {
            combinations.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combination(combinations, temp, myList, i + 1);
            temp.remove(temp.size() - 1);
        }


    }
}

class Solution {
    static int answer = 0;

    public int solution(int balls, int share) {
        recursive(balls, 0, share, 0);
        return answer;
    }

    static void recursive(int balls, int temp, int share, int start) {
        if (temp == share) {
            answer++;
            return;
        }
        for (int i = start; i < balls; i++) {
            temp++;
            recursive(balls, temp, share, i + 1);
            temp--;
        }
    }
}
