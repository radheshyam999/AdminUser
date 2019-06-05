import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author ADMIN
 *
 */
public class Todo {

	private List<Todo> todos = new ArrayList<Todo>();
	
	public List<Todo> getTodos() {
		  return todos;
		 }
	
	 public void setTodos(List<Todo> todos) {
		  this.todos = todos;
		 }
}
