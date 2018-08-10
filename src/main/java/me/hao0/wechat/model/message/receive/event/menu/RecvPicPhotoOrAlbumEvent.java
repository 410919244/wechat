package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 弹出拍照或者相册发图的事件推送
 *
 * @author Shinez.
 */
public class RecvPicPhotoOrAlbumEvent extends RecvPicSysphotoEvent {


    private static final long serialVersionUID = 2554094154386208113L;

    protected RecvPicPhotoOrAlbumEvent() {

    }

    public RecvPicPhotoOrAlbumEvent(RecvPicSysphotoEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    @Override
    public String getEventType() {
        return RecvEventType.PIC_PHOTO_OR_ALBUM.value();
    }

}
