package program.leetcode;

abstract class Parent {

    int v=1;

    boolean isBadVersion(int n)
    {
        if(n==v)
            return  true;
        else
            return false;
    }

}
class VersionControl extends  Parent
{
    public int firstBadVersion(int n)
    {
        if(n==0 )
            return n;

       int val=findBinary(1,n);
       return val;
    }
    int flag=0;
    public int findBinary(int low,int up)
    {
        if(low>up)
            return 0;
        int mid=low + (up-low)/2;
        if(isBadVersion(mid)) {
            flag= mid;
            findBinary(low,mid-1);
        }else{
            findBinary(mid+1,up);
        }

        // findBinary(mid+1,up);

        return flag;
    }
    public static void main(String[] args)
    {
        VersionControl c=new VersionControl();

        //int k=c.firstBadVersion(2);
        //System.out.println(k);
        int p=(int)Math.pow(3,19);
        System.out.println(p);
    }

}

