package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C04HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
//        외부데이터(api) 요청 : 서버간의 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리

//        HTTPClient : 자바의 내장클래스로서 별도의 역직렬화 작업이 필요
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();


        System.out.println(postString);




        List<Post> post = new ArrayList<>();
        ObjectMapper o1 = new ObjectMapper();
        JsonNode jsonNode = o1.readTree(postString);
        for(JsonNode j : jsonNode){
            Post p = o1.readValue(j.toString(), Post.class);
            post.add(p);
        }

        for(Post p: post){
            System.out.println(p);
        }
    }
}



// ObjectMapper를 사용하기위해선 기본생성자와 getter 메서드가 필요하다.
class Post{
    private Long userId;
    private Long id;
    private String title;
    private String body;

//    public Post(int userId, int id, String title, String body) {
//        this.userId = userId;
//        this.id = id;
//        this.title = title;
//        this.body = body;
//    }

    public Post() {
        // 기본 생성자
    }

    public Long getUserId() {
        return userId;
    }

    public Long getId() {
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
        return "{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}