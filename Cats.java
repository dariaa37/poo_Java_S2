public class Cats {
    // Variables declaration
    String race;
    String color;
    String eyesColor;
    int age;
    Boolean vacun;

    // Constructor without parameters
    public Cats(){
        race = "Perse";
        color = "White white black";
        eyesColor = "blue";
        age = 4;
        vacun = true;
    }

    // Constructor with parameters
    public Cats(String race, String color, String eyesColor, int age, Boolean vacun){
        this.race = race;
        this.color = color;
        this.eyesColor = eyesColor;
        this.age = age;
        this.vacun = vacun;
    }

    // Methods
    public void showCats(){
        System.out.println("The cat race is "+ race + ", its color is " + color + " and the cat is " + age + " years old");
    }
}
