package com.icoder.jxhouse.pojo.vo.common;

/**
 * Created by congwangshi on 16/4/24.
 */
public class AjaxDone {
    /**
     * 用于dwz中返回ajaxDone的内容
     *
     * @author 侍从旺
     * */
    // 状态码
    private String statusCode = "200";
    private String message = "success";
    private String navTabId = "";
    private String rel = "";
    private String callbackType = "";
    private String forwardUrl = "";
    private String confirmMsg = "";
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getNavTabId() {
        return navTabId;
    }
    public void setNavTabId(String navTabId) {
        this.navTabId = navTabId;
    }
    public String getRel() {
        return rel;
    }
    public void setRel(String rel) {
        this.rel = rel;
    }
    public String getCallbackType() {
        return callbackType;
    }
    public void setCallbackType(String callbackType) {
        this.callbackType = callbackType;
    }
    public String getForwardUrl() {
        return forwardUrl;
    }
    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }
    public String getConfirmMsg() {
        return confirmMsg;
    }
    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }
}
