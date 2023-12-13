import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueue {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
//        mySt.push(40);
//        mySt.pop();
//        System.out.println(mySt);
////        pop:스택에서 요소제거후 반환
//        System.out.println(mySt.pop());
////        peek:스택에서 마지막 요소 반환, 제거 아님
//        System.out.println(mySt.peek());
//        System.out.println(mySt);
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());
//       String 객체 5개 stack에 추가후 while문으로 출력
//        Stack<String> mySt1 = new Stack<>();
//        mySt1.push("hi1");
//        mySt1.push("hi2");
//        mySt1.push("hi3");
//        mySt1.push("hi4");
//        mySt1.push("hi5");
//
//        while (!mySt1.isEmpty()) {
//            System.out.println(mySt1.pop());
//        }

//        웹페이지 뒤로가기
//        웹페이지 방문, 방문 사이트 출력 + 뒤로가기 기능 구현
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트 방문이면 해당주소 push
//        뒤로가기이면 pop
//        Stack<String> myHistory = new Stack<>();
//        while(true){
//        System.out.println("방문할 웹사이트를 입력해주세요 뒤로가려면 back을 입력하시고 종료는 end를 누르세요");
//        Scanner sc = new Scanner(System.in);
//        String inputs = sc.nextLine();
//        myHistory.push(inputs);
//        System.out.println("방문사이트는 : " + inputs);
//            if(Objects.equals(inputs, "back")) {
//                myHistory.pop();
//                System.out.println(myHistory.peek());
//            } else if (Objects.equals(inputs, "end")) {
//                break;
//            } else{
//                myHistory.push(inputs);
//            }
//        }

//        Stack<String> myHistory = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("방문할 웹사이트를 입력해주세요. 뒤로가려면 'back'을 입력하시고 종료는 'end'를 입력하세요.");
//            String input = scanner.nextLine();
//
//            if (Objects.equals(input, "back")) {
//                if (!myHistory.isEmpty()) {
//                    myHistory.pop();
//                    if (!myHistory.isEmpty()) {
//                        System.out.println("현재 페이지는: " + myHistory.peek());
//                    } else {
//                        System.out.println("이전 페이지가 없습니다.");
//                    }
//                } else {
//                    System.out.println("방문 기록이 없습니다.");
//                }
//            } else if (Objects.equals(input, "end")) {
//                break;
//            } else {
//                myHistory.push(input);
//                System.out.println("방문한 사이트는: " + input);
//            }
//        }
//        scanner.close();
        
//        queue 선언
//        Queue<Integer> myq = new LinkedList<>();
//        myq.add(10);
//        myq.add(20);
//        myq.add(30);
//        System.out.println(myq);
//        System.out.println(myq.poll());
//      프린터 대기열 예제
//        문서 1,2,3 추가 ,while문 "현재 인쇄중인 문서 :"
//        Queue<String> myq = new LinkedList<>();
//        myq.add("문서1");
//        myq.add("문서2");
//        myq.add("문서3");
//        while (!myq.isEmpty()){
//            System.out.println("현재 인쇄중인 문서 :" + myq.poll());
//        }

//        길이의 제한이 있는 Queue : arrayBlockingQueue;
        Queue<String> limit = new ArrayBlockingQueue<>(3);
//        offer 와 add의 차이
//        add는 길이가 다 찼을때 error 발생, offer는 공간이 충분할때만 add
//        limit.add("hello1");
//        limit.add("hello1");
//        limit.add("hello1");  //하나 더 넣으면 에러 발생
//        limit.offer("hello1");
//        limit.offer("hello1");
//        limit.offer("hello1");
//        limit.offer("hello1");
//        System.out.println(limit);

//        우선순위 Queue
//        Queue<Integer> pa = new PriorityQueue<>();
//        pa.add(110);
//        pa.add(30);
//        pa.add(50);
//        pa.add(40);
//        pa.add(70);
//        pa.add(90);
//        System.out.println(pa);
//        while (!pa.isEmpty()){
//            System.out.println("값은? : " + pa.poll());
//        }
//        더 맵게 프로그래머스
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        Queue<Integer> pa = new PriorityQueue<>();
//        int sum=0;
//        int answer = 0;
//        int K = 7;
//        for(int i : scoville){
//            pa.add(i);
//        }
//        while (pa.size()>1){
//            if(pa.peek() =< K){
//               break;
//            }else{
//                answer=-1;
//            }
//            sum=pa.poll()+(pa.poll()*2);
//            answer++;
//            pa.add(sum);
//
//        }System.out.println(answer);



//        public static void main(String[] args) {
//            int[] scoville = {1, 2, 3, 9, 10, 12};
//            int K = 7;
//            int result = solution(scoville, K);
//            System.out.println("최소 횟수: " + result);
//        }
//
//
//            PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//            // PriorityQueue에 scoville 배열 추가
//            for (int s : scoville) {
//                pq.add(s);
//            }
//
//            int count = 0;
//
//            while (pq.size() > 1) {
//                // 가장 작은 값이 K 이상이면 모든 음식의 스코빌 지수가 K 이상이므로 반복 종료
//                if (pq.peek() >= K) {
//                    return count;
//                }
//
//                // 스코빌 지수가 K보다 작은 두 개의 음식을 꺼내서 섞기
//                pq.add(mixed); // 섞은 음식의 스코빌 지수를 PriorityQueue에 추가
//                count++;
//            }
//
//            // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
//            if (pq.peek() < K) {
//                return -1;
//            }
//
//            return count;
//
//

    }
}

