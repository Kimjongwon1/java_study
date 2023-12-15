//package C12ClassLecture;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AuthorPostService {
//    public static void main(String[] args) {
//        List<Author> authors = new ArrayList<>();
//        List<Post> posts = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("1. 회원가입 / 2. 게시글 작성 / 3. 회원상세조회 / 4. 게시글 상세조회 / 5. 종료");
//            String input = sc.nextLine();
//
//            switch (input) {
//                case "1":
//                    System.out.println("회원가입 할 이름을 입력하시오");
//                    String name = sc.nextLine();
//                    System.out.println("회원가입 할 이메일을 입력하시오");
//                    String email = sc.nextLine();
//                    System.out.println("회원가입 할 패스워드를 입력하시오");
//                    String password = sc.nextLine();
//                    Author myAuthor1 = new Author(name, email, password);
//                    authors.add(myAuthor1);
//                    System.out.println("가입완료");
//                    break;
//
//                case "2":
//                    if (authors.isEmpty()) {
//                        System.out.println("먼저 회원가입을 진행해주세요.");
//                        break;
//                    }
//                    System.out.println("가입된 회원 목록:");
//                    for (int i = 0; i < authors.size(); i++) {
//                        System.out.println(i + 1 + ". " + authors.get(i).getName());
//                    }
//                    System.out.println("작성할 회원 선택(번호 입력):");
//                    int authorIndex = Integer.parseInt(sc.nextLine()) - 1;
//
//                    System.out.println("제목을 작성해주세요");
//                    String title = sc.nextLine();
//                    System.out.println("내용을 작성해주세요");
//                    String contents = sc.nextLine();
//                    Post post1 = new Post(title, contents, authors.get(authorIndex).getId());
//                    posts.add(post1);
//                    System.out.println("제목 : " + post1.getTitle() + " 내용 : " + post1.getContents()
//                            + " 작성자 id " + post1.getAuthor_id());
//                    break;
//
//                case "3":
//                    System.out.println("회원상세정보 조회");
//                    System.out.println("회원명을 입력하세요:");
//                    String authorName = sc.nextLine();
//                    int count = 0;
//                    for (Author author : authors) {
//                        if (author.getName().equalsIgnoreCase(authorName)) {
//                            System.out.println("작성자 명 : " + author.getName() + " 작성자 메일 : " + author.getEmail());
//                            for (Post post : posts) {
//                                if (post.getAuthor_id().equals(author.getId())) {
//                                    count++;
//                                }
//                            }
//                            System.out.println("작성 글 수 : " + count);
//                            break;
//                        }
//                    }
//                    if (count == 0) {
//                        System.out.println("해당 회원이 존재하지 않거나 작성한 글이 없습니다.");
//                    }
//                    break;
//
//                case "4":
//                    System.out.println("게시글 상세조회");
//                    System.out.println("제목을 입력하세요:");
//                    String postTitle = sc.nextLine();
//                    for (Post post : posts) {
//                        if (post.getTitle().equalsIgnoreCase(postTitle)) {
//                            Author author = null;
//                            for (Author a : authors) {
//                                if (a.getId().equals(post.getAuthor_id())) {
//                                    author = a;
//                                    break;
//                                }
//                            }
//                            if (author != null) {
//                                System.out.println("글 제목 : " + post.getTitle() + " 작성자 이메일 : " + author.getEmail());
//                            }
//                            break;
//                        }
//                    }
//                    break;
//
//                case "5":
//                    System.out.println("종료합니다.");
//                    sc.close();
//                    return;
//
//                default:
//                    System.out.println("올바른 입력이 아닙니다.");
//                    break;
//            }
//        }
//    }
//}
//
//class Author {
//    private Long id;
//    private String password;
//    private String name;
//    private String email;
//    static Long static_id = 0L;
//
//    public Author(String name, String email, String password) {
//        static_id += 1;
//        this.id = static_id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//    }
//
//    public Long getId() {
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
//
//    public String getPassword() {
//        return password;
//    }
//}
//
//class Post {
//    private Long id;
//    private String title;
//    private String contents;
//    private Long author_id;
//
//    static Long static_id = 0L;
//
//    public Post(String title, String contents, Long author_id) {
//        static_id += 1;
//        this.id = static_id;
//        this.title = title;
//        this.contents = contents;
//        this.author_id = author_id;
//    }
//
//    public Long getId() {
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
//    public Long getAuthor_id() {
//        return author_id;
//    }
//}
//
