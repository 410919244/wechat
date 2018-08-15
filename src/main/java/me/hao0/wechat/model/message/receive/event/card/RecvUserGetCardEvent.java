package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 领取事件推送
 * 用户在领取卡券时，微信会把这个事件推送到开发者填写的URL。
 *
 * @author Shinez.
 */
public class RecvUserGetCardEvent extends RecvEvent {

    private static final long serialVersionUID = 4686201151623932555L;
    /**
     * 卡券ID
     */
    private String cardId;
    /**
     * 是否为转赠领取，1代表是，0代表否
     */
    private Boolean isGiveByFriend;
    /**
     * 发起转赠用户的openid
     * 当IsGiveByFriend为1时填入的字段，表示发起转赠用户的openid
     */
    private String friendUserName;
    /**
     * code序列号
     */
    private String userCardCode;
    /**
     * 转赠前的code
     * 为保证安全，微信会在转赠发生后变更该卡券的code号，该字段表示转赠前的code
     */
    private String oldUserCardCode;
    /**
     * 领取场景值，用于领取渠道数据统计。
     * 可在生成二维码接口及添加Addcard接口中自定义该字段的字符串值。
     */
    private String outerStr;
    /**
     * 场景值
     */
    private Integer outerId;
    /**
     * 用户删除会员卡后可重新找回，当用户本次操作为找回时，该值为1，否则为0
     */
    private Boolean isRestoreMemberCard;
    /**
     * 是否由朋友推荐
     */
    private Boolean isRecommendByFriend;

    /**
     * unionId
     */
    private String unionId;
    
    protected RecvUserGetCardEvent() {

    }

    public RecvUserGetCardEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public Integer getOuterId() {
        return outerId;
    }

    public void setOuterId(Integer outerId) {
        this.outerId = outerId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Boolean getIsGiveByFriend() {
        return this.isGiveByFriend;
    }

    public void setIsGiveByFriend(Boolean IsGiveByFriend) {
        this.isGiveByFriend = IsGiveByFriend;
    }

    public String getFriendUserName() {
        return friendUserName;
    }

    public void setFriendUserName(String friendUserName) {
        this.friendUserName = friendUserName;
    }

    public String getUserCardCode() {
        return userCardCode;
    }

    public void setUserCardCode(String userCardCode) {
        this.userCardCode = userCardCode;
    }

    public String getOldUserCardCode() {
        return oldUserCardCode;
    }

    public void setOldUserCardCode(String oldUserCardCode) {
        this.oldUserCardCode = oldUserCardCode;
    }

    public String getOuterStr() {
        return outerStr;
    }

    public void setOuterStr(String outerStr) {
        this.outerStr = outerStr;
    }

    public Boolean getIsRestoreMemberCard() {
        return this.isRestoreMemberCard;
    }

    public void setIsRestoreMemberCard(Boolean isRestoreMemberCard) {
        this.isRestoreMemberCard = isRestoreMemberCard;
    }

    public Boolean getIsRecommendByFriend() {
        return isRecommendByFriend;
    }

    public void setIsRecommendByFriend(Boolean isRecommendByFriend) {
        this.isRecommendByFriend = isRecommendByFriend;
    }

    @Override
    public String getEventType() {
        return RecvEventType.USER_GET_CARD.value();
    }

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
}
