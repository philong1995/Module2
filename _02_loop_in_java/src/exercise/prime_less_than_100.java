package exercise;

public class prime_less_than_100 {
    public static void main(String[] args) {
        int i ;
        int num ;
        String primeNumbers = " " ;
        for (i = 1; i <= 100; i++)
        {
            int count = 0;
            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    count = count + 1;
                }
            }
            if (count == 2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố nhỏ  100 là:");
        System.out.println(primeNumbers);
    }
}
