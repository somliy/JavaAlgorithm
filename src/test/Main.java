package test;

import edu.princeton.cs.algs4.In;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<St> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<10;i++){
            list.add(new St(i));
        }
        System.out.println(list);

    }

    static class  St{
        int id;

        public St(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "St{" +
                    "id=" + id +
                    '}';
        }
    }

    private static void swap(int [] a, int i,int j) {




    }
}
