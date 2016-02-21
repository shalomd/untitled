package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("whyyyyy?");
        System.out.println("distance (12,3)= "+ distance(12,3));
        System.out.println("product (12,3)= "+product(12, 3));
        System.out.println("quotient (12,3)= "+divider(12, 3));
        System.out.println("remainder (15, 2)= "+remainder(15, 2));
        System.out.println("power (7, 4)= "+power(7, 4));
        System.out.println("sqrt (9)= "+sqrt(9));
        System.out.println("sum of digits (123)= "+sumOfDigits(123));
    }
    public static int distance(int x, int y) {
        int count =0;
        if (x  == y )
            return count;
        else if (x<y) {
            for (int i = x; i < y; i++)
                count += 1;
            return count;
        }
        else {
            for (int i = y; i < x; i++)
                count += 1;
            return count;
        }
    }
    public static int product(int x, int y) {
        int result =x;
        for (int i=1; i<y;i++ )
        {
            result += x;
        }
        return result;
    }
    public static int divider(int x, int y){
            int count=0;
        if (y ==0)
            return -1;
        if (y>x)
            return count;
        else if (x ==y )
            return 1;
        else {
            int h=y;
            while (h<=x){
                count +=1;
                h += y;
            }
            return count;
        }

    }
    public static int remainder(int x, int y){
        if (y>x)
            return 0;
        else if (x == y )
            return 0;
        else {
            int h=0;
            while (h<x){
                h += y;
            }
            if (h==x)
                return 0;
            else
                return distance(x, h);
        }
    }
    public static int power(int x, int y){
        /*int result = x;
        if (y == 0 || x== 0)
            return 1;
        if (x ==0 && y == 0 )
            return -1;
        for (int i =1; i <y ; i++){
            result *= x ;
        }
        return result;*/
         // int result = (int)Math.pow(x,y);
        //return result;
        if (y ==0 || x == 1)
            return 1;
        if (y ==1)
            return x;
        else
            return (x * power(x , y-1));

    }
    public static int sqrt(int x){
        int s =1 ;
        while ((s*s) < x)
           s++;
        return s;
    }
    public static int sumOfDigits(int x){
        int sum = 0;
        while ((x % 10) > 1){
            sum +=x % 10;
            x = x/10;
        }
        sum +=x;
        return sum;
    }
}
