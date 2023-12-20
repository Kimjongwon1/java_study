package C14interface;

public class InterfaceMain {
    public static void main(String[] args) {

//        다형성:하나의 객체가 여러개의 참조변수타입을 가질수있음
//        타입을 interface1으로 선언하면 interface2에 정의된 메소드 사용불가;
        Catmultiimplements mycat = new Catmultiimplements();
        Dogmultiimplements mydog = new Dogmultiimplements();
        mycat.makesound();
        mydog.makesound();
        System.out.println(mycat.play("즐","거운"));
        System.out.println(mydog.play("즐","겨"));
//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가, 익명내부클래스 방식으로 사용가능
        Animalinterface1 ai = new Animalinterface1() {
            @Override
            public void makesound() {

            }
        };
   }
}
