public class Person {
    //private variables
    private String name;
    private int age;
    private int height;
    private double weight;

    //constructor
    public Person(String name, int age, int height, double weight) {
       setName(name);
       setAge(age);
       setHeight(height);
       setWeight(weight);
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void growOlder(){
       age++; //age increases by 1
       --height; //height decreases by 1
       weight-=0.5; //weight decreases by 0.5 (hopefully!)
    }
}
