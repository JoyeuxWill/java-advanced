package com.soft1841.list;

public class NBAStar {
    public String name;
    public String nickname;
    public Double point;
    public Double rebound;
    public Double assist;

    @Override
    public String toString() {
        return "NBAStar{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", point=" + point +
                ", rebound=" + rebound +
                ", assist=" + assist +
                '}';
    }

    public NBAStar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Double getRebound() {
        return rebound;
    }

    public void setRebound(Double rebound) {
        this.rebound = rebound;
    }

    public Double getAssist() {
        return assist;
    }

    public void setAssist(Double assist) {
        this.assist = assist;
    }

    public NBAStar(String name, String nickname, Double point, Double rebound, Double assist) {
        this.name = name;
        this.nickname = nickname;
        this.point = point;
        this.rebound = rebound;
        this.assist = assist;
    }
}
