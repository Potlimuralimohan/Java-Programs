public class Creatingobjects {
    public static void main(String[] args) {
        Student[] arr=new Student[5];

        arr[0]=new Student(0, "Murali");
        arr[1]=new Student(1, "mohan");
        arr[2]=new Student(2, "kalai");
        arr[3]=new Student(3, "ramu");
        arr[4]=new Student(4, "rama");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Elemnts at"+
                                arr[i].rollno+" "+
                                arr[i].name);
        }
        
    }
}
class Student{
    public int rollno;
    public String name;
    //constructor().
    Student(int roll_no,String name)
    {
        this.rollno=roll_no;
        this.name=name;
    }
}
