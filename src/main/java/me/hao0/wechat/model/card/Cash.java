package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 代金券
 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1451025056
 *
 * @author zJun
 * @date 2017年12月8日 下午4:51:11
 */
@Data
public class Cash {

    /**
     * （卡券基础信息）字段-必填字段
     */
    private BaseInfo base_info;

    /**
     * （卡券高级信息）字段
     */
    private AdvancedInfo advanced_info;

    /**
     * 代金券专用，表示起用金额（单位为分）,如果无起用门槛则填0。
     */
    private Integer least_cost;

    /**
     * 代金券专用，表示减免金额。（单位为分）
     */
    private Integer reduce_cost;

}
