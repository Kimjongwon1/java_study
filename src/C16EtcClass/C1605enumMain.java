package C16EtcClass;

public class C1605enumMain {
    public static void main(String[] args) {
        enumStudent s1 = new enumStudent();
        enumStudent s2 = new enumStudent();
        enumStudent s3 = new enumStudent();
        enumStudent s4 = new enumStudent();
        s1.setName("hong1");
        s2.setName("hong2");
        s3.setName("hong3");
        s1.setClassGrade(ClassGrade.a1);
        s2.setClassGrade(ClassGrade.a2);
        s3.setClassGrade(ClassGrade.a3);

//        타입이 여전히 String 타입이므로 class변수를 사용하지 않을수 있다.
//        Enum타입 사용시에는 static final 변수와 동일방법
        s4.setRole(Role.GENERAL_USER);

        System.out.println(s4.getRole());
        System.out.println(s4.getRole().getClass());
//        enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s4.getRole().ordinal());
    }
}
class ClassGrade{
    final static String a1 = "first_grade";
    final static String a2 = "Second_grade";
    final static String a3 = "Third_grade";
}
enum Role{
//    각 열거형 변수는(상수는) ,로 구분하고 상수목록 끝은 ;으로 마무리
    GENERAL_USER,ADMIN_USER,SUPER_USER;
};
class enumStudent{
    private String name;
    //    소속 반
    private String classGrade;
//    string타입이 아닌 role타입을 지정
private Role role;

    public String getName() {
        return name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
