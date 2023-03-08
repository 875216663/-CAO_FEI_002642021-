package Personnel;

/**
 *
 * @author caofei
 */
public class Person {
    String personID;
    String name;
    
    
    public Person() {
        
    }
    
    
    public Person(String personID, String name) {
        this.personID = personID;
        this.name = name;
        
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
        
    @Override
    public String toString() {
        return this.name;
    }
    
    
}
