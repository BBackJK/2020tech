package riding;

import java.util.Date;

public class RidingEntity {
	private int id;
	private String todo;
	private int maxPerson;
	private String money;
	private String bossChallenger;
	private Date regDate;
	private int curPerson;
	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCurPerson() {
		return curPerson;
	}
	public void setCurPerson(int curPerson) {
		this.curPerson = curPerson;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public int getMaxPerson() {
		return maxPerson;
	}
	public void setMaxPerson(int maxPerson) {
		this.maxPerson = maxPerson;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getBossChallenger() {
		return bossChallenger;
	}
	public void setBossChallenger(String bossChallenger) {
		this.bossChallenger = bossChallenger;
	}
}
