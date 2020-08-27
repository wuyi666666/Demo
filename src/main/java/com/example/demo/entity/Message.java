package com.example.demo.entity;

import java.util.Date;

public class Message {
    private int id;
    private String msg;
    private Date sendTime;

    public int getId() {
        return id;
    }

    public Message setId(int id) {
        this.id = id;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Message setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public Message setSendTime(Date sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
