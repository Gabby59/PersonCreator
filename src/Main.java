public class Main {
    public static void main(String[] args) {

        //instantiate 2 person objects
        Person Person01 = new Person("James Peterson", 34, 180, 73.5);
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2);

        //display using Get methods
        System.out.println("This is Person 1 : " + Person01.getName() + ", " +Person01.getAge()  + " years old, "+ Person01.getHeight() + " cm, " + Person01.getWeight() +"lbs.");
        System.out.println("This is Person 2: " + Person02.getName() + ", " +Person02.getAge()  + " years old, "+ Person02.getHeight() + " cm, " + Person02.getWeight() +"lbs.");

        //James grows older
        Person01.growOlder();

        //Display James's attributes 1 year later
        System.out.println("This is Person 1 : " + Person01.getName() + ", " +Person01.getAge()  + " years old, "+ Person01.getHeight() + " cm, " + Person01.getWeight() +"lbs.");

    }
}

