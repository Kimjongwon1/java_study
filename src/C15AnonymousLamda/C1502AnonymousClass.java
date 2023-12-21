package C15AnonymousLamda;

public class C1502AnonymousClass {
    public static void main(String[] args) {
        animal dog = new animal() {
            @Override
            public void makesound(int n) {
                System.out.println("야옹야옹"+n);
            }
        };
        dog.makesound(10);
        //익명개체에 구현 메소드가 하나밖에 없을 경우 람다 표현식(화살표 함수)로 표현가능
//        ()부분에 매개변수 지정하여 구현체에서 활용,변수명의 개수가 많으면 개수에 맞추어 지정
        animal cat = a -> System.out.println("컹컹"+a);
        cat.makesound(10);

    }
}
interface animal {
    void makesound(int n);
}
