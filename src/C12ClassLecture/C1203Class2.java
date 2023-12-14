package C12ClassLecture;

import java.util.Arrays;

public class C1203Class2 {
    public static void main(String[] args) {
//        person 클래스 만듬
//        객체변수 name, email, password,age
//        객체매소드 whoIs(): name, email,password,age ->출력;
//        객체명.name ="홍길동";
//       person user = new person();
//       변수값에 직접 할당
//        user.name = "홍길동";
//        user.email = "hong@naver.com";
//        user.password = "홍길동";
//        user.age = 20;
//        System.out.println(user.WhoIs());
//        System.out.println("name :" + user.name
//                +"\n"+"email : "+ user.email
//                +"\n"+"password : " + user.password
//                +"\n"+"age :" + user.age
//                +"\n"+"입니다." );

//        person user2 = new person();
////       변수값에 직접 할당
//        user2.name = "홍길순";
//        user2.email = "hong1@naver.com";
//        user2.password = "홍길순";
//        user2.age = 22;

        person user3 = new person();
        user3.setName("홍길령");
        user3.setEmail("hong3@naver.com");
        user3.setAge(23);
        System.out.println(user3.getName());
        System.out.println(user3.getEmail());
        System.out.println(user3.getAge());
    }

}
class person{
   private String name;
   private String email;
   private String password;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<10){
            this.name = name;
            System.out.println("이름완료");
        }else {
            System.out.println("이름이 너무기셈");
        }
       
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
            System.out.println("세팅성공");
        }else {
            System.out.println("@이가 없으셈~");
        }
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=20){
            this.age = age;
            System.out.println("정상가입완료");
        }else {
            System.out.println("20세이상만 가능합니다.");
        }
        
    }
//    static int person_total;
    
//    void Whois(String name, String email, String password, int age) {
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.age = age;
//    }
    
//String WhoIs(){
//    return  "name :" + this.name
//            +"\n"+"email : "+ this.email
//            +"\n"+"password : " + this.password
//            +"\n"+"age :" + this.age
//            +"\n"+"입니다.";
//    }
}
