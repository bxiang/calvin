package com.mckee;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        String input = "ABCD";
        List<String> result = app.permu(input);
        for(String s: result) {
            System.out.println(s);
        }
    }

    public List<String> permu(String input) {
        List<String> result = new LinkedList<String>();
        int len = input.length();
        if (len == 1) {
            result.add(input);
        } else {
            char[] ar = input.toCharArray();
            for(int i = 0; i < len; i++) {
                String subStr = getSubStr(input, i);
                List<String> subResult = permu(subStr);
                for(String sub : subResult) {
                    result.add("" + ar[i] + sub);
                }
            }
        }
        return result;
    }

    public String getSubStr(String input, int i) {
        return input.substring(0, i) + input.substring(i+1, input.length());
    }

}
