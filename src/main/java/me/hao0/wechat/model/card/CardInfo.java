package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 卡券
 *
 * @author zJun
 * @date 2017年12月8日 下午4:19:36
 */
@Data
public class CardInfo {
	
	/** 更改卡券信息接口参数 */
	private String card_id;

    /**
     * CASH:代金券类型、 DISCOUNT:折扣券类型、GIFT:兑换券类型
     */
    private CardType card_type;

    /**
     * 代金券
     */
    private Cash cash;

    /**
     * 折扣券
     */
    private Discount discount;

    /**
     * 兑换券
     */
    private Gift gift;
    
    /**
     * 会员卡
     */
    private Member member_card;

}
