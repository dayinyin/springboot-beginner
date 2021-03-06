package pers.huangyuhui.memo.bean;

/**
 * @project: memo
 * @description: 好友信息
 * @author: 黄宇辉
 * @date: 6/28/2019-9:40 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Friend {

    private Integer id;
    private String name;
    private char gender;
    private String qq;
    private String email;
    private String telephone;
    private String address;
    private String portrait_path;//头像路径

    public Friend(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPortrait_path() {
        return portrait_path;
    }

    public void setPortrait_path(String portrait_path) {
        this.portrait_path = portrait_path;
    }
}