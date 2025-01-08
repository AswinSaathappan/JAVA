public class nestedforloop7 {
    public static void main(String[] args)
    {
        for(int i=1; i<=3; i++)
        {
            for(int k=1; k<=3-i ; k++)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1 ; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
