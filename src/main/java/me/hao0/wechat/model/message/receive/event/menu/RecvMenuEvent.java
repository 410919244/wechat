package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEvent;

/**
 * 菜单事件
 * Author: haolin
 * Email: haolin.h0@gmail.com
 * Date: 9/11/15
 */
public class RecvMenuEvent extends RecvEvent {

    private static final long serialVersionUID = -1710547515580409653L;

    /**
     * eventType为CLICK时: 与自定义菜单接口中KEY值对应
     * eventType为VIEW时: 设置的跳转URL
     */
    private String eventKey;

    protected RecvMenuEvent() {

    }

    public RecvMenuEvent(RecvEvent e) {
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
    public String toString() {
        return "RecvMenuEvent{" +
                ", eventKey='" + eventKey + '\'' +
                "} " + super.toString();
    }
}
