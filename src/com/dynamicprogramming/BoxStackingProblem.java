package com.dynamicprogramming;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
/*
there can be many boxes whose base area(base length and bredth) can be smaller for the selected box but
we have to consider only that box whose height is maxium.
* */
class Box implements Comparable<Box>
{
    int length;
    int breadth;
    int height;
    int area;
    Box(int length,int breadth,int height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        this.area=length*breadth;
    }

    @Override
    public int compareTo(@NotNull Box o) {
        return o.area-this.area;
    }
}
public class BoxStackingProblem {
    public static void main(String[] args)
    {
        Box[] array={new Box(4,6,7),new Box(1,2,3),
                new Box(4,5,6),new Box(10,12,32)};
        int n=array.length;
        Box[] rotation=new Box[3*n];
        for(int i=0;i<n;i++)
        {
            int l=array[i].length;
            int b=array[i].breadth;
            int h=array[i].height;
            rotation[3*i]=new Box(l,b,h);
            rotation[3*i+1]=new Box(l,h,b);
            rotation[3*i+2]=new Box(b,h,l);
        }
        Arrays.sort(rotation);
        for(int i=0;i<3*n;i++)
        {
           // System.out.println(rotation[i].length+"X"+rotation[i].breadth+"X"+rotation[i].height+"="+rotation[i].area);
        }
        int[] lis=new int[3*n];
        for(int i=0;i<3*n;i++)
        {
            lis[i]=rotation[i].height;
        }
        for(int i=1;i<3*n;i++)
        {
           // System.out.println("for i=>"+i+"("+rotation[i].length+"=>"+rotation[i].breadth+")");
            lis[i]=0;
            int val=0;
            for(int j=0;j<i;j++)
            {
                if(rotation[i].length<rotation[j].length && rotation[i].breadth<rotation[j].breadth)
                {
                   /*here for ith box there can be many jth box satisfying the above condtion but we
                   have to choose only that jth box whose height is maximum.
                   * */
                    val=Math.max(val,lis[j]);

                }
            }
            lis[i]=val+rotation[i].height;
        }
        for(int i=0;i<lis.length;i++) {
            System.out.print(lis[i]+"  ");
        }


    }
}
