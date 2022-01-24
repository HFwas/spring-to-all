package com.example.gatewaydemooo.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author HFwas
 * @Date 2022/1/20 15:25
 */
@Data
public class ResultVO<T> {
    private boolean success;
    private int responseCD;
    private String responseMsg;
    private List<T> data;
    private String totalCount;
    private boolean showVideo1;
    private boolean showVideo2;
    private boolean showRel;

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean getSuccess() {
        return this.success;
    }
    public void setResponseCD(int responseCD) {
        this.responseCD = responseCD;
    }
    public int getResponseCD() {
        return this.responseCD;
    }
    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
    public String getResponseMsg() {
        return this.responseMsg;
    }
    public void setData(List<T> data) {
        this.data = data;
    }
    public List<T> getData() {
        return this.data;
    }
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
    public String getTotalCount() {
        return this.totalCount;
    }
    public void setShowVideo1(boolean showVideo1) {
        this.showVideo1 = showVideo1;
    }
    public boolean getShowVideo1() {
        return this.showVideo1;
    }
    public void setShowVideo2(boolean showVideo2) {
        this.showVideo2 = showVideo2;
    }
    public boolean getShowVideo2() {
        return this.showVideo2;
    }
    public void setShowRel(boolean showRel) {
        this.showRel = showRel;
    }
    public boolean getShowRel() {
        return this.showRel;
    }
}
