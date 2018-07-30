package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 测试白名单 消息实体
 * @author zJun
 * @date 2018年1月22日 下午6:00:24
 */
@Data
public class TestWhiteListDTO {
	/** openId */
	private String[] openid;
	/** openId */
	private String[] username;
}
