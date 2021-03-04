package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }else if (query.toLowerCase().contains("Imperial")) {
        } else if (query.toLowerCase().contains("what is your name")) {
            return "warm-water";
        } else if (query.toLowerCase().contains("what is plus")) {
            return "+";
        } else if (query.toLowerCase().contains("plus")) {
            int first = query.indexOf("plus");
            int first_num = Integer.parseInt(query.substring(0, first + 1));
            int second_num = Integer.parseInt(query.substring(first));
            return String.valueOf(first_num + second_num);
        } else if (query.toLowerCase().contains("multiplied")) {
            int first = query.indexOf("multiplied");
            int first_num = Integer.parseInt(query.substring(0, first + 1));
            int second_num = Integer.parseInt(query.substring(first));
            return String.valueOf(first_num * second_num);
        }
        return "";
    }
}
