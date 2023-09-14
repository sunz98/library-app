package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // Integer는 null 값을 가질 수 있어서
    // 필수가 아닐 경우 쓰기 좋음.

    public UserCreateRequest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
