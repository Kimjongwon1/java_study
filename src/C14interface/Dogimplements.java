package C14interface;

//public class Dogimplements implements Animalinterface1{
//    @Override
//    public void makesound() {
//        System.out.println("멍멍");
//    }
//}
 class Dogmultiimplements implements Animalinterface1,Animalinterfacde2{
    @Override
    public void makesound() {
        System.out.println("멍멍");
    }

    @Override
    public String play(String a, String b) {
        return a+" 와 "+b+" 가 논다.";
    }
}
