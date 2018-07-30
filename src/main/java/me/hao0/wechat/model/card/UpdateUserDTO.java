package me.hao0.wechat.model.card;

import lombok.Data;

/**
 * 更新会员信息 传输实体
 * @author zJun
 * @date 2018年1月23日 下午2:55:15
 */
@Data
public class UpdateUserDTO {
	/**
	 * 卡券Code码。
	 */
	private String code;
	/**
	 * 卡券ID
	 */
	private String cardId;
	/**
	 * 支持商家激活时针对单个会员卡分配自定义的会员卡背景。
	 */
	private String background_pic_url;
	/**
	 * 需要设置的积分全量值，传入的数值会直接显示
	 */
	private Integer bonus;
	/**
	 * 本次积分变动值，传负数代表减少
	 */
	private Integer add_bonus;
	/**
	 * 商家自定义积分消耗记录，不超过14个汉字
	 */
	private String record_bonus;
	/**
	 * 需要设置的余额全量值，传入的数值会直接显示在卡面
	 */
	private Integer balance;
	/**
	 * 本次余额变动值，传负数代表减少
	 */
	private Integer add_balance;
	/**
	 * 商家自定义金额消耗记录，不超过14个汉字
	 */
	private String record_balance;
	/**
	 * 创建时字段custom_field1定义类型的最新数值，限制为4个汉字，12字节。
	 */
	private String custom_field_value1;
	/**
	 * 创建时字段custom_field2定义类型的最新数值，限制为4个汉字，12字节。
	 */
	private String custom_field_value2;
	/**
	 * 创建时字段custom_field3定义类型的最新数值，限制为4个汉字，12字节。
	 */
	private String custom_field_value3;
	
	private NotifyOptional notify_optional;
	
	@Data
	public static class NotifyOptional {
		/**
		 * 积分变动时是否触发系统模板消息，默认为true
		 */
		private Boolean is_notify_bonus;
		/**
		 * 余额变动时是否触发系统模板消息，默认为true
		 */
		private Boolean is_notify_balance;
		/**
		 * 自定义group1变动时是否触发系统模板消息，默认为false。（2、3同理）
		 */
		private Boolean is_notify_custom_field1;
		private Boolean is_notify_custom_field2;
		private Boolean is_notify_custom_field3;
	}
}
