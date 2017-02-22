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
public class Sport {
    private String name;
    private String id;
    private ArrayList<Team> teams;
    //Constructor
    public Sport(String name, String id)
    {
        this.name=name;
        this.id=id;
        this.teams=new ArrayList<Team>();
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
    public boolean addTeam(Team team)   //Adds a pre-defined team
    {
        if(!findTeam(team.getId())) //Checks for dupe id's
        {
            this.teams.add(team);
            return true;
        }
        return false;
    }
    public boolean addTeam(String name, String id)   //Creates a team, then adds it
    {
        if(!findTeam(id)) //Checks for dupe id's
        {
            this.teams.add(new Team(name, id));
            return true;
        }
        return false;
    }
    public boolean removeTeam(String id)
    {
        if(findTeam(id))    //Checks if the id matches one in the list
        {
            ListIterator ls = this.teams.listIterator(); //Uses ListIterator to get the team
            while(ls.hasNext())
            {
                Team dummyTeam = (Team) ls.next();  
                if(dummyTeam.getId().equals(id))
                {
                    ls.remove();    //Deletes it
                    return true;
                }
            }
        }
        return false;
    }
    public boolean findTeam(String id) //Searches for team with a given id
    {
        if(!this.teams.isEmpty())   //Checks if the list is empty
        {
            for(Team dummyTeams: this.teams)
            {
                if(dummyTeams.getId().equals(id))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public String toString() //Returns a formatted String with a collection of the teams in this sport
    {
        String print="Sport:"+this.name+" id:"+this.id+" Teams {";
        if(!this.teams.isEmpty())
        {
            for(Team dummyTeam:this.teams)
            {
                print+=dummyTeam.getName();
            }
        }
        return print+"}";
    }
}
