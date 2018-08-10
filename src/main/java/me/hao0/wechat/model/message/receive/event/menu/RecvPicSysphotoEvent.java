package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEventType;

import java.util.List;

/**
 * 弹出系统拍照发图的事件推送
 *
 * @author Shinez.
 */
public class RecvPicSysphotoEvent extends RecvMenuEvent {

    private static final long serialVersionUID = 9202883940530774972L;
    /**
     * 发送的图片信息
     */
    private SendPicsInfo sendPicsInfo;

    protected RecvPicSysphotoEvent() {

    }

    public RecvPicSysphotoEvent(RecvMenuEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public SendPicsInfo getSendPicsInfo() {
        return sendPicsInfo;
    }

    public void setSendPicsInfo(SendPicsInfo sendPicsInfo) {
        this.sendPicsInfo = sendPicsInfo;
    }

    @Override
    public String getEventType() {
        return RecvEventType.PIC_SYSPHOTO.value();
    }

    /**
     * 发送的图片信息
     */
    static class SendPicsInfo {

        /**
         * 发送的图片数量
         */
        private Integer count;

        /**
         * 图片列表
         */
        private List<Item> picList;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<Item> getPicList() {
            return picList;
        }

        public void setPicList(List<Item> picList) {
            this.picList = picList;
        }
    }

    /**
     * 图片信息
     */
    class Item {

        /**
         * 图片的MD5值，开发者若需要，可用于验证接收到图片
         */
        private String picMd5Sum;

        public String getPicMd5Sum() {
            return picMd5Sum;
        }

        public void setPicMd5Sum(String picMd5Sum) {
            this.picMd5Sum = picMd5Sum;
        }
    }

}
