package com.pocathon.dec2020.bean;

public class EmailAttributes {
	
	private String mailTo;
	private String subject;
	private String body;
	private String cc;
	
	/**
	 * @param mailTo
	 * @param subject
	 * @param body
	 * @param cc
	 */
	public EmailAttributes(String mailTo, String subject, String body, String cc) {
		super();
		this.mailTo = mailTo;
		this.subject = subject;
		this.body = body;
		this.cc = cc;
	}

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "EmailAttributes [mailTo=" + mailTo + ", subject=" + subject + ", body=" + body + ", cc=" + cc + "]";
	}
}
