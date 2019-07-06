package com.travel.pojo;

import java.io.Serializable;

public class Result implements Serializable {

    private String msg;
    private boolean flog;

    public Result(){}

    public Result(boolean flog,String msg){
        this.flog=flog;
        this.msg=msg;
    }






    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isFlog() {
        return flog;
    }

    public void setFlog(boolean flog) {
        this.flog = flog;
    }
}
