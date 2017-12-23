package json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ActionConfig {

    @SerializedName("Action")
    @Expose
    private String action;//TODO maybe init to null???

    @SerializedName("Department")
    @Expose
    private String department;

    @SerializedName("Course")
    @Expose
    private String course;

    @SerializedName("Student")
    @Expose
    private Long student;

    @SerializedName("Space")
    @Expose
    private Integer space;

    @SerializedName("Prerequisites")
    @Expose
    private ArrayList<String> prerequisites;//TODO check if works with strings

    @SerializedName("Grade")
    @Expose
    private ArrayList<String> grade;

    @SerializedName("Number")
    @Expose
    private Integer number;

    @SerializedName("Computer")
    @Expose
    private String computer;

    @SerializedName("Conditions")
    @Expose
    private ArrayList<String> conditions;

    @SerializedName("Preferences")
    @Expose
    private ArrayList<String> preferences;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Long getStudent() {
        return student;
    }

    public void setStudent(Long student) {
        this.student = student;
    }

    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<String> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<String> grade) {
        this.grade = grade;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public ArrayList<String> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<String> conditions) {
        this.conditions = conditions;
    }

    public ArrayList<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<String> preferences) {
        this.preferences = preferences;
    }
}
