class student{
    int rollno;
    String name;
    float fee;
    student(int rollno,String name,float fee){
        rollno-=rollno;
        name=name;
        fee=fee;
    }
    void display(){System.out.println(rollno+""+name+""+fee);}
}
class testthis