public class This {
    String myname;
    void setname(String myname)
    {
        this.myname = myname;
    }
    public static void main(String[] args) {
        This obj1 = new This();
        obj1.setname("Aswin");
        System.out.println(obj1.myname);
    }
}
