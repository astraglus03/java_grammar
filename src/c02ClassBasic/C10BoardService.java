package c02ClassBasic;

import java.util.*;
import java.io.*;

public class C10BoardService {
//    1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//    2.회원 전체 목록 조회 : id, email
//    3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//    4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//    5.게시물 목록 조회 : id(post), title
//    6.게시물 상세 조회 : id(post), title, contents, 작성자email
//    7.서비스 종료
    private static List<Author> authorList = new ArrayList<>();
    private static List<Post> postList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("원하시는 서비스를 선택해주세요. (1: 회원가입, 2: 회원 전체 목록 조회, 3: 회원 상세 조회, 4: 게시글 작성, 5: 게시물 목록 조회, 6: 게시물 상세 조회, 7: 종료)");
            String number = br.readLine();

            switch (number) {
                case "1" -> {
                    System.out.println("회원가입을 위해 이름, 이메일, 비밀번호를 입력해주세요. (이름, 이메일, 비밀번호 순서로 입력해주세요.)");
                    String[] input = br.readLine().split(" ");
                    if (input.length != 3) {
                        System.out.println("회원가입은 이름, 이메일, 비밀번호를 입력해야 합니다.");
                        break;
                    }

                    if(!isValidEmail(input[1])){
                        System.out.println("유효하지 않은 이메일 형식입니다. 이메일을 다시 입력해주세요.");
                        break;
                    }

                    if( authorList.stream().anyMatch(author -> author.getEmail().equals(input[1]))) {
                        System.out.println("이미 존재하는 이메일입니다. 다른 이메일을 사용해주세요.");
                        break;
                    }
                    makeAuthor(input[0], input[1], input[2]);
                }
                case "2" -> {
                    System.out.println("회원 전체 목록 조회입니다.");
                    if (authorList.isEmpty()) {
                        System.out.println("등록된 회원이 없습니다.");
                    } else {
                        for (Author author : authorList) {
                            System.out.println("ID: " + author.getId() + ", Email: " + author.getEmail());
                        }
                    }
                }
                case "3" -> {
                    System.out.println("회원 상세 조회를 위해 ID를 입력해주세요.");
                    int id = Integer.parseInt(br.readLine());
                    Author author = authorList.stream().filter((e) -> e.getId() == id).findFirst().orElse(null);
                    if (author == null) {
                        System.out.println("해당 ID의 회원이 존재하지 않습니다.");
                    } else {
                        System.out.println("ID: " + author.getId() + ", Email: " + author.getEmail() + ", Name: " + author.getName() + ", Password: " + author.getPassword() + ", 작성글수: " + author.getPosts().size());
                    }
                }
                case "4" -> {
                    System.out.println("게시글 작성을 위해 제목을 입력해주세요.");
                    String title = br.readLine();
                    System.out.println("게시글 작성을 위해 내용을 입력해주세요.");
                    String contents = br.readLine();
                    System.out.println("게시글 작성을 위해 작성자 이메일을 입력해주세요.");
                    String email = br.readLine();
                    if(!isValidEmail(email)){
                        System.out.println("유효하지 않은 이메일 형식입니다. 이메일을 다시 입력해주세요.");
                        break;
                    }

                    Author currentAuthor = authorList.stream().filter((e) -> e.getEmail().equals(email)).findFirst().orElse(null);

                    if(currentAuthor == null){
                        System.out.println("해당 이메일의 회원이 존재하지 않습니다. 게시글 작성을 취소합니다.");
                    } else {
                        Post newPost = new Post(title,contents, currentAuthor);
                        postList.add(newPost);
                        System.out.println("게시글이 작성되었습니다. ID: " + newPost.getId() + ", Title: " + newPost.getTitle() + ", Author Email: " + currentAuthor.getEmail());
                    }
                }
                case "5" -> {
                    System.out.println("게시물 목록 조회입니다.");
                    if(postList.isEmpty()){
                        System.out.println("등록된 게시물이 없습니다.");
                    }
                    else{
                        for(Post post : postList){
                            System.out.println("ID: " + post.getId() + ", Title: " + post.getTitle());
                        }
                    }
                }
                case "6" -> {
                    System.out.println("게시물 상세 조회를 위해 ID를 입력해주세요.");
                    int id = Integer.parseInt(br.readLine());
                    List<Post> filteredPosts = postList.stream().filter((e) -> e.getAuthorId() == id).toList();

                    if (filteredPosts.isEmpty()) {
                        System.out.println("해당 ID의 게시물이 존재하지 않습니다.");
                    } else {
                        for(Post post : filteredPosts) {
                            System.out.println("ID: " + post.getId() + ", Title: " + post.getTitle() + ", Contents: " + post.getContents() + ", Author Email: " + post.getAuthor().getEmail());
                        }
                    }
                }
                case "7" -> {
                    System.out.println("서비스를 종료합니다.");
                    br.close();
                    return;
                }
            }
        }
    }

//    이메일 유효성 검사 메서드
    private static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

//    회원가입 메서드
    private static void makeAuthor(String name, String email, String password) {
        authorList.add(new Author(name, email, password));
        System.out.println("회원가입 이 완료되었습니다. ID: " + authorList.get(authorList.size() - 1).getId() + ", Email: " + email);
    }
}

class Author{
    static int idCounter = 0;
    private int id;
    private String name;
    private String email;
    private String password;
    List<Post> posts = new ArrayList<>();

    public Author(String name, String email, String password) {
        this.id = ++idCounter;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return posts;
    }
}

class Post{
    private static int idCounter = 0;
    private int id;
    private String title;
    private String contents;
    private int authorId;
    private Author author;

    public Post(String title, String contents, Author author){
        this.id = ++idCounter;
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.authorId = author.getId();
        author.posts.add(this);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public int getAuthorId() {
        return authorId;
    }

    public Author getAuthor() {
        return author;
    }
}