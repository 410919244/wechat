package me.hao0.wechat.model.data.user;

import com.google.common.base.Objects;

/**
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 20/11/15
 */
public enum UserSource {

    /**
     * 其他: 包括带参数二维码
     */
    OTHER(0),

    /**
     * 代表搜号码（即微信添加朋友页的搜索）
     */
    SEARCH_NUMBER(1),
    
    /**
     * 名片分享
     */
    CARD(17),
    
    /**
     * 扫二维码
     */
    SCAN(30),

    /**
     * 图文页右上角菜单
     */
    MENU(43),

    /**
     * 支付后关注
     */
	PAY(51),
	
	/**
	 * 图文内
	 */
	MENU_NEI(57),
	
	/**
	 * 公众号广告
	 */
	GUANG_GAO(75),
	
	/**
	 * 朋友圈广告
	 */
	FRIEND_GUANG_GAO(78);
	
    private Integer value;

    private UserSource(Integer scope){
        this.value = scope;
    }

    public Integer value(){
        return value;
    }

    public static UserSource from(Integer s){
        for (UserSource source : UserSource.values()){
            if (Objects.equal(source.value(), s)){
                return source;
            }
        }
        throw new IllegalArgumentException("非法的用户渠道: " + s);
    }
}
