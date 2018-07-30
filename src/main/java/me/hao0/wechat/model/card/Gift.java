package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 兑换券
 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1451025056
 *
 * @author zJun
 * @date 2017年12月11日 下午6:16:31
 */
@Data
public class Gift {
    /**
     * （卡券基础信息）字段-必填字段
     */
    private BaseInfo base_info;

    /**
     * （卡券高级信息）字段
     */
    private AdvancedInfo advanced_info;

    /**
     * 兑换券专用，填写兑换内容的名称。
     */
    private String gift;
    

}
