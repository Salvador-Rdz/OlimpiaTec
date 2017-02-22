/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
import java.util.*;
/**
 *
 * @author Salvador
 */
public class Team {
    private String name;
    private String id;
    private ArrayList<Student> members;
    //Constructor
    public Team(String name, String id)
    {
        this.name=name;
        this.id=id;
        this.members=new ArrayList<Student>();
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
    //Methods
    public boolean addStudent(String name, String id, String career)//Adds and creates a student
    {
        if(!findStudent(id))    //Checks if the id is already occupied
        {
            this.members.add(new Student(name, id, career));    
            return true;
        }
        System.out.println("Id already in use");
        return false;
    }
    public boolean addStudent(Student student) //Adds an already existing student to the ArrayList
    {
        if(!findStudent(student.getId()))   //Checks the id
        {
            this.members.add(student); //Adds it to the list
            return true;
        }
        return false;
    }
    public boolean findStudent(String id)   //Searches for a specific id in the ArrayList
    {
        if(!this.members.isEmpty()) //Checks if the list is empty
        {
            for(Student dummyStudents:this.members) //Iterates the arrayList
            {
                if(dummyStudents.getId().equals(id))//Checks for the id
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean removeStudent(String id)
    {
        if(findStudent(id)) //Checks if the id matches one in the list
        {
            ListIterator ls = this.members.listIterator();  //Initializes a listIterator to locate the Student
            while(ls.hasNext())
            {
                Student dummyMember = (Student) ls.next();  
                if(dummyMember.getId().equals(id))
                {
                    ls.remove();        //Removes it
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString()    //Returns a String with the information of each member
    {
        String print="Team: "+this.name+" id: "+this.id+" members: {";  
        if(!this.members.isEmpty()) 
        {
            for(Student dummyStudents:this.members)
            {
                print+=dummyStudents.toString()+" ";    //Gets the information of each student with toString();
            }
        }
        return print+"}";   //Prints the formatted String
    }
}
