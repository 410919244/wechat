package me.hao0.wechat.model.card;

import me.hao0.wechat.model.base.WechatResponse;

/**
 * 1.1 查询Code接口
 * @author zJun
 * @date 2018年8月5日 下午5:23:24
 */
public class CodeGet extends WechatResponse {
	private String errmsg;
	private CardBean card;
	private String openid;
	/** 是否可以核销，true为可以核销，false为不可核销 */
	private boolean can_consume;
	private String user_card_status;
	
	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	public String getErrmsg(){
		return this.errmsg;
	}
	public CardBean getCard(){
		return this.card;
	}
	public void setOpenid(String openid){
		this.openid = openid;
	}
	public String getOpenid(){
		return this.openid;
	}
	public void setCan_consume(boolean can_consume){
		this.can_consume = can_consume;
	}
	public boolean getCan_consume(){
		return this.can_consume;
	}
	public void setUser_card_status(String user_card_status){
		this.user_card_status = user_card_status;
	}
	public String getUser_card_status(){
		return this.user_card_status;
	}
	public static class CardBean{
		private String card_id;
		private int begin_time;
		private int end_time;
		public void setCard_id(String card_id){
			this.card_id = card_id;
		}
		public String getCard_id(){
			return this.card_id;
		}
		public void setBegin_time(int begin_time){
			this.begin_time = begin_time;
		}
		public int getBegin_time(){
			return this.begin_time;
		}
		public void setEnd_time(int end_time){
			this.end_time = end_time;
		}
		public int getEnd_time(){
			return this.end_time;
		}
	}
}

