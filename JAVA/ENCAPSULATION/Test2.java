class student{
    // private int age;
    private String name;

    public void setName1(String name)
    {   
        // Shadowing problem
        this.name = name;
    }


    public void setName2(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("the name of the student is "+name);
    }


}


public class Test2 {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj.setName1("Ujjwal");
        obj.show();
        obj1.setName1("Tiwari");
        obj1.show();
    }
}
