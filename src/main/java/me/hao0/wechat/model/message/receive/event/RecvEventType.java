package me.hao0.wechat.model.message.receive.event;

import java.util.Objects;


/**
 * 接收微信服务器的消息类型
 * @author Shinez.
 */
public enum RecvEventType {

    /**
     * 未知事件
     */
    UNKNOW("unknown", "未知事件"),

    /**
     * 关注公众号
     */
    SUBSCRIBE("subscribe", "关注公众号"),

    /**
     * 取消关注公众号
     */
    UN_SUBSCRIBE("unsubscribe", "取消关注公众号"),
    /**
     * 1. 用户未关注时，进行关注后的事件推送:
     */
    SCAN("SCAN", "扫码"),
    LOCATION("LOCATION", "上报地理位置信息"),

    /**
     * 模版消息发送结果通知事件
     */
    TEMPLATE_SEND_JOB_FINISH("TEMPLATESENDJOBFINISH", "模版消息发送任务完成后, 微信服务器会将是否送达成功作为通知"),

    /**
     * 连网后下发消息
     */
    WIFI_CONNECTED("WifiConnected", "连网后下发消息"),

    /**
     * 生成的卡券通过审核时
     */
    CARD_PASS_CHECK("card_pass_check", "卡券通过审核"),

    /**
     * 卡券未通过审核事件
     */
    CARD_NOT_PASS_CHECK("card_not_pass_check", "卡券未通过审核"),

    /**
     * 用户在领取卡券时
     */
    USER_GET_CARD("user_get_card", " 领取事件推送"),

    /**
     * 用户在转赠卡券时
     */
    USER_GIFTING_CARD("user_gifting_card", "转赠事件推送"),

    /**
     * 用户在删除卡券时
     */
    USER_DEL_CARD("user_del_card", "删除事件推送"),

    /**
     * 卡券被核销时
     */
    USER_CONSUME_CARD("user_consume_card", "核销事件推送"),

    /**
     * 微信买单完成时
     */
    USER_PAY_FROM_PAY_CELL("user_pay_from_pay_cell", "买单事件推送"),

    /**
     * 用户在进入会员卡时，微信会把这个事件推送到开发者填写的URL。
     * 需要开发者在创建会员卡时填入need_push_on_view	字段并设置为true。
     * 开发者须综合考虑领卡人数和服务器压力，决定是否接收该事件
     */
    USER_VIEW_CARD("user_view_card", "进入会员卡事件推送"),
    /**
     * 用户在卡券里点击查看公众号进入会话时（需要用户已经关注公众号），微信会把这个事件推送到开发者填写的URL。
     * 开发者可识别从卡券进入公众号的用户身份。
     */
    USER_ENTER_SESSION_FROM_CARD("user_enter_session_from_card", "从卡券进入公众号会话事件推送"),

    /**
     * 当用户的会员卡积分余额发生变动时，微信会推送事件告知开发者。
     */
    UPDATE_MEMBER_CARD("update_member_card", "会员卡内容更新事件"),

    /**
     * 当某个card_id的初始库存数大于200且当前库存小于等于100时，
     * 用户尝试领券会触发发送事件给商户，事件每隔12h发送一次。
     */
    CARD_SKU_REMIND("card_sku_remind", "库存报警事件"),

    /**
     * 当商户朋友的券券点发生变动时，微信服务器会推送消息给商户服务器。
     */
    CARD_PAY_ORDER("card_pay_order", "券点流水详情事件"),

    /**
     * 当用户通过一键激活的方式提交信息并点击激活或者用户修改会员卡信息后，商户会收到用户激活的事件推送
     */
    SUBMIT_MEMBER_CARD_USER_INFO("submit_membercard_user_info", "会员卡激活事件推送"),


    /**
     * 点击菜单拉取消息时的事件推送
     */
    MENU_CLICK("CLICK", "点击菜单拉取消息时的事件推送"),

    /**
     * 点击菜单跳转链接时的事件推送
     */
    MENU_VIEW("VIEW", "点击菜单跳转链接时的事件推送"),

    /**
     * 扫码推事件的事件推送
     */
    SCANCODE_PUSH("scancode_push", " 扫码推事件的事件推送"),

    /**
     * 扫码推事件且弹出“消息接收中”提示框的事件推送
     */
    SCANCODE_WAITMSG("scancode_waitmsg", "扫码推事件且弹出“消息接收中”提示框的事件推送"),

    /**
     * 弹出系统拍照发图的事件推送
     */
    PIC_SYSPHOTO("pic_sysphoto", "弹出系统拍照发图的事件推送"),

    /**
     * 弹出拍照或者相册发图的事件推送
     */
    PIC_PHOTO_OR_ALBUM("pic_photo_or_album", "弹出拍照或者相册发图的事件推送"),

    /**
     * 弹出微信相册发图器的事件推送
     */
    PIC_WEIXIN("pic_weixin", "弹出微信相册发图器的事件推送"),

    /**
     * 弹出地理位置选择器的事件推送
     */
    LOCATION_SELECT("location_select", "弹出地理位置选择器的事件推送"),


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
    USER_SCAN_PRODUCT_VERIFY_ACTION("user_scan_product_verify_action", "提交审核的商品，完成审核后，微信会将审核结果以事件的形式推送到商户填写的URL。"),

    /**
     * 门店审核事件
     */
    POI_CHECK_NOTIFY("poi_check_notify", "新创建的门店在审核通过后，会以事件形式推送给商户填写的回调URL");


    private String value;

    private String desc;

    RecvEventType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static RecvEventType from(String type) {
        for (RecvEventType t : RecvEventType.values()) {
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
        return "RecvEventType{" +
                "value='" + value + '\'' +
                ", desc='" + desc + '\'' +
                "} " + super.toString();
    }
}
