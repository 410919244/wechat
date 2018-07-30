package me.hao0.wechat.model.card;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.hao0.wechat.model.base.WechatResponse;

@Data
@EqualsAndHashCode(callSuper=true)
public class UpdateUserResponse extends WechatResponse {
	/**
	 * 当前用户积分总额
	 */
	private Integer result_bonus;
	/**
	 * 当前用户预存总金额
	 */
	private Integer result_balance;
	/**
	 * 用户openid
	 */
	private String openid;
}
