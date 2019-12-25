package com.ysp.vlog.enity;

public class Result {
    private boolean isok;

    public Result(boolean isok, String result) {
        this.isok = isok;
        this.result = result;
    }

    private String result;


    public boolean isIsok() {
        return isok;
    }

    public void setIsok(boolean isok) {
        this.isok = isok;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
