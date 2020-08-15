package program.leetcode;

import java.util.*;

public class Anagrams {
    private static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
            return false;
        char[] char_array=new char[26];
        for(int i=0;i<a.length() && i<b.length();i++)
        {
            char_array[a.charAt(i)-97]++;
            char_array[b.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++)
        {
            if(char_array[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        int k = array.length;
        List<List<String>> p = findAnagram(array);


    }


    private static List<List<String>> findAnagram(String[] array) {

        boolean[] visited=new boolean[array.length];
        List<List<String>> list1=new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            List<String> list=new ArrayList<>();

            list.add(array[i]);
            if(!visited[i]) {
                for (int j = i + 1; j < array.length; j++) {
                    if (!visited[j]) {
                        if (isAnagram(array[i], array[j])) {
                            list.add(array[j]);
                            visited[j] = true;
                        }
                    }
                }
                list1.add(list);
            }

        }
        return list1;
    }

}
