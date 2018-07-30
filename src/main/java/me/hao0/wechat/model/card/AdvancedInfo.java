package me.hao0.wechat.model.card;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * （卡券高级信息）字段
 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1451025056
 *
 * @author zJun
 * @date 2017年12月11日 下午2:30:45
 */
@Data
public class AdvancedInfo {

    /**
     * 使用门槛（条件）字段，若不填写使用条件则在券面拼写：
     * 无最低消费限制，全场通用，不限品类；
     * 并在使用说明显示：可与其他优惠共享
     **/
    private UseCondition use_condition;

    /**
     * 封面摘要结构体名称
     */
    @JsonProperty("abstract")
    private Abstract _abstract;

    /**
     * 商家服务类型：
     * BIZ_SERVICE_DELIVER 外卖服务；
     * BIZ_SERVICE_FREE_PARK 停车位；
     * BIZ_SERVICE_WITH_PET 可带宠物；
     * BIZ_SERVICE_FREE_WIFI 免费wifi， 可多选
     */
    private String[] business_service;

    /**
     * 图文列表，显示在详情内页，优惠券券开发者须至少传入一组图文列表
     */
    private TextImageList[] text_image_list;

    /**
     * 使用时段限制
     */
    private TimeLimit[] time_limit;

    @Data
    public static class TimeLimit {
        /**
         * 限制类型枚举值：支持填入
         * MONDAY 周一
         * TUESDAY 周二
         * WEDNESDAY 周三
         * THURSDAY 周四
         * FRIDAY 周五
         * SATURDAY 周六
         * SUNDAY 周日
         * 此处只控制显示，不控制实际使用逻辑，不填默认不显示
         */
        private String type;

        /**
         * 当前type类型下的起始时间（小时），如当前结构体内填写了MONDAY，此处填写了10，则此处表示周一 10:00可用
         */
        private Integer begin_hour;
        /**
         * 当前type类型下的起始时间（分钟），如当前结构体内填写了MONDAY，begin_hour填写10，此处填写了59，则此处表示周一 10:59可用
         */
        private Integer begin_minute;
        private Integer end_hour;
        private Integer end_minute;
    }

    @Data
    public static class TextImageList {
        private String image_url;
        private String text;
    }

    @Data
    public static class Abstract {
        @JsonProperty("abstract")
        private String _abstract;
        private String[] icon_url_list;
    }

    @Data
    public static class UseCondition {
        private String accept_category;
        private String reject_category;
        private Integer least_cost;
        private String object_use_for;
        private Boolean can_use_with_other_discount;
    }

}
