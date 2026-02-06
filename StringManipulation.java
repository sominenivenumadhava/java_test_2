package test1.com;
import java.util.*;
class Manipulation {
    public static void StringManipulation() {
        StringManipulation(0, null);
    }

    public static void StringManipulation(int n, String s){
        int l = s.length();
        for(int i=0;i<n;i++){
            System.out.print(s.toUpperCase());
        }
        System.out.println("\nLength:" + n*l);
    }
    public static void main(String[] args){
        String S = "java";
        StringManipulation(3,S);
    }

}