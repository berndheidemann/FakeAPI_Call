package com.example.fakeapi_call;

public class FakePostDto {
    private Long userId;
    private Long id;
    private String title;
    private String body;

    public FakePostDto() {
    }

    public FakePostDto(Long userId, Long id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "userId: " + this.userId + ", id: " + this.id + ", title: " + this.title + ", body: " + this.body;
    }
}
