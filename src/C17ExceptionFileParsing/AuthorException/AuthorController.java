package C17ExceptionFileParsing.AuthorException;
import java.util.*;

    class AuthorController {
        public static void main(String[] args) {
//            메모리 DB에 넣고 있는 데이터 추가/삭제 부분은 repository로 분리
            AuthorService authorService = new AuthorService();
           // List<Author> authors = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1번: 회원가입, 2번: 게시글작성");
                int number = Integer.parseInt(sc.nextLine());
                switch (number) {
                    case 1:
                        System.out.println("회원가입하실 이름을 입력해주세요");
                        String name = sc.nextLine();
                        System.out.println("회원가입하실 이메일을 입력해주세요");
                        String email = sc.nextLine();
                        System.out.println("회원가입하실 비밀번호을 입력해주세요");
                        String password = sc.nextLine();
                        Author author1 = new Author(name, email, password);
                        if(password.length()>4){
                            authorService.register(author1);
                        }else {
                            System.out.println("너무짧습니다");
                        }

                        break;

                    case 2:
                        System.out.println("작성자 email 입력해주세요");
                        String author_email = sc.nextLine();
                        System.out.println("작성자 비밀번호를 입력해주세요");
                        String author_password = sc.nextLine();
                        Optional<Author> loginedAuthor = Optional.empty();
                        try {
                            loginedAuthor = authorService.login(author_email,author_password);
                        }catch (NoSuchElementException e){
                            System.out.println("이메일이 존재하지않습니다.");
                        }catch (IllegalArgumentException e){
                            System.out.println("비밀번호가 틀렸습니다.");
                        }

                        loginedAuthor.ifPresent(author -> System.out.println(author.getName() + "님 환영합니다."));

                        break;
                        // Find the author with the given ID

                }
            }
        }
    }

