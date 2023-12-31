package C17ExceptionFileParsing.AuthorException;

class Author {
    private Long id;
    private String password;
    private String name;
    private String email;
    static Long static_id = 0L;

    public Author(String name, String email, String password) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }
}