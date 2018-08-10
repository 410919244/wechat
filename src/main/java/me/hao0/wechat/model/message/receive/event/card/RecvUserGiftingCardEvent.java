package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 转赠事件推送
 * 用户在转赠卡券时，微信会把这个事件推送到开发者填写的URL
 *
 * @author Shinez.
 */
public class RecvUserGiftingCardEvent extends RecvEvent {
    private static final long serialVersionUID = -57254023737174302L;
    /**
     * 卡券ID
     */
    private String cardId;
    /**
     * 接收卡券用户的openid
     */
    private String friendUserName;
    /**
     * code序列号
     */
    private String userCardCode;
    /**
     * 是否转赠退回，0代表不是，1代表是
     */
    private Boolean isReturnBack;
    /**
     * 是否是群转赠
     */
    private Boolean isChatRoom;

    protected RecvUserGiftingCardEvent() {

    }

    public RecvUserGiftingCardEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    public Boolean getReturnBack() {
        return isReturnBack;
    }

    public void setReturnBack(Boolean returnBack) {
        isReturnBack = returnBack;
    }

    public Boolean getChatRoom() {
        return isChatRoom;
    }

    public void setChatRoom(Boolean chatRoom) {
        isChatRoom = chatRoom;
    }

    @Override
    public String getEventType() {
        return RecvEventType.USER_GIFTING_CARD.value();
    }
}
