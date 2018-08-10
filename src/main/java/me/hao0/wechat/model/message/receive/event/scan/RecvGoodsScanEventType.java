package me.hao0.wechat.model.message.receive.event.scan;


import java.util.Objects;

/**
 * 微信扫一扫事件类型
 *
 * @author Shinez.
 */
public enum RecvGoodsScanEventType {


    UNKNOW("unknown", "未知事件"),

    /**
     * 打开商品主页事件推送
     */
    USER_SCAN_PRODUCT("user_scan_product", "当用户打开商品主页，无论是通过扫码，还是从其他场景（会话、收藏或朋友圈）打开，微信均会推送该事件到商户填写的URL。推送的内容包括用户基本信息，以及商品主页对应的码信息。"),

    /**
     * 进入公众号事件推送
     */
    USER_SCAN_PRODUCT_ENTER_SESSION("user_scan_product_enter_session", "当用户从商品主页进入公众号会话时，微信会推送该事件到商户填写的URL。推送的内容包括用户的基本信息、时间、关注场景及对应的条码信息。"),

    /**
     * 地理位置信息异步推送
     */
    USER_SCAN_PRODUCT_ASYNC("user_scan_product_async", "当用户打开商品主页，微信会将该用户实时的地理位置信息以异步事件的形式推送到商户填写的URL。商户可利用该信息做数据分析，形成差异化运营方案或指导生产。推送的地理位置信息为“省”一级，如广东省。由于用户的网速影响，异步推送的响应速度可能较慢。"),

    /**
     * 商品审核结果推送
     */
    USER_SCAN_PRODUCT_VERIFY_ACTION("user_scan_product_verify_action", "提交审核的商品，完成审核后，微信会将审核结果以事件的形式推送到商户填写的URL。"),;


    private String value;

    private String desc;


    RecvGoodsScanEventType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static RecvGoodsScanEventType from(String type) {
        for (RecvGoodsScanEventType t : RecvGoodsScanEventType.values()) {
            if (Objects.equals(t.value(), type)) {
                return t;
            }
        }

        return UNKNOW;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "RecvGoodsScanEventType{" +
                "value='" + value + '\'' +
                ", desc='" + desc + '\'' +
                "} " + super.toString();
    }
}
