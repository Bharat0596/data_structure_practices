package program.leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

class Interval implements Comparable<Interval>{
    int a;
    int b;
    Interval(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public int compareTo(@NotNull Interval o) {
        return this.a-o.a;
    }
}
public class MergeIntervalProblems {
    public static void main(String[] args)
    {
        int[][] array={{1,4},{2,3}};
        Interval[] intervals=new Interval[array.length];
        for(int i=0;i<array.length;i++)
        {
            intervals[i]=new Interval(array[i][0],array[i][1]);
        }
        Arrays.sort(intervals);
        int[][] temp=findIntervals(intervals);




       for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp[0].length;j++)
            {
                System.out.print(temp[i][j]+"  ");
            }
            System.out.println();
        }

    }


    private static int[][] findIntervals(Interval[] array) {
        Stack<Interval> stack=new Stack<>();
        Interval val=array[0];
       stack.push(val);
        for(int i=1;i<array.length;i++)
        {
            Interval val1=array[i];
            Interval temp=stack.peek();
            if(temp.b>=val1.a)
            {
                stack.pop();
                val1.a = temp.a;
                if(val1.b<temp.b)
                {
                    val1.b=temp.b;
                }
                stack.push(val1);
            }else {
                stack.push(val1);
            }

        }
        int[][] m=new int[stack.size()][2];
        int i=stack.size()-1;
        while(!stack.isEmpty())
        {
            Interval k=stack.pop();
            m[i][0]=k.a;
            m[i][1]=k.b;
            i--;
        }
        return m;
    }
}
