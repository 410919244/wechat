package me.hao0.wechat.model.message.receive.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 小程序审核通知
 * @author zJun
 * @date 2018年8月14日 上午9:57:28
 */
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class RecvAuditMiniEvent extends RecvEvent {

	private static final long serialVersionUID = 1L;
	
	private Integer succTime;
	private Integer failTime;
	private String reason;

	
	public RecvAuditMiniEvent(RecvEvent e) {
		super(e);
		this.eventType = e.getEventType();
	}
}
