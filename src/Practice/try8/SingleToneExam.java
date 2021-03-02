package Practice.try8;

public class SingleToneExam {

    int age;
    String name;


    private SingleToneExam(){
        this.age= 29;
        this.name="john";

    }

    public static SingleToneExam instance = new SingleToneExam();
    public static SingleToneExam getInstance(){
        return instance;
    }


}
