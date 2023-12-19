package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    static int start;
    static int sum;
    static int max = 0;
    static int temp = 0;
    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> combinations = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        C1207RecurCombiPermu st = new C1207RecurCombiPermu();
////        st.combination(combinations, temp, myList, 0);
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<List<Integer>> listInt = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

//        1
//        Sixtwoadd(myList, listInt, temp, start);
//        System.out.println(listInt);
//        2
        boolean[] used = new boolean[myList.size()];
       Sixtwoadd2(myList,listInt,temp,used);
        System.out.println(listInt);

//        Sixtwoadd2(myList, listInt, temp, start);
//        System.out.println(listInt);
//        List<List<Integer>> permutations = new ArrayList<>();
//        boolean[] used = new boolean[myList.size()];
//
//        generateUniquePermutations(permutations, new ArrayList<>(), used, myList);

        // 생성된 순열 출력
//        for (List<Integer> permutation : permutations) {
//            System.out.println(permutation);
//        }
//
//        System.out.println("총 순열의 개수: " + permutations.size());
    }
    //순열 : 합계가 6이상인 2개 순열만 add
//    static void Sixtwoadd(List<Integer> myList, List<List<Integer>> listInt,List<Integer> temp,int start){
//        if (temp.size() == 2) {
//            for(in)
//            if(6<=temp.get(i)+temp.get(i+1)){
//                sum[]=sixtwo.
//            }
//            listInt.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = start; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            Sixtwoadd(myList, listInt, temp, i + 1);
//            temp.remove(temp.size() - 1);
//        }
//        for (List<Integer> sixtwo : listInt) {
//            for(int i=0; i<sixtwo.size();){
//                if(6<sixtwo.get()+sixtwo.get()){
//                    sum+=sixtwo.
//                }
//            }
//
//        }
//        if(){
//
//        }
//    }

    static void Sixtwoadd(List<Integer> myList, List<List<Integer>> listInt, List<Integer> temp, int start) {
        if (temp.size() == 2) {
            int sum = temp.get(0) + temp.get(1);
            if (sum >= 6) {
                listInt.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            Sixtwoadd(myList, listInt, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    //순열 : 합계가 6이상 모든 순열 add : temp.size사용
    static void Sixtwoadd2(List<Integer> myList, List<List<Integer>> listInt, List<Integer> temp, boolean[] used) {
        if (temp.size() == myList.size()) {
            listInt.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if (!used[i]) {
                used[i] = true;
                temp.add(myList.get(i));
                Sixtwoadd2(myList, listInt, temp, used);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
    //        재귀함수로 구현한 조합
    void combinations(List<Integer> list, List<List<Integer>> combinations, List<Integer> temp, int start, int n) {

        if(temp.size() == n) {
            combinations.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start; i<list.size(); i++) {
            temp.add(list.get(i));
            combinations(list, combinations, temp, i+1, n);
            temp.remove(temp.size()-1);
        }
    }

    //    재귀함수로 구현한 순열
//    중복제거
    void permutation (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp,int n, boolean[] visited) {
        if(temp.size() == n) {
            permutations.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) { // 같은 숫자 반복 안되도록
                visited[i] = true;
                temp.add(list.get(i));
                permutation(list, permutations, temp, n, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

    //    합계가 6 이상인 2개의 순열만 add
    void sumPerTwo (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp, int n, boolean[] visited) {
        if(temp.size() == n) {
            int sum = 0;
            for(int i=0; i<temp.size(); i++) {
                sum += temp.get(i);
                if(sum >= 6) {
                    permutations.add(new ArrayList<>(temp));
                }
            }

        }

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                sumPerTwo(list, permutations, temp, n, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

    //    합계가 6 이상인 모든 순열 add
    void sumPerAll (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp, boolean[] visited) {

        int sum = 0;
        for(int i=0; i<temp.size(); i++) {
            sum += temp.get(i);
        }
        if(sum >= 6) {
            permutations.add(new ArrayList<>(temp));
        }

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                sumPerAll(list, permutations, temp, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

    //    모든 순열에서 합계가 가장 큰 값 찾기
    void permuMax (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp, boolean[] visited) {

        int sum = 0;
        for(int i=0; i<temp.size(); i++) {
            sum += temp.get(i);
            if(sum > max) {
                max = sum;
            }
        }

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                permuMax(list, permutations, temp, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

    //    3개 조합의 순열에서 합계가 가장 큰 값 찾기 (temp리스트 사용 금지)
    void permuMax2 (List<Integer> list, int n, boolean[] visited, int sum) {

        if(temp == n && sum > max) {
            max = sum;
        }
//         return?

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp ++;
                sum += list.get(i);
                permuMax2(list, n, visited, sum);
                visited[i] = false;
                sum -= list.get(i);
                temp --;
            }
        }
    }

    //    강사님 풀이
    void permutation(List<Integer> myList, List<List<Integer>> combi_list, boolean[] visited, int temp, int count) {
        if(count == 3) {
            if(temp > max) {
                max = temp;
            }
            return;

        }
        for(int i=0; i<myList.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp += myList.get(i);
                permutation(myList, combi_list, visited, temp, count+1);
                temp -= myList.get(i);
                visited[i] = false;
            }
        }
    }

}

//순열 : 모든 순열에서 합계가 가장 큰 값 찾기 : max찾기 알고리즘

//temp 리스트 쓰지않고 사용해보기



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
//DFS방식임
//    }void combination (List < List < Integer >> combinations, List < Integer > temp, List < Integer > myList,
//                       int start){
//        if (temp.size() == 2) {
//            combinations.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = start; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            combination(combinations, temp, myList, i + 1);
//            temp.remove(temp.size() - 1);
//        }
//
//
//    }
//    public static void generateUniquePermutations(List<List<Integer>> permutations, List<Integer> temp, boolean[] used, List<Integer> myList) {
//        if (temp.size() == 2) {
//            permutations.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = 0; i < myList.size(); i++) {
//            if (!used[i]) {
//                used[i] = true;
//                temp.add(myList.get(i));
//
//                generateUniquePermutations(permutations, temp, used, myList);
//
//                used[i] = false;
//                temp.remove(temp.size() - 1);
//            }
//        }
//
//    }
//}

//class Solution {
//    static int answer = 0;
//
////    public int solution(int balls, int share) {
////        recursive(balls, 0, share, 0);
////        return answer;
////    }
////
////    static void recursive(int balls, int temp, int share, int start) {
////        if (temp == share) {
////            answer++;
////            return;
////        }
////        for (int i = start; i < balls; i++) {
////            temp++;
////            recursive(balls, temp, share, i + 1);
////            temp--;
////        }
////    }
//
//

//순열 : 합계가 6이상인 2개 순열만 add
//순열 : 합계가 6이상 모든 순열 add : temp.size사용
//순열 : 모든 순열에서 합계가 가장 큰 값 찾기 : max찾기 알고리즘

