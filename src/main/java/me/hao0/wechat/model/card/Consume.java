package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 核销Code接口
 * @author zJun
 * @date 2018年7月27日 上午11:39:52
 */
@Data
public class Consume {
	/** 卡券ID。创建卡券时use_custom_code填写true时必填。非自定义Code不必填写。 */
	private String card_id;
	/** 需核销的Code码。 */
	private String code;
}
