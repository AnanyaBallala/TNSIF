class Student{
    int sid;
    String sname;
    static String clg_name="sri indu";
    void display(){
        System.out.println("details of the student are as follows"+sid+" "+sname+" "+Student.clg_name);
    }
public static void main(String[] args) {
    Student one=new Student();
    one.sid=1000;
    one.sname="Ananya";
    one.display();
    Student two=new Student();
    two.sid=1001;
    two.sname="Gopi";
    two.display();
    
    
}
}