package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorpostService_prac {
    public static void main(String[] args) {
//        List<Author> authors = new ArrayList<>();
//        List<Post> posts = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("1번: 회원가입, 2번: 게시글작성, 3번: 회원목록조회, 4번: 회원상세조회, 5번: 게시글상세조회");
//            int number = Integer.parseInt(sc.nextLine());
//
//            switch (number) {
//                case 1:
//                    System.out.println("회원가입하실 이름을 입력해주세요");
//                    String name = sc.nextLine();
//                    System.out.println("회원가입하실 이메일을 입력해주세요");
//                    String email = sc.nextLine();
//                    Author author1 = new Author(name, email);
//                    authors.add(author1);
//                    break;
//
//                case 2:
//                    System.out.println("게시글명을 입력해주세요");
//                    String title = sc.nextLine();
//                    System.out.println("게시글 내용을 입력해주세요");
//                    String contents = sc.nextLine();
//
//                    System.out.println("작성자 email 입력해주세요");
//                    String author_email = sc.nextLine();
//
//                    // Find the author with the given ID
//                    Author authorOfPost = null;
//                    for (Author author : authors) {
//                        if (author.getEmail().equals(author_email)) {
//                            authorOfPost = author;
//                            break;
//                        }
//                    }
//                    if (authorOfPost != null) {
//                        Post post1 = new Post(title, contents, authorOfPost);
//                        posts.add(post1);
//                    } else {
//                        System.out.println("해당 작가의 메일을 찾을 수 없습니다.");
//                    }
//                    break;
//
//                case 3:
//                    for (Author a : authors) {
//                        System.out.println("작가 이름: " + a.getName() + ", 이메일: " + a.getEmail());
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("작가의 이메일을 입력해주세요");
//                    String authorEmail = sc.nextLine();
//                    Author tempAuthor = null;
//
//                    for (Author a : authors) {
//                        if (a.getEmail().equals(authorEmail)) {
//                            tempAuthor = a;
//                            break;
//                        }
//                    }
//
//                    if (tempAuthor != null) {
//                        int countPosts = 0;
//                        for (Post p : posts) {
//                            if (p.getAuthor().getId() == tempAuthor.getId()) {
//                                countPosts++;
//                            }
//                        }
//                        System.out.println("작가 이름: " + tempAuthor.getName() + ", 이메일: " + tempAuthor.getEmail() +
//                                ", 작성 글 수: " + countPosts);
//                    } else {
//                        System.out.println("해당 이메일의 작가를 찾을 수 없습니다.");
//                    }
//                    break;
//
//                case 5:
//                    System.out.println("게시글 ID를 입력해주세요");
//                    int postId = Integer.parseInt(sc.nextLine());
//                    Post tempPost = null;
//
//                    for (Post p : posts) {
//                        if (p.getId() == postId) {
//                            tempPost = p;
//                            break;
//                        }
//                    }
//
//                    if (tempPost != null) {
//                        System.out.println("게시글 제목: " + tempPost.getTitle() + ", 작가 이메일: " +
//                                tempPost.getAuthor().getEmail());
//                    } else {
//                        System.out.println("해당 ID의 게시글을 찾을 수 없습니다.");
//                    }
//                    break;
//
//                default:
//                    System.out.println("올바른 번호를 입력하세요.");
//                    break;
//            }
//        }
//    }
//}
//
//class Author {
//    private static long staticId = 0;
//    private long id;
//    private String name;
//    private String email;
//
//    public Author(String name, String email) {
//        staticId++;
//        this.id = staticId;
//        this.name = name;
//        this.email = email;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//}
//
//class Post {
//    private static long staticId = 0;
//    private long id;
//    private String title;
//    private String contents;
//    private Author author;
//
//    public Post(String title, String contents, Author author) {
//        staticId++;
//        this.id = staticId;
//        this.title = title;
//        this.contents = contents;
//        this.author = author;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//
//    public Author getAuthor() {
//        return this.author;
//    }

        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        while(true){
            System.out.println("1번:회원가입, 2번:게시글작성, 3번:회원목록조회, 4번:회원상세조회, 5번:게시글상세조회 ");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            switch (number){
                case 1:
                    System.out.println("회원가입하실 이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("회원가입하실 이메일을 입력해주세요");
                    String email = sc.nextLine();
                    Author author1 = new Author(name, email);
                    authors.add(author1);
                    break;
                case 2:
                    System.out.println("작성자 email를 입력해주세요");
                    String author_email = sc.nextLine();
                    Author temp_author = null;
                    for(Author a : authors){
                        if(a.getEmail().equals(author_email)){
                            temp_author = a;
                            break;
                        }
                    }
                    if (temp_author==null){
                        System.out.println("없는 사용자입니다.");
                        continue;
                    }
                    System.out.println("게시글명을 입력해주세요");
                    String title = sc.nextLine();
                    System.out.println("게시글 내용을 입력해주세요");
                    String contents = sc.nextLine();
                    Post post1 = new Post(title, contents, temp_author);
//                    작성자의 객체의 post리스트에 포스트를 add
                    posts.add(post1);
                    temp_author.addPost(post1);
                    break;
//                    회원목록조회
                case 3:
                    for(Author a : authors){
                        System.out.println(a.getEmail());
                    }
                    break;
//                    회원상세조회 : 이름, email, 작성글수
                case 4:
                    System.out.println("author email를 입력해주세요");
                    String author_email2 = sc.nextLine();
                    Author temp_author2 = null;
                    for(Author a : authors){
                        if(a.getEmail().equals(author_email2)){
                            temp_author2 = a;
                            break;
                        }
                    }
                    System.out.println(temp_author2.getName() + " 이고 " + "작성글 수는 " + temp_author2.getPosts().size());

                    break;
//                    게시글상세조회
                case 5:
                    System.out.println("post id를 입력해주세요");
                    Long post_id = Long.parseLong(sc.nextLine());
                    Post temp_post = null;
                    for(int i=0; i<posts.size(); i++){
                        if(posts.get(i).getId() == post_id){
                            temp_post = posts.get(i);
                            break;
                        }
                    }
                    System.out.println(temp_post.getTitle() + " " + temp_post.getAuthor().getEmail());
                    break;
            }

        }
    }
}

//엔티티
class Author{
    private Long id;
    private String name;
    private String email;
    //    포스트 리스트 변수
    private List<Post> posts;
    static Long static_id = 0L;
    Author(String name, String email){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.posts = new ArrayList<>();
    }
    void addPost(Post post){
        this.posts.add(post);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
class Post{
    private Long id;
    private String title;
    private String contents;
    private Author author;
    static Long static_id = 0L;
    Post(String title, String contents, Author author){
        static_id += 1;
        this.author = author;
//        this.author.addPost(this);
        this.id = static_id;
        this.title = title;
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getPostInfo(){
        return this.author.getEmail() + this.title + this.contents;
    }
    public Author getAuthor() {
        return this.author;
    }
}


