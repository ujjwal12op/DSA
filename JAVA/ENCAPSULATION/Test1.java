

    class Student{
        private int age; // 0
        private String name; // null


        public void setData()
        {
            age = 12;
            name = "Tiwari";
        }

        public void studentDetails(){
            System.out.println("The age of the student is "+age+"his name is "+name);
        }

    }


    public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData();
        s1.studentDetails();
    }
}
