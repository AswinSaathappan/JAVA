public class c4q2 {
    public static void main(String[] args) {
    System.out.println("EVEN:"); 
    int evencount=0;  
        for(int i=1; i<=10; i++)
        {
            if(i%2==0)
            {
                evencount++;
                System.out.println(i);
            }
        }
        System.out.println("EVEN COUNT: "+evencount);
        int oddcount=0;
        System.out.println("ODD:");   
        for(int i=1; i<=10; i++)
        {
            if(i%2!=0)
            {
                oddcount++;
                System.out.println(i);
            }
        }
        System.out.println("ODD COUNT: "+oddcount);
    }
    
}
