public class garden {
    int apple_price = 20;
    int apple_count = 5;
    int total_money()
    {
      int total= apple_price * apple_count;
      return total;
    }
    public static void main(String[] args)
    {
        garden obj1 = new garden();
        System.out.println("Totally purchased for "+ obj1.total_money() + " Rupees");
    }
}
