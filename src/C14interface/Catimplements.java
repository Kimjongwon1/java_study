package C14interface;

//public class Catimplements implements Animalinterface1{
//    @Override
//    public void makesound() {
//        System.out.println("야옹야옹");
//    }
//}

 class Catmultiimplements implements Animalinterface1,Animalinterfacde2{
    @Override
    public void makesound() {
        System.out.println("야옹야옹");
    }

     @Override
     public String play(String a, String b) {
         return a+" 와 "+b+" 가 논다.";
     }
 }
