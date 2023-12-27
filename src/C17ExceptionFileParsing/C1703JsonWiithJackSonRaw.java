package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper; // jackson 라이브러리의 핵심 클래스

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1703JsonWiithJackSonRaw {
    //    최종목표 : json파일 내용을 이용하여 student 객체 생성하기
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(); // json형태는 기본적으로 문자열""로 구성, java에서 사용하기 위해 map형태로 변환해주는 것이 jackson의 ObjectMapper클래스
        try {
//            readTree를 통해서 json을 계층적 트리구조 형태(=map형태)로 변환
            File myPath = Paths.get("src/C17ExceptionFileParsing/test_date2.json").toFile();
            JsonNode jsonNode = mapper.readTree(myPath);
            JsonNode jsonNode1 = jsonNode.get("students");
//            JsonNode data1 = mapper.readTree(Paths.get("src/C17ExceptionFileParsing/test_data1.json").toFile()); // JsonNode형태로 반환
//            JsonNode data1 = mapper.readTree(myPath);
//            Map<String, String> student = new HashMap<>();
//            student.put("id", data1.get("id").asText()); // get으로 value를 가져올 수 있음 , asText() : 스트링형태로 변환
//            student.put("name", data1.get("name").asText());
//            student.put("classNumber", data1.get("classNumber").asText());
//            student.put("city", data1.get("city").asText());
//            System.out.println(student); // city=seoul, name=student1, id=1, classNumber=1

//            value의 타입이 예상되지 않을경우 Object타입으로도 받을 수 있음 <String, Object>
//            Map<String, Object> studentMap2 = mapper.readValue(myPath, Map.class); // Map.class로 Map구조로 변환
//            System.out.println(studentMap2);
            List<student> k = new ArrayList<>();
            for(JsonNode l : jsonNode1){
                student mypost1 = mapper.readValue(l.toString(), student.class);
                k.add(mypost1);
            }
            System.out.println(k);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class student{
    int id;
    String name;
    int classNumber;
    String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    //        public student(int id, String name, int classNumber, String city) {
//            this.id = id;
//            this.name = name;
//            this.classNumber = classNumber;
//            this.city = city;
//        }
    student(){

    };
    public String toString() {
        return "Id는 " + this.id + "이름은 " + this.name  + "클래스넘버는" + this.classNumber + "도시는 " + this.city ;
    }

}
