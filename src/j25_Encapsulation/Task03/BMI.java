package j25_Encapsulation.Task03;

public class BMI {
   private String name;
    private int age;
    private double weight;
    private double height;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
public double getBMI(){
        double bmi;
        return bmi=weight/(height*height);
}
public String getStatus(){
        if (getBMI()<18.5){
            return "Zayıf";
        } else if (getBMI()<25) {
            return "Normal";
        } else if (getBMI()<30) {
            return "Kilolu";
        }else return "Obez";
}


}
class Runner{
    public static void main(String[] args) {
        BMI obj=new BMI("Ebubekir",26,75,1.80);
        System.out.println("BMI : "+ obj.getName()+" "+obj.getStatus()+" "+obj.getBMI());
    }
}
