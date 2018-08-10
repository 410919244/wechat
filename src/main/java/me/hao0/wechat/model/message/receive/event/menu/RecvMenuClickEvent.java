package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 菜单点击拉取消息事件
 *
 * @author Shinez.
 */
public class RecvMenuClickEvent extends RecvEvent {

    private static final long serialVersionUID = 9202883940530774972L;
    /**
     * 事件KEY值，与自定义菜单接口中KEY值对应
     * 事件KEY值，设置的跳转URL
     */
    private String eventKey;

    protected RecvMenuClickEvent() {

    }

    public RecvMenuClickEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Override
    public String getEventType() {
        return RecvEventType.MENU_CLICK.value();
    }

}
