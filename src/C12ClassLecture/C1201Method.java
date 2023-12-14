package C12ClassLecture;

public class C1201Method {
    public static void main(String[] args) {
//        for문 이용 1~10까지 total 출력
//        int total =0;
//        for (int i=1 ; i<11;i++){
//            total += i;
//        }
//        System.out.println(total);
//
//        int total2 =0;
//        for (int i=10 ; i<=20;i++){
//            total2 += i;
//        }
//        System.out.println(total2);
//        코드 중복 발생, 특정 기능 집합을 별도로 분리
        int total = sumAcc(100,200);
        System.out.println(total);
//        같은클래스내에 메소드들 사이에서의 호출은 static 메소드라 할지라도 클래스명 생략가능
//        메소드 구성요소 : 매개변수, 반환타입, 접근제어자, 클래스 메소드(static)
//        static이 없으면 new 로 객체 만들어줘야함
    }
    
//    void return타입은 없음,
//    int,string 등은 return 타입 명시
//    heap메모리에 직접 다녀와서 변환하는거기때문에 원본이 변환됨
    
//    static void sumAcc(int start, int end){
//        int total =0;
//        for (int i=start ; i<=end;i++){
//            total += i;
//        }
//        System.out.println(total);
//    }
    public static int sumAcc(int start, int end){
    int total =0;
    for (int i=start;i<=end;i++){
        total += i;
        }
    return  total;
    }
}
