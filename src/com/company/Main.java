package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("whyyyyy?");
        System.out.println(distance(12,3));
        System.out.println(product(12, 3));
        System.out.println(divider(12, 3));
        System.out.println(remeinder(15, 2));
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
        if (y>x)
            return count;
        else if (x ==y )
            return 1;
        else {
            int h=0;
            while (h<=x){
                count +=1;
                h += y;
            }
            return count;
        }

    }
    public static int remeinder(int x, int y){
        int count=0;
        if (y>x)
            return count;
        else if (x == y )
            return count;
        else {
            int h=0;
            while (h<x){
                h += y;
            }
            if (h==x)
                return 0;
            else
                return distance( x,h);
        }
    }
}
