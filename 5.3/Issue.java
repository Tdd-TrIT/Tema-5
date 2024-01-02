package com.sergiotrapiello.cursotesting.imitacion.issue;

import java.time.Clock;
import java.time.LocalDateTime;

public final class Issue {

	enum Status{
		NEW, CLOSED
	}
	
	private final User reporter;
	private final String title;
	private final LocalDateTime openDate;
	private final Clock clock;
	
	private Status status;
	private LocalDateTime closedDate;
	
	public Issue(Clock clock, User reporter, String title) {
		this.clock = clock;
		this.reporter = reporter;
		this.title = title;
		this.status = Status.NEW;
		this.openDate = LocalDateTime.now(clock);
	}
	
	public void close() {
		this.status = Status.CLOSED;
		this.closedDate = LocalDateTime.now(clock);
	}

	public User getReporter() {
		return reporter;
	}

	public String getTitle() {
		return title;
	}

	public Status getStatus() {
		return status;
	}

	public LocalDateTime getOpenDate() {
		return openDate;
	}

	public LocalDateTime getClosedDate() {
		return closedDate;
	}


}
