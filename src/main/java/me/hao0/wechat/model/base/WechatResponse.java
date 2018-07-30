package me.hao0.wechat.model.base;

/**
 *  微信接口返回实体
 * @author Shinez
 * @date 2018/1/20.
 */
public  class WechatResponse {


    /**
     * 成功状态码
     */
    public static final Integer SUCCESS = 0;


    /**
     * 错误码
     */
    private Integer errcode;

    /**
     * 错误消息
     */
    private String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}
