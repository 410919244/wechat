package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * （卡券基础信息）字段-必填字段
 *
 * @author zJun
 * @date 2017年12月8日 下午4:52:40
 */
@Data
public class BaseInfo {

    /**
     * 卡券的商户logo，建议像素为300*300。
     */
    private String logo_url;
    /**
     * 码型：
     * CODE_TYPE_TEXT:文本
     * CODE_TYPE_BARCODE:一维码
     * CODE_TYPE_QRCODE:二维码
     * CODE_TYPE_ONLY_QRCODE:二维码无code显示
     * CODE_TYPE_ONLY_BARCODE:一维码无code显示
     * CODE_TYPE_NONE:不显示code和条形码类型
     **/
    private String code_type;
    
    /**
     * (会员卡字段)支付功能结构体，swipe_card结构 （结构复杂不想吐槽）
     */
    private PayInfo pay_info;
    
    /**
     * 商户名字,字数上限为12个汉字。
     */
    private String brand_name;
    /**
     * 卡券名，字数上限为9个汉字。(建议涵盖卡券属性、服务及金额)。
     */
    private String title;
    /**
     * 券颜色。按色彩规范标注填写Color010-Color100。
     */
    private String color;
    /**
     * 卡券使用提醒，字数上限为16个汉字。
     */
    private String notice;
    /**
     * 卡券使用说明，字数上限为1024个汉字。
     */
    private String description;
    /**
     * 商品信息。
     */
    private Sku sku;
    /**
     * 使用日期，有效期的信息。
     */
    private DateInfo date_info;

    /**
     * 以下非必填字段
     */
    private Boolean use_custom_code;
    private String get_custom_code_mode;
    private Boolean bind_openid;
    private String service_phone;
    private String[] location_id_list;
    private Boolean use_all_locations;
    private String center_title;
    private String center_sub_title;
    private String center_url;
    private String center_app_brand_user_name;
    private String center_app_brand_pass;
    private String custom_url_name;
    private String custom_url;
    private String custom_url_sub_title;
    private String custom_app_brand_user_name;
    private String custom_app_brand_pass;
    private String promotion_url_name;
    private String promotion_url;
    private String promotion_url_sub_title;
    private String promotion_app_brand_user_name;
    private String promotion_app_brand_pass;
    private Integer get_limit;
    private Integer use_limit;
    private Boolean can_share;
    private Boolean can_give_friend;
    
    /**
     * (会员卡字段)填写true为用户点击进入会员卡时推送事件，默认为false。详情见 进入会员卡事件推送 
     */
    private Boolean need_push_on_view;

    @Data
    public static class Sku {
        /**
         * 卡券库存的数量，上限为100000000。
         */
        private Integer quantity;
    }

    @Data
    public static class DateInfo {

        /**
         * DATE_TYPE_FIX_TIME_RANGE:表示固定日期区间、DATE_TYPE_FIX_TERM:表示固定时长（自领取后按天算。
         */
        private String type;

        /**
         * type为DATE_TYPE_FIX_TIME_RANGE时专用，表示起用时间。
         */
        private Long begin_timestamp;

        /**
         * type共用字段：结束时间
         */
        private Long end_timestamp;

        /**
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天内有效，不支持填写0。
         */
        private Long fixed_term;

        /**
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天开始生效，领取后当天生效填写0。（单位为天）
         */
        private Long fixed_begin_term;

    }
    
    @Data
    public static class SwipeCard {
    	/**
    	 * 是否设置该会员卡支持拉出微信支付刷卡界面
    	 */
    	private Boolean is_swipe_card;
    }
    
    @Data
    public static class PayInfo {
    	/**
    	 * 支付功能结构体，swipe_card结构（微信脑子不好，文档不确定is_pay_and_qrcode是否在SwipeCard内）
    	 */
    	private SwipeCard swipe_card;
    	/**
    	 * 是否设置该会员卡中部的按钮同时支持微信支付刷卡和会员卡二维码
    	 */
    	private Boolean is_pay_and_qrcode;
    }
}
