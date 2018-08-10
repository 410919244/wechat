package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 弹出地理位置选择器的事件推送
 *
 * @author Shinez.
 */
public class RecvLocationSelectEvent extends RecvMenuEvent {


    private static final long serialVersionUID = 5696375686747195933L;
    /**
     * 发送的位置信息
     */
    private SendLocationInfo sendLocationInfo;

    protected RecvLocationSelectEvent() {

    }

    public RecvLocationSelectEvent(RecvMenuEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public SendLocationInfo getSendLocationInfo() {
        return sendLocationInfo;
    }

    public void setSendLocationInfo(SendLocationInfo sendLocationInfo) {
        this.sendLocationInfo = sendLocationInfo;
    }

    @Override
    public String getEventType() {
        return RecvEventType.LOCATION_SELECT.value();
    }

    /**
     * 发送的位置信息
     */
    static class SendLocationInfo {

        /**
         * 纬度
         */
        private Double locationX;


        /**
         * 经度
         */
        private Double locationY;


        /**
         * 精度，可理解为精度或者比例尺、越精细的话 scale越高
         */
        private Double scale;

        /**
         * 地理位置的字符串信息
         */
        private String label;

        /**
         * 朋友圈POI的名字，可能为空
         */
        private String poiname;

        public Double getLocationX() {
            return locationX;
        }

        public void setLocationX(Double locationX) {
            this.locationX = locationX;
        }

        public Double getLocationY() {
            return locationY;
        }

        public void setLocationY(Double locationY) {
            this.locationY = locationY;
        }

        public Double getScale() {
            return scale;
        }

        public void setScale(Double scale) {
            this.scale = scale;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getPoiname() {
            return poiname;
        }

        public void setPoiname(String poiname) {
            this.poiname = poiname;
        }
    }

}
