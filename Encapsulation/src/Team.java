import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> FirstTeam;
    private List<Person> ReverseTeam;

    public Team(String name){
        this.setName(name);
        this.FirstTeam = new ArrayList<>();
        this.ReverseTeam = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addPlayer(Person person){
        if(person.getAge()<40){
            this.FirstTeam.add(person);
        }
        else{
            this.ReverseTeam.add(person);
        }
    }
    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(this.FirstTeam);
    }
    public List<Person> getReverseTeam(){
        return Collections.unmodifiableList(this.ReverseTeam);
    }
}
