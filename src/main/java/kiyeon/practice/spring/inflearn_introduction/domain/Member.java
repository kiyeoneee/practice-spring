package kiyeon.practice.spring.inflearn_introduction.domain;

public class Member {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public Member setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Member setName(String name) {
        this.name = name;
        return this;
    }
}
