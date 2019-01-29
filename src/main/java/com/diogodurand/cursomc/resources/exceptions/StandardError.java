package com.diogodurand.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	public StandardError() {
	}
	
	public StandardError(Integer pStatus, String pMsg, Long pTimeStamp) {
		super();
		status = pStatus;
		msg = pMsg;
		timeStamp = pTimeStamp;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer pStatus) {
		status = pStatus;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String pMsg) {
		msg = pMsg;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long pTimeStamp) {
		timeStamp = pTimeStamp;
	}
	
	
	
}
