package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 删除事件推送
 * 用户在删除卡券时，微信会把这个事件推送到开发者填写的URL
 *
 * @author Shinez.
 */
public class RecvUserDelCardEvent extends RecvEvent {
    private static final long serialVersionUID = -57254023737174302L;
    /**
     * 卡券ID
     */
    private String cardId;
    /**
     * code序列号。自定义code及非自定义code的卡券被领取后都支持事件推送
     */
    private String userCardCode;


    protected RecvUserDelCardEvent() {
    }

    public RecvUserDelCardEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserCardCode() {
        return userCardCode;
    }

    public void setUserCardCode(String userCardCode) {
        this.userCardCode = userCardCode;
    }

    @Override
    public String getEventType() {
        return RecvEventType.USER_DEL_CARD.value();
    }
}
