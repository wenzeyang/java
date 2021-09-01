package oop;

/**
 * @author youngwenze
 * @version 1.0
 * 2021/8/24 16:25
 * Description:
 * -
 */
public class Pet {
    private String name;
    private int age;
    private String gender;

    public Pet(){

    }

    public Pet(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        //Pet pet = new Pet("dog",19,"male");
        Pet pet = new Pet();

        String dog_name = pet.getName();
        System.out.println(dog_name);
    }
}
