package C11Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {


//        String a = "hello";
//        String b = "hello";
//        boolean c = (a==b);
//        System.out.println(c); //true

//        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        Wrapper클래스 :기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스

//        int와 integer간 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////      Auto unboxing 자동으로 형변환해주는거 Integer->int
//        int c = b;
////      명시적으로도 가능 Integer->int
//        int d = b.intValue();
////      오토박싱
//        Integer e = a;
////      박싱
//        Integer f = Integer.valueOf(a);
//      이 위는 별로 안중요
//      String과 int의 형변환
//        int a = 10;
//        String st_a = Integer.toString(a); //"10"
////        int c = st_a; <-그냥 담으면 에러남
//        String st_a2 = String.valueOf(a);
//        int c = Integer.parseInt(st_a);   // 10

//        참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야함 ex)컬렉션 프레임 워크(List,set...)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);
//
//        int[] arr = new int[5];

//        String my_str1 = new String("hello");
//        String my_str2 = new String("hello");
//        String my_str3 = "hello";
//        String my_str4 = "hello";
//        String my_str5 =  my_str1;
//
//        System.out.println(my_str1 == my_str2); //false
//        System.out.println(my_str1 == my_str3); //false
//        System.out.println(my_str3 == my_str4); //true
//        System.out.println(my_str1 == my_str5); //true
//
//        System.out.println(my_str1.equals(my_str2)); //true
//        System.out.println(my_str1.equals(my_str3)); //true
//        System.out.println(my_str3.equals(my_str4)); //true
//        System.out.println(my_str1.equals(my_str5)); //true

//      문자열의 길이 : length(); , 공백도 문자열길이로 계산됨
//        String mySt = "hello";
//        System.out.println(mySt.length());
////      IndexOF(), 특정 문자열의 위치 반환, 같은 문자가 있으면 가장 먼저 나오는 단어 반환
//        String mySt2 = "hello java";
////        int myst_index = mySt2.indexOF("java");
//        System.out.println(mySt2.indexOf("java"));

//       contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        String mySt = "hello";
//        System.out.println(mySt.contains("he"));
        
//        CharAt :특정위치의 문자를 리턴
//        String a = "hello";
//        char myChar = a.charAt(1);
//        System.out.println(myChar);

//        실습 특정문자가 몇개있는지? (charAt과 length를 활용한)

//        String a = "abcdaaaaff";
//        int myChar = 0;
//        for(int i=0; i<a.length(); i++){
//            if(a.charAt(i) == 'a'){
//                myChar++;
//            }
//        }
//        System.out.println(myChar);

//        substring(a,b); a 이상 b 미만의 index를 자른다.
//        String st1 = "hello World";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));
//      프로그래머스 substring 문제 : 가운데 글자 가져오기

//        String answer = "";
//        if (s.length()%2 == 0){
//            System.out.println(s.substring(s.length()/2-1,s.length()/2+1));
//            answer = s.substring(s.length()/2-1,s.length()/2+1);
//        }else{
//            System.out.println(s.substring(s.length()/2,s.length()/2+1));
//            answer = s.substring(s.length()/2,s.length()/2+1);
//        }
//        return answer;


//      trim
//        String trimSt = "       Hello world     ";
//        String new_trim = trimSt.trim();
//        String stripst = trimSt.strip();
//        System.out.println(new_trim);
//        System.out.println(stripst);

//        toUppercase(), toLowerCase()
//        String a = "Hello";
//        String a1 = a.toUpperCase();
//        String a2 = a.toLowerCase();
//        System.out.println(a1);
//        System.out.println(a2);

//        문자열 더하기
//        String a = "hello";
//        a += " world";
//        a += " world";
//        System.out.println(a);

//        char->String
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);


//      알파벳 빼고 문자를 str2에 담기 (다시해보기)
//        String str = "012abc한글한글김한글df234";
//        String str2 = "";
//
//        for(int i=0;i<str.length();i++){
//           char temp = str.charAt(i);
//            if(temp< 'a' || temp > 'z'){
//                str2 += temp;
//                //str2 += Character.toString(temp);
//            }
//
//        }
//        System.out.println(str2);

//      프로그래머스 특정 문자 제거하기(다시풀기, letter의 형식 다시보고 charAt()의 의미 다시 생각)
//        String answer = "";
//        for(int i=0;i<my_string.length();i++){
//            char temp = my_string.charAt(i);
//            if(temp != letter.charAt(0)){
//                answer += temp;
//            }
//        }
//
//        return answer;
//    }

//        replace(a,b) : a문자를 b문자로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
////        replaceAll(a,b);
//        String st3 = st1.replaceAll("world","python");
//
//        System.out.println(st2);
//        System.out.println(st3);

//
//        String str = "012abcAB한글한글김한글df234";
////        [a-z] 소문자 알파벳 [A-Z] 대문자 알파벳
////        [가-힣] 한글
//        String hg = str.replaceAll("[a-z]","");
//        System.out.println(hg);
//        String en = str.replaceAll("[가-힣]","");
//        System.out.println(en);
////        [0-9] 숫자
//        String num = str.replaceAll("[0-9]","");
//        System.out.println(num);
////        [A-Za-z](대소문자)
//        String EN = str.replaceAll("[A-Za-z]","");
//        System.out.println(EN);
////        [A-Za-z0-9](대소문자,숫자)
//        String ENNUM = str.replaceAll("[A-Za-z0-9]","");
//        System.out.println(ENNUM);

//        pattern클래스
//        boolean matcher = Pattern.matches(".*[a-z]+.*","한글helloworld");
//        System.out.println(matcher);

//        boolean matcher = Pattern.matches("[a-z]+","helloworld");
//        System.out.println(matcher);
//      전화번호
//       \d:숫자 {}:연속으로
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-1234-5678");
//        System.out.println(matcher2); //true

//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{3}-\\d{4}$","010-123-5678");
//        System.out.println(matcher2); //true


//        이메일 검증
//       \d:숫자 {}:연속으로
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$","hello1@naver.com");
//        System.out.println(matcher3); //true

//        프로그래머스 문자열 다루기 기본
//        boolean answer = Pattern.matches("[0-9]{4}|[0-9]{6}",s);
//        return answer;

//        split
//        String a = "a:b:c:d";
//        String[] strArr = a.split(":");
//        System.out.println(Arrays.toString(strArr));
//
//        String b = "  a  b c d";
//        String c = b.trim();
//        String[] strArr2 = b.split(" ");
//        System.out.println(Arrays.toString(strArr2));
//
//        String[] strArr3 = c.split("\\s+");
//        System.out.println(Arrays.toString(strArr3));

//        isEmpty와 null
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1 == null);
//        System.out.println(st2 == null);
//        System.out.println(st2.isEmpty());
////        nullPointer Exception 예외 발생
//        System.out.println(st1.isEmpty());
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";

//        join : String[] ->String
//        String [] strArr = {"java","c","c++"};
////        1)배열선언 2)랭귀지 나열 3)join:공백하나로 4)출력
//        System.out.println(String.join(" ",strArr));

//        StringBuffer
//        String st1 = "hello";
//        StringBuffer sb1 = new StringBuffer(st1);
//        System.out.println(sb1);//stringbuffer 값
//        String new1 = sb1.toString();
//        System.out.println(new1);//string 값
//        sb1.append(" world");
//        System.out.println(sb1);
//
////        Hello javaworld
//        sb1.insert(6,"java ");
//        System.out.println(sb1);
//        System.out.println(sb1.substring(6,10));
//        sb1.delete(6,10);
//        System.out.println(sb1);

//        stringbuilder  성능 StringBuffer보다 좋다(스레스 safe 안됨)
//        StringBuilder sb2 = new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);

//        프로그래머스 문자 반복출력하기
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<my_string.length();i++){
//            for(int j=0; j<n;j++){
//                sb.append(my_string.charAt(i));
//            }
//        }
//        String answer = sb.toString();
//            내가푼거
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < my_string.length(); i++) {
//            for (int j = 0; j < n; j++) {
//                sb.insert(sb.length(), my_string.charAt(i));
//            }
//        }
//        String answer = sb.toString();
//        return answer;
//    }

//        문자열 밀기( 다시 풀기/ 생각 다듬기)
//        String st1 = A;
//        int result = 0;
//        int answer = result;
//        StringBuilder sb1 = new StringBuilder(st1);
//        for(int i =0; i<100;i++){
//            sb1.insert(i,sb1.charAt(i+1));
//            sb1.delete(sb1.length(i),st1.length(i));
//            if(sb1 == B){
//                result = i;
//            }else{
//                result=-1;
//            }
//
//        }
//
//
//        return answer;
//    }

//        하려고 했던거

//        if (A.length() != B.length()) {
//            return -1; // A와 B의 길이가 다르면 밀 수 없으므로 -1 반환
//        }
//
//        int length = A.length();
//        StringBuilder sb = new StringBuilder(A);
//
//        for (int i = 0; i < length; i++) {
//            if (sb.toString().equals(B)) {
//                return i; // A와 B가 같으면 i를 반환 (최소 횟수)
//            }
//            // A를 한 칸 오른쪽으로 밀기
//            sb.insert(0, sb.charAt(length - 1));
//            sb.deleteCharAt(length);
//        }
//
//        return -1; // A를 밀어도 B가 되지 않는 경우 -1 반환
//    }

//          강사님
//        String A = "hello";
//        String B = "ohell";
//
////        int answer = 0;
//        StringBuilder sb = new StringBuilder(A);
//        while(true){
//            if(sb.toString().equals(B)){
//                break;
//            }
//
//            answer++;
//            sb.insert(0,sb.charAt((A.length()-1)));
//            sb.delete(sb.length()-1, sb.length());
//            if(answer>A.length()){
//                answer = -1;
//                break;
//            }
//        }
//        int answer = -1;
//        for(int i=0; i<A.length(); i++){
//            if(sb.toString().equals(B)){
//                answer = i;
//                break;
//            }
//            sb.insert(0,sb.charAt((A.length()-1)));
//            sb.delete(sb.length()-1, sb.length());
//        }
    }
}
