import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                /* Hi there in this episode we will print a number from series to one single line
                * ex: 57585
                * o/p : 5
                * 7
                * 5
                * 8
                * 5
                *
                *
                *
                *  */
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int numOfDig =0;
        int temp = num;
        while(temp !=0){
            temp = temp/10;  //so it is reducing a dig one by one
            numOfDig++;
        }
        int divd= (int)Math.pow(10, numOfDig -1) ;
        while(num !=0){
            int ques = num/divd;
            System.out.println(ques);

            num = num % divd ;
            divd= divd/10;
            //lets run this code then we will debug it and convert it into java 17.
            // so we have got result as expected .

            //Lets debug this code and understand whats is happening.

        }

    }






}