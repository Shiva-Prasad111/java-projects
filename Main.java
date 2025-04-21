package Pentagon.java_programing;


class player {
    private String name;
    private int age;
    private double height;
    private String country;


    player(String name,int age,double height, String country){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if(age <= 0){
            throw new IllegalArgumentException("Age must be positive");
        }
        if(height <= 0){
            throw new IllegalArgumentException("Height must be positive");
        }
        if (country == null || country.isEmpty()){
            throw new IllegalArgumentException("Country cannot be empty.");
        }
        this.name = name;
        this.age = age;
        this.height = height;
        this.country = country;
    }
    String displayinfo(){
        return name+" "+age+" "+height+" "+country;
    }
}
class Cricket extends player{
    int wickets;
    int runs;

    Cricket(String name, int age, double height, String country,int wickets,int runs) {
        super(name, age, height, country);
        if(wickets < 0){
            throw new IllegalArgumentException("Wickets cannot be negative");
        }
        if(runs < 0){
            throw new IllegalArgumentException("Runs cannot be negative");
        }
        this.wickets = wickets;
        this.runs = runs;
    }

    String displyCricketStats(){
        return displayinfo()+" "+wickets+" "+runs;
    }
}

class footbal extends player{
    int goals;
    String position;

    footbal(String name, int age, double height, String country,int goals,String position) {
        super(name, age, height, country);
        if (goals < 0) {
            throw new IllegalArgumentException("Goals cannot be negative.");
        }

        // Validate position
        if (position == null || position.isEmpty()) {
            throw new IllegalArgumentException("Position cannot be empty.");
        }
        this.goals = goals;
        this.position = position;
    }
    String displyFootballStats(){
        return displayinfo()+" "+goals+" "+position;
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Cricket c = new Cricket("Shiva", -22, 5.5, "India", 2, 1234);
            Cricket c1 = new Cricket("Virat", 36, 5.9, "India", 3, 12345);
            footbal f = new footbal("Shiv", 22, 5.5, "India", 5, "midfilder");
            System.out.println(c.displyCricketStats());
            System.out.println(f.displyFootballStats());
        } catch (IllegalArgumentException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
