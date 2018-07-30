package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 卡券
 * @author zJun
 * @date 2018年7月26日 下午5:26:46
 */
@Data
public class Card {

    private CardInfo card;

    /**
     * 更新卡券基础信息
     * @param base_info
     * @author zJun
     * @date 2017年12月18日 下午5:57:07
     */
	public void updateBaseInfo(BaseInfo base_info) {
		switch (card.getCard_type()) {
		case CASH:
			card.getCash().setBase_info(base_info);
			break;
		case DISCOUNT:
			card.getDiscount().setBase_info(base_info);
			break;
		case GIFT:
			card.getGift().setBase_info(base_info);
			break;
		case MEMBER_CARD:
			card.getMember_card().setBase_info(base_info);
			break;
		default:
			throw new RuntimeException("类型错误");
		}
	}

    /**
     * 获得卡券基础信息
     * @author zJun
     * @date 2017年12月18日 下午6:01:32
     */
	public BaseInfo returnBaseInfo() {
		switch (card.getCard_type()) {
		case CASH:
			return card.getCash().getBase_info();
		case DISCOUNT:
			return card.getDiscount().getBase_info();
		case GIFT:
			return card.getGift().getBase_info();
		case MEMBER_CARD:
			return card.getMember_card().getBase_info();
		default:
			throw new RuntimeException("类型错误");
		}
	}
}
