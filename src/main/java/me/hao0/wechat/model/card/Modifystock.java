package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 修改库存接口
 * @author zJun
 * @date 2018年7月27日 下午1:37:30
 */
@Data
public class Modifystock {

	/** 卡券ID。 */
	private String card_id;
	/** 增加多少库存，支持不填或填0。 */
	private Integer increase_stock_value;
	/** 减少多少库存，可以不填或填0。 */
	private Integer reduce_stock_value;
}
