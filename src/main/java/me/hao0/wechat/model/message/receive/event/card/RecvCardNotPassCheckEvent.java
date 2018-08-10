package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 卡券未通过审核事件推送 生成的卡券未通过审核时，微信会把这个事件推送到开发者填写的URL。
 * @author Shinez.
 */
public class RecvCardNotPassCheckEvent extends RecvCardPassCheckEvent {

	private static final long serialVersionUID = -9078108698373641810L;

	protected RecvCardNotPassCheckEvent() {

	}

	public RecvCardNotPassCheckEvent(RecvEvent e) {
		super(e);
		this.eventType = e.getEventType();
	}

	@Override
	public String getEventType() {
		return RecvEventType.CARD_NOT_PASS_CHECK.value();
	}
}
