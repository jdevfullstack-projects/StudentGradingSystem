package xdvrx1_CRUDProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	private Long id;
	private String name;
	private String roboticsGrade;

	protected Student() {
	}

	protected Student(Long id, String roboticsGrade) {
		super();
		this.id = id;
		this.name = name;
		this.roboticsGrade = roboticsGrade;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoboticsGrade() {
		return roboticsGrade;
	}

	public void setRoboticsGrade(String roboticsGrade) {
		this.roboticsGrade = roboticsGrade;
	}

}
