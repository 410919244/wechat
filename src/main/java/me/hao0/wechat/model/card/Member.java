package me.hao0.wechat.model.card;

import lombok.Data;

@Data
public class Member {
	
	/**
     * （卡券基础信息）字段-必填字段
     */
    private BaseInfo base_info;

    /**
     * （卡券高级信息）字段
     */
    private AdvancedInfo advanced_info;

	
	/**
	 * 商家自定义会员卡背景图，须 先调用 上传图片接口 将背景图上传至CDN，
	 * 否则报错， 卡面设计请遵循 微信会员卡自定义背景设计规范 ,像素大小控制在 1000像素*600像素以下
	 */
	private String background_pic_url;
	
	/**
	 * 会员卡特权说明,限制1024汉字。
	 */
	private String prerogative;
	
	/**
	 * 设置为true时用户领取会员卡后系统自动将其激活，无需调用激活接口，详情见 自动激活 。
	 */
	private Boolean auto_activate;
	
	/**
	 * 设置为true时会员卡支持一键开卡，不允许同时传入activate_url字段，
	 * 否则设置wx_activate失效。填入该字段后仍需调用接口设置开卡项方可生效，详情见 一键开卡 。
	 */
	private Boolean wx_activate;
	
	/**
	 * 显示积分，填写true或false，如填写true，积分相关字段均为必 填 若设置为true则后续不可以被关闭。
	 */
	private Boolean supply_bonus;
	
	/**
	 * 设置跳转外链查看积分详情。仅适用于积分无法通过激活接口同步的情况下使用该字段。
	 */
	private String bonus_url;
	
	/**
	 * 是否支持储值，填写true或false。
	 * 如填写true，储值相关字段均为必 填 若设置为true则后续不可以被关闭。
	 * 该字段须开通储值功能后方可使用， 详情见： 获取特殊权限
	 */
	private Boolean supply_balance;
	
	/**
	 * 设置跳转外链查看余额详情。仅适用于余额无法通过激活接口同步的情况下使用该字段。
	 */
	private String balance_url;
	
	/**
	 * 自定义会员信息类目，会员卡激活后显示,包含name_type (name) 和url字段
	 */
	private CustomField custom_field1;
	private CustomField custom_field2;
	private CustomField custom_field3;
	
	/**
	 * 积分清零规则。
	 */
	private String bonus_cleared;
	
	/**
	 * 积分规则。
	 */
	private String bonus_rules;
	
	/**
	 * 储值说明。
	 */
	private String balance_rules;
	
	/**
	 * 激活会员卡的url。
	 */
	private String activate_url;
	
	/**
	 * 激活会原卡url对应的小程序user_name，仅可跳转该公众号绑定的小程序
	 */
	private String activate_app_brand_user_name;
	
	/**
	 * 激活会原卡url对应的小程序path
	 */
	private String activate_app_brand_pass;
	
	/**
	 * 自定义会员信息类目，会员卡激活后显示。
	 */
	private CustomCell custom_cell1;
	
	/**
	 * 积分规则 。
	 */
	private BonusRule bonus_rule;
	
	/**
	 * 折扣，该会员卡享受的折扣优惠,填10就是九折。
	 */
	private Integer discount;
	
	@Data
	public static class BonusRule {
		/**
		 * 消费金额。以分为单位。
		 */
		private Integer cost_money_unit;
		/**
		 * 对应增加的积分。
		 */
		private Integer increase_bonus;
		/**
		 * 用户单次可获取的积分上限。
		 */
		private Integer max_increase_bonus;
		/**
		 * 初始设置积分
		 */
		private Integer init_increase_bonus;
		/**
		 * 每使用5积分。
		 */
		private Integer cost_bonus_unit;
		/**
		 * 抵扣xx元，（这里以分为单位）
		 */
		private Integer reduce_money;
		/**
		 * 抵扣条件，满xx元（这里以分为单位）可用。
		 */
		private Integer least_moneytouse_bonus;
		/**
		 * 抵扣条件，单笔最多使用xx积分
		 */
		private Integer max_reduce_bonus;
	}
	
	@Data
	public static class CustomCell{
		/**
		 * 入口名称。
		 */
		private String name;
		
		/**
		 * 入口右侧提示语，6个汉字内。
		 */
		private String tips;
		/**
		 * 入口跳转链接。
		 */
		private String url;
	}
	
	@Data
	public static class CustomField {
		/**
		 * 会员信息类目半自定义名称，当开发者变更这类类目信息的value值时 可以选择触发系统模板消息通知用户。 
		 * FIELD_NAME_TYPE_LEVEL 等级 
		 * FIELD_NAME_TYPE_COUPON 优惠券 
		 * FIELD_NAME_TYPE_STAMP 印花 
		 * FIELD_NAME_TYPE_DISCOUNT 折扣 
		 * FIELD_NAME_TYPE_ACHIEVEMEN 成就 
		 * FIELD_NAME_TYPE_MILEAGE 里程 
		 * FIELD_NAME_TYPE_SET_POINTS 集点 
		 * FIELD_NAME_TYPE_TIMS 次数
		 */
		private String name_type;
		/**
		 * 会员信息类目自定义名称，当开发者变更这类类目信息的value值时 不会触发系统模板消息通知用户
		 */
		private String name;
		/**
		 * 点击类目跳转外链url
		 */
		private String url;
	}
}
