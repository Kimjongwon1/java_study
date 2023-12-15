package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {
//        System.out.println( Mycalculator.Summ(1,2));
//        Mycalculator.SummAcc(10);
//        Mycalculator.SummAcc(20);
//        Mycalculator.SummAcc(30);
////        A부서의 매출
//        Mycalculator.SummAcc(10);
//        Mycalculator.SummAcc(20);
//        Mycalculator.SummAcc(30);

//        클래스 변수를 공용사용하여 누적되다보니 변수와 메소드의 고유성 보장이 힘듬 예) A회사 B회사 각자의 매출을 구할때 누적되서 값이 나옴 -> 각 회사 매출을 구할 수 없음
//        int total = Mycalculator.total;
//        System.out.println(total);

//        A부서의 매출
        MycalculatorInstance mycalA = new MycalculatorInstance();
        mycalA.SummAcc(10);
        mycalA.SummAcc(20);
        mycalA.SummAcc(30);
        System.out.println(mycalA.total);
//        B부서의 매출
        MycalculatorInstance mycalB = new MycalculatorInstance();
        mycalB.SummAcc(10);
        mycalB.SummAcc(20);
        mycalB.SummAcc(30);
        System.out.println(mycalB.total);

    }


//    매개변수2개 받아서 더한값 return sum;
//    static int Summ(int a, int b){
//            return a+b;
//    }

}
//내부 클래스
//public은 두 개 일 수 없음
//class Mycalculator{
//        static int total =0;
//        static int Summ(int a, int b){
//            return a+b;
//        }
////    static int SummAcc(int a){
////        total +=a;
////        return total;
////    }
//
//        static void SummAcc(int a){
//            total +=a;
//        }
    class MycalculatorInstance{
         int total =0;
//         static이 붙어있는 변수는 클래스 변수,없으면 객체변수
         int Summ(int a, int b){
            return a+b;
        }

//        void SummAcc(int a){
//            total +=a;
//        }
        void SummAcc(int a){
//             this. 는 객체,그 자신을 말함
            this.total +=a;
        }

}
