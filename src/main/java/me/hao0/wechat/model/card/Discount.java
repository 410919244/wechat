package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 折扣券专用
 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1451025056
 *
 * @author zJun
 * @date 2017年12月11日 下午6:15:13
 */
@Data
public class Discount {

    /**
     * （卡券基础信息）字段-必填字段
     */
    private BaseInfo base_info;

    /**
     * （卡券高级信息）字段
     */
    private AdvancedInfo advanced_info;

    /**
     * 折扣券专用，表示打折额度（百分比）。填30就是七折。
     */
    private Integer discount;


}
