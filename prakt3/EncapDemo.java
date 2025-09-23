package prakt3;

public class EncapDemo {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if (newAge <= 30 && newAge >= 18) {
            age = newAge;
        } else {
            System.out.println("Maaf umur maksimal adalah 30 dan umur minimal 18");
        }
    }
}
