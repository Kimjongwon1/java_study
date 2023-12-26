package C17ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepo authorRepo;
    AuthorService(){
        authorRepo = new AuthorRepo();
    }
    void register(Author author) throws IllegalArgumentException {
//        만약에 password가 5자리이하면 예외발생(IllegalArgu)
        authorRepo.register(author);
    };
    Optional<Author> login(String email, String password) throws NoSuchElementException, IllegalArgumentException {
//        email이 존재하지않으면 예외발생(NosuchElementExcep)
        List<Author> authorList = authorRepo.getAuthors();
        boolean isEmail = false;
        boolean isPasswordCorrect = false;
        Optional<Author> author = Optional.empty();
        for(Author a : authorList){
            if(a.getEmail().equals(email)){
                isEmail = true;
                if(a.getPassword().equals(password)){
                    isPasswordCorrect = true;
                    author = Optional.of(a);
                }
            }
        }
        if(isEmail==false){
            throw new NoSuchElementException("회원이 존재하지 않습니다.");
        }
        if(isPasswordCorrect==false){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        return author;
    }
}
