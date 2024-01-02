package com.sergiotrapiello.cursotesting.imitacion.issue;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public final class Email {

	private String receiver;
	private String subject;

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(receiver).append(subject).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Email other = (Email) obj;
		return new EqualsBuilder().append(receiver, other.receiver).append(subject, other.subject).isEquals();
	}

	@Override
	public String toString() {
		return "Email [receiver=" + receiver + ", subject=" + subject + "]";
	}

}
