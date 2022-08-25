package orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Similar to a Student object, an instance of a Course object is a data sack that contains information about the Course. The information includes: course ID (dept, num), name of the course, description of the course,
 * the times the course meets, the room the course meets in, the course limit, the current number of students enrolled, the name of the Professor, and the list of students enrolled in the course. 
 * @author 90rfa
 *
 */

@Entity
@Table(name = "course")
public class Course{
	
	private String courseId;
	private String name;
	private String description;
	private String times;
	private String room;
	private Integer limit;
	private Integer currsize;
	private Integer professor;
	
	@Id
	public String getCourseId() {
		return courseId;
	}
	public Course setCourseId(String courseId2) {
		this.courseId = courseId2;
		return this;
	}
	
	@Column
	public String getName() {
		return name;
	}
	public Course setName(String name) {
		this.name = name;
		return this;
	}
	
	@Column
	public String getDescription() {
		return description;
	}
	public Course setDescription(String description) {
		this.description = description;
		return this;
	}
	
	@Column (name = "schedule")
	public String getTimes() {
		return times;
	}
	public Course setTimes(String times) {
		this.times = times;
		return this;
	}
	
	@Column
	public String getRoom() {
		return room;
	}
	public Course setRoom(String room) {
		this.room = room;
		return this;
	}
	
	@Column (name = "seats")
	public int getLimit() {
		return limit;
	}
	public Course setLimit(int limit) {
		this.limit = limit;
		return this;
	}
	
	@Column (name = "currentSize")
	public int getCurrsize() {
		return currsize;
	}
	public Course setCurrsize(int currsize) {
		this.currsize = currsize;
		return this;
	}
	
	@Column (name = "profId")
	public int getProfessor() {
		return professor;
	}
	public Course setProfessor(int professor) {
		this.professor = professor;
		return this;
	}
	
	
	
}
