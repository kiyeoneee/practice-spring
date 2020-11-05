package kiyeon.practice.spring.inflearn.resourcevalidation.validationabstract;

public class Event {
    Integer id;

//    이건 자바 버전 때문인가? 왜 import가 안될까ㅠㅠ
//    @NotEmpty
    String title;

//    @Size(min = 0)
    Integer limit;

//    @Email
    String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
