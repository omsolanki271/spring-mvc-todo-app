package com.todo.entities;

import java.util.Date;

public class Todo {
	private String todoTitle;
	private String todoContent;
	private Date date;

	public Todo()
	{
		super();
	}

	public Todo(String todoTitle, String todoContent, Date date) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.date = date;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodoContent() {
		return todoContent;
	}

	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Todo [todoTitle=" + todoTitle + ", todoContent=" + todoContent + ", date=" + date + "]";
	}

}
