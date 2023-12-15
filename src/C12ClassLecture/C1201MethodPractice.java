package C12ClassLecture;

public class C1201MethodPractice {
    public static void main(String[] args) {
//        소수 :1과 자기자신 외에 약수가 없는것.
//        소수인지 아닌지 판별하는 메소드 생성, return 타입은 boolean;main에서 호출
//        소수이면 true, 아니면 false
        int a=13;
        System.out.println(prime(a));
    }
    public static boolean prime (int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i*i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
//    void 리턴타입 메소드에서도 강제종료를 위해 return 가능
public static void isprimeprint (int a){

    for (int i = 2; i*i<= a; i++) {
        if (a % i == 0) {
            System.out.println("소수아님");
            return;
        }
    }
    System.out.println("소수임");
 }
}
