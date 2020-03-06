package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-06
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceSpace().replaceSpace("We are happy."));
    }
}
