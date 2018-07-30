package me.hao0.wechat.model.card.qrcode;

import lombok.Data;

/**
 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1451025062
 * 卡券二维码
 *
 * @author zJun
 * @date 2017年12月14日 上午10:25:20
 */
@Data
public class Qrcode {

    private String action_name;
    /**
     * 指定二维码的有效时间，范围是60 ~ 1800秒。不填默认为365天有效
     */
    private Integer expire_seconds;

    private ActionInfo action_info;

    @Data
    public static class ActionInfo {
        private QCard card;
        private QCard[] card_list;
    }

    @Data
    public static class QCard {
        private String card_id;
        /**
         * 卡券Code码,use_custom_code字段为true的卡券必须填写，非自定义code和导入code模式的卡券不必填写。
         */
        private String code;
        /**
         * 指定领取者的openid，只有该用户能领取。
         * bind_openid字段为true的卡券必须填写，非指定openid不必填写。
         */
        private String openid;
        /**
         * 指定下发二维码，生成的二维码随机分配一个code，领取后不可再次扫描。填写true或false。
         * 默认false，注意填写该字段时，卡券须通过审核且库存不为0。
         */
        private Boolean is_unique_code;
        /**
         * 领取场景值，用于领取渠道的数据统计，默认值为0，字段类型为整型，长度限制为60位数字。
         * 用户领取卡券后触发的 事件推送 中会带上此自定义场景值。
         */
        private Integer outer_id;
        /**
         * outer_id字段升级版本，字符串类型，用户首次领卡时，会通过 领取事件推送 给商户；
         * 对于会员卡的二维码，用户每次扫码打开会员卡后点击任何url，会将该值拼入url中，方便开发者定位扫码来源
         */
        private String outer_str;
    }
}
