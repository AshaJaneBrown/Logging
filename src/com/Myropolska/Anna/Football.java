package Myropolska.Anna;

public class Football extends Hobby{
    String team;
    public Football(){
        super("Football");
    }

    public Football(String team){
        super("Football");
        this.team = team;
    }

    @Override
    public void tellAboutHobby() {
        System.out.println(this.toString() + ": " + this.getName());
        System.out.println("Playing for team: " + this.team);
        System.out.println();
    }
}



