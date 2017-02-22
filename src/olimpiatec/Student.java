/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
/**
 *
 * @author Salvador
 */
public class Student {
    private String name;
    private String id;
    private String career;
    //Constructor
    public Student(String name, String id, String career)
    {
        this.name=name;
        this.id=id;
        this.career=career;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    //Methods
    @Override
    public String toString()
    {
        return this.name+" ["+this.id+"] ("+this.career+")";
    }
}
