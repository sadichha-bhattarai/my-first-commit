package command;
/**
 *<h1> Student domain Class </h1>
 * This domain class contains all attribute of a student and corresponds to student table in database
 * @author Sadichha Bhattarai
 * @version 1.0
 * @since 2019.8.7
 */

public class Student {
    /**
     * The first and last name of the student
     */
    private String name;

    /**
     * The address of the student
     */
    private String address;

    /**
     * The age of the student
     */
    private int age;

    /**
     * The class on which the student studies
     */
    private String grade;

    /**
     * Creates a new Student with the given name.
     * The name should include both first and
     * last name.
     * @param name Name of the student
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Gets the first and last name of this Student.
     * @return this Student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Creates a new Student with the given address.
     * @param address Address of the student
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Gets the address of this Student.
     * @return this Student's address.
     */
    public String getAddress(){
        return address;
    }

    /**
     * Creates a new Student with the given age.
     * The age must be an integer number.
     * @param age Age of the student
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Gets the age of this Student.
     * @return this Student's age.
     */
    public int getAge(){
        return age;
    }

    /**
     * Creates a new Student with the given grade.
     * @param grade Grade of the student
     */
    public void setGrade(String grade){
        this.grade = grade;
    }

    /**
     * Gets the grade of this Student.
     * @return this Student's grade.
     */
    public String getGrade(){
        return grade;
    }
}