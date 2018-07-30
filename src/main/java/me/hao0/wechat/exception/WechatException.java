package me.hao0.wechat.exception;

import java.util.Map;

import me.hao0.wechat.model.base.WechatResponse;

/**
 * 微信异常，微信服务器返回错误时抛出的异常
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 5/11/15
 * @since 1.0.0
 */
public class WechatException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	/**
     * 微信返回的errcode
     */
    private Integer code;

    public WechatException(Map<String, ?> errMap) {
        super("[" + errMap.get("errcode") + "]" + errMap.get("errmsg"));
        code = (Integer)errMap.get("errcode");
    }

    public WechatException() {
        super();
    }

    public WechatException(String message) {
        super(message);
    }

    public WechatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WechatException(Throwable cause) {
        super(cause);
    }

    protected WechatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Integer getCode() {
        return code;
    }
    
    public static <T extends WechatResponse>  WechatException getInstance(T resp) {
    	String message = ErrorMessage.tips.get(resp.getErrcode());
        if (message != null) {
            return new WechatException(String.format("%s:%s", resp.getErrcode(), message));
        } else {
            return new WechatException(String.format("%s:%s", resp.getErrcode(), resp.getErrmsg()));
        }
    }
    
    /**
     * 返回中文提示异常
     *
     * @param errMap
     * @author zJun
     * @date 2018年1月3日 下午2:04:34
     */
    public static WechatException getInstance(Map<String, ?> errMap) {
        Integer code = (Integer) errMap.get("errcode");
        String message = ErrorMessage.tips.get(code);
        if (message != null) {
            return new WechatException(message);
        } else {
            return new WechatException(errMap);
        }
    }
}
