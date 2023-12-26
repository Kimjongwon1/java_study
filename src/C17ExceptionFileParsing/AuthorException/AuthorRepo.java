package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

class AuthorRepo{
    List<Author> authors;
    AuthorRepo(){
       authors = new ArrayList<>();
    }
    void register(Author author){
        authors.add(author);
    }
    List<Author> getAuthors(){
        return authors;
    }

}
