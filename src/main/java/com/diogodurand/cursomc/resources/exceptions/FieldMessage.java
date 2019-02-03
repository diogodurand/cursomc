package com.diogodurand.cursomc.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable{

	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String pFieldName, String pMessage) {
		super();
		fieldName = pFieldName;
		message = pMessage;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String pFieldName) {
		fieldName = pFieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String pMessage) {
		message = pMessage;
	}
	
}
