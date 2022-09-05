package ControlStructure;

public class Pattern {
    static void Pattern(int N){
//Enter your code here
        for(int i=0;i<N;i++)
        {
            if(i==0  || i==N-1)
            {
                for(int j=0;j<=i;j++)
                    System.out.print('*');
                if(i==N-1)
                    System.out.print('*');
            }
            else
            {
                System.out.print('*');
                for(int j=0;j<i;j++)
                    System.out.print('^');
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
