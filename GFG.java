class test {
    static int i;
    int j;
    static{
        i=10;
        System.out.println("static block created");
    }
}
public class GFG{
  public static void main(String args[]){
    System.out.println(test.i);
  }
}
