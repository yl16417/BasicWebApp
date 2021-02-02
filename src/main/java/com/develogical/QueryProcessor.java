package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
//        }else if (query.toLowerCase().contains("Imperial")) {
        }else if (query.toLowerCase().contains(" what is your name")) {
            return "Imperial College London is a public research university in London. " +
                    "Imperial grew out of Prince Albert's vision of an area for culture, " +
                    "including the Royal Albert Hall, Imperial Institute, numerous museums," +
                    "and the Royal Colleges that would go on to form the college.";
        }
        return "";
    }
}
