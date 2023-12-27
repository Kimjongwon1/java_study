package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1705JsonWiithJackSonHttp {
    public static void main(String[] args) {
//        자바에 내장된 http 라이브러리를 이용해서 웹에 있는 testdata parsing하기
//        http클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//        http 요청 객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/")) // create(요청할 주소)
                .GET() // 데이터를 받기위한 GET요청
                .build();
//        http응답객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // 값을 string으로 반환
            String post = response.body();
            JsonNode jsonNode = mapper.readTree(post);
//            Post post1 =new Post(jsonNode.get("userId").asInt(),
//                    jsonNode.get("id").asInt(),
//                    jsonNode.get("title").asText(),
//                    jsonNode.get("body").asText());
//            readValue를 사용해서 객체를 곧바로 매핑
//            Post mypost2 = mapper.readValue(post, Post.class);
//            System.out.println(mypost2);
//          jsonnode는 트리구조라서 for(jsonnode i : jsonNode){} 가 가능
            List<Post> i = new ArrayList<>();
            for(JsonNode s : jsonNode){
                i.add(new Post(s.get("id").asInt(),s.get("title").asText()));
            } System.out.println(i);

//            java객체를 json데이터로 직렬화
            String serialized_data = mapper.writeValueAsString(i);
            System.out.println(serialized_data);
//            List<Post> i = new ArrayList<>();
            for(JsonNode s : jsonNode){
                Post mypost = mapper.readValue(s.toString(), Post.class);
                i.add(mypost);
            } System.out.println(i);
//            Map<String, String> postMap = new HashMap<>();
//            String userId = postMap.put("userId", jsonNode.get("userId").asText());
//            String id = postMap.put("id", jsonNode.get("id").asText());
//            String title = postMap.put("title", jsonNode.get("title").asText());
//            String body = postMap.put("body", jsonNode.get("body").asText());
//            System.out.println(postMap);
//            System.out.println(post1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Post {
//    getter/생성자/toString메소드 만들기
    int userId;
    int id;
    String title;
    String body;
//    public Post(int userId, int id, String title, String body) {
//        this.userId = userId;
//        this.id = id;
//        this.title = title;
//        this.body = body;
//    }

   Post(){

   };

    public Post(int id, String title) {

    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Id는 " + this.id + " Title은 " + this.title;
    }
}