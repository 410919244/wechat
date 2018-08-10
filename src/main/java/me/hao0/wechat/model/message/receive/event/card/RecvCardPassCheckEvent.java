package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 卡券通过审核事件推送
 * 生成的卡券通过审核时，微信会把这个事件推送到开发者填写的URL。
 *
 * @author Shinez.
 */
public class RecvCardPassCheckEvent extends RecvEvent {

    private static final long serialVersionUID = -2639275405840259192L;
    /**
     * 卡券ID
     */
    private String cardId;
    /**
     * 审核不通过原因
     */
    private String refuseReason;

    protected RecvCardPassCheckEvent() {

    }


    public RecvCardPassCheckEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    @Override
    public String getEventType() {
        return RecvEventType.CARD_PASS_CHECK.value();
    }


}
