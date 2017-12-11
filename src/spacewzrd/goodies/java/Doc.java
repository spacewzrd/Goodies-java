package spacewzrd.goodies.java;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doc {
	@Id
	

	private String title;
	
	private String body;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
