package me.hao0.wechat.model.card;

/**
 * 支持开发者拉出指定状态的卡券列表
 * @author zJun
 * @date 2018年7月30日 上午9:48:43
 */
public enum CardStatus {
	
	/** 待审核  */
	CARD_STATUS_NOT_VERIFY,
	/** 审核失败 */
	CARD_STATUS_VERIFY_FAIL,
	/** 通过审核 */
	CARD_STATUS_VERIFY_OK,
	/** 卡券被商户删除 */
	CARD_STATUS_DELETE,
	/** 在公众平台投放过的卡券 */
	CARD_STATUS_DISPATCH
}
