package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 弹出微信相册发图器的事件推送
 *
 * @author Shinez.
 */
public class RecvPicWeixinEvent extends RecvPicSysphotoEvent {


    private static final long serialVersionUID = 2554094154386208113L;

    protected RecvPicWeixinEvent() {

    }

    public RecvPicWeixinEvent(RecvPicSysphotoEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    @Override
    public String getEventType() {
        return RecvEventType.PIC_WEIXIN.value();
    }

}
