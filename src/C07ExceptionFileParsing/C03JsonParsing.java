package C07ExceptionFileParsing;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class C03JsonParsing {
    public static void main(String[] args) throws IOException {
//        ObjectMapper : json 직렬화 역직렬화를 위한 라이브러
        ObjectMapper o1 = new ObjectMapper();
//        사용법1 객체생성 : 클래스명 객체명 = o1.readValue(문자열, 클래스명.class);
        Path filePath1 = Paths.get("src/C07ExceptionFileParsing/myJson1.json");
        String st1 = Files.readString(filePath1);
////        !!!!아주중요함!!!!
////        readValue : json 문자열을 자바 객체로 변환
//        Map<String, String> myMap = o1.readValue(st1, Map.class);
//        System.out.println(myMap.get("name"));
//        System.out.println(myMap);
//
//
//        Student s1 = o1.readValue(st1, Student.class);
//        System.out.println(s1);


//        사용법2. 트리구조의 JsonNode로 변환 : JsonNode 객체명 = o1.readTree(문자열);
//        복잡한 json자료구조일 경우에 트리구조의 JsonNode 사용
        Path filePath2 = Paths.get("src/C07ExceptionFileParsing/myJson.json");
        String st2 = Files.readString(filePath2);
        JsonNode jsonNode = o1.readTree(st2);
        Map<String, String> myMap2 = new HashMap<>();
        List<Student> students = new ArrayList<>();
        for(JsonNode j : jsonNode){
//            int id = j.get("id").asInt();
//            String name = j.get("name").asText();
//            String classNumber = j.get("classNumber").asText();
//            String city = j.get("city").asText();
//            myMap2.put(String.valueOf(id) , "이름: " + name + ", 학급: " + classNumber + ", 도시: " + city);
            Student s = o1.readValue(j.toString(), Student.class);
//            Student s1 = o1.treeToValue(j, Student.class);
            students.add(s);
        }
        System.out.println(myMap2);
        for(Student s : students) {
            System.out.println(s);
        }

//        json직렬화 : 객체 -> json 변환, writeValueAsString(객체)
        String returnSt = o1.writeValueAsString(students);
        System.out.println(returnSt);
    }
}

// 실제 값의 setting은 private이라 할지라도 직접 접근하여 setting. (reflection 기술을 활용하여 접근)
// objectMapper는 getter의 메서드명을 통해 필드값을 유추하므로, 반드시 기본생성자 + getter는 있어야함.
class Student{
    private int id;
    private String name;
    private String classNumber;
    private String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}