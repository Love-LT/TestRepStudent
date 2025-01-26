/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /** Hi there
package studentlist;

/** entity 
 *
 * @author sivagamasrinivasan
 */
public class Student // model the student raw data
{

    /**
     * @return the coursename
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * @param coursename the coursename to set
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    private String name; // variables private 
   private int sid; // principle "encapsulation"
private int sem;
private String coursename;
private int year;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the sem
     */
    public int getSem() {
        return sem;
    }

    /**
     * @param sem the sem to set
     */
    public void setSem(int sem) {
        this.sem = sem;
    }
}
