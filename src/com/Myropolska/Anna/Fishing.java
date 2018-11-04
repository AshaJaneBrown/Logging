package Myropolska.Anna;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Fishing extends Hobby {
    String place;

    public Fishing() {
        super("Fishing");
    }

    public Fishing(String place){
        super("Fishing");
        this.place = place;
    }

    @Override
    public void tellAboutHobby() {
        System.out.println(this.toString() + ": " + this.getName());
        System.out.println("Fishing place: " + this.place);
        System.out.println();
    }
}

