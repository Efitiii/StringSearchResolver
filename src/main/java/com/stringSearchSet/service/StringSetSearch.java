package com.stringSearchSet.service;

import com.stringSearchSet.exceptions.ExceptionMessages;
import com.stringSearchSet.exceptions.InvalidInputException;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author Efrem  on 4/27/19
 * @project Algorithms2
 */

@Component
public class StringSetSearch {

    Set<String> lookUpSet;



    public boolean findStringInSet(String str) throws InvalidInputException {

        if (lookUpSet==null){
            throw new InvalidInputException(ExceptionMessages.INVALID_SET.getMessage());
        }

        if (str.length()==0){
            throw new InvalidInputException(ExceptionMessages.INVALID_STRING_INPUT.getMessage());
        }

        boolean previous=true;
        boolean temp=false;
        boolean beforePrevious=false;
        boolean output=false;
        StringBuilder current= new StringBuilder();
        Queue<String> queueOfStrings= new LinkedList<>();
        int i=0;
        int u=0;



        while (i<str.length() && output==false ){

            u=0;
            temp=false;
            if (previous==true){
                if (availableInSet(Character.toString(str.charAt(i)))){
                    temp=true;
                    if (availableInSet(str.substring(i+1,str.length()))){
                        output=true;
                    }
                }
            }

                while (u<queueOfStrings.size()){
                    String currentCombination= queueOfStrings.poll();

                    if (currentCombination.length()>1 || beforePrevious==true) {
                        StringBuilder currentBuilder = new StringBuilder();
                        currentBuilder.append(currentCombination);
                        currentBuilder.append(str.charAt(i));

                        if (availableInSet(currentBuilder.toString())) {
                            temp = true;
                        }

                        ((LinkedList<String>) queueOfStrings).add(currentBuilder.toString());
                        u++;
                    }
                }



            if (temp==true)
                if (availableInSet(str.substring(i+1, str.length()))) {
                output = true;
            }

            beforePrevious=previous;
            previous=temp;
            ((LinkedList<String>) queueOfStrings).add(Character.toString(str.charAt(i)));
            i++;



        }

        return output;

    }


    private boolean availableInSet(String str){
        boolean output=false;
        if (lookUpSet.contains(str)){
            output=true;
        }
        return output;

    }

    public void setLookUpSet(Set<String> lookUpSet) {
        this.lookUpSet = lookUpSet;
    }
}
