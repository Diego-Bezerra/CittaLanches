package br.com.bezerra.diego.cittalanches.data;

public class User {

    private String nickName;
    private String name;

    public User() {
    }

    public User(String nickName, String name) {
        this.name = name;
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
