package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;

public class C1205MethodOverloading {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =30;
//        abc summ = new abc();
//        summ.sum(a,b);
//        System.out.println(summ.sum(a,b));
//        summ.sum(a,b,c);
//        System.out.println(summ.sum(a,b,c));
        
//        메소드 오버로딩을 통해 같은 메소드명 재활용
        C1205MethodOverloading mto = new C1205MethodOverloading();
        System.out.println(mto.sum(a,b));
        System.out.println(mto.sum(a,b,c));
        double d = 10;
        double e = 10;
        C1205MethodOverloading sto = new C1205MethodOverloading();
        System.out.println(sto.sum(d,e));
//                제네릭을 통해 타입 재활용
        List<Integer> myList = new ArrayList<>();



    }
    int sum(int a, int b){
        int sum =0;
        sum=a+b;
        return sum;
    }
    int sum(int a, int b,int c){
        int sum =0;
        sum=a+b+c;
        return sum;
    }
    double sum(double a, double b){
        double sum =0;
        sum=a+b;
        return sum;
    }
}
//class abc {
//public int sum(int a, int b){
//        int sum =0;
//        sum=a+b;
//        return sum;
//        }
//
//public int sum(int a, int b,int c){
//        int sum =0;
//        sum=a+b+c;
//        return sum;
//        }
//}
