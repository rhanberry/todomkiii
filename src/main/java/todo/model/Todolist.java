package todo.model;

public class Todolist {

	


	private long id;
	private String todoitem;
	private String tododescription;
	private boolean isComplete;


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id2
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the todoitem
	 */
	public String getTodoitem() {
		return todoitem;
	}

	/**
	 * @param todoitem
	 *            the todoitem to set
	 */
	public void setTodoitem(String todoitem) {
		this.todoitem = todoitem;
	}

	/**
	 * @return the tododescription
	 */
	public String getTododescription() {
		return tododescription;
	}

	/**
	 * @param tododescription
	 *            the tododescription to set
	 */
	public void setTododescription(String tododescription) {
		this.tododescription = tododescription;
	}

	/**
	 * @return the isComplete
	 */
	public boolean isComplete() {
		return isComplete;
	}

	/**
	 * @param isActive
	 *            the isComplete to set
	 */
	public void setComplete(boolean isActive) {
		this.isComplete = isActive;
	}


}
