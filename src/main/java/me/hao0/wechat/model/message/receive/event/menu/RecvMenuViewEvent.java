package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 菜单点击跳转链接事件
 *
 * @author Shinez.
 */
public class RecvMenuViewEvent extends RecvEvent {


    private static final long serialVersionUID = -7627219354870692831L;
    /**
     * 事件KEY值，与自定义菜单接口中KEY值对应
     * 事件KEY值，设置的跳转URL
     */
    private String eventKey;

    protected RecvMenuViewEvent() {

    }

    public RecvMenuViewEvent(RecvEvent e) {
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
        return RecvEventType.MENU_VIEW.value();
    }

}
