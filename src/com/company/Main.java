package com.company;


import java.util.HashMap;


public class Main {



    public static void main(String[] args) {
        //write your code


        String s = "ababbbaa";
        int globalCount =0;

        boolean turns =true;
        for (int turn =0; turns==true ;turn++)
            {
                for(int j=0;j<2;j++){
                    int count =0;



                       final int mid = s.length() / 2+ turn; //get the middle of the String
                    String parts = s.substring(0, mid);
                    String parts1 = s.substring(mid);
                    HashMap<String,Integer> Occurences =new HashMap<>();



                         for(int i=0;i<parts.length();i++){
                                 String find =""+parts.charAt(i);

                                     //looking for element
                                  if(Occurences.containsKey(find)== false)
                                  {
                                         if (parts1.indexOf(find) !=-1)
                                         {
                                                 Occurences.put(find,parts1.indexOf(find));
                                                     count++;
                                         }

                                  }

                                         else
                                             {
                                         if(parts1.indexOf(find,Occurences.get(find))!=-1)
                                         {
                                                 Occurences.replace(find,parts1.indexOf(find,Occurences.get(find)));
                                                 count++;
                                         }

                                            }


        }

                                         if(globalCount<count)
                                         {
                                           globalCount=count;

                                         }
                                         else if(globalCount>count)
                                         {
                                            globalCount=count+1;
                                            turns= false;
                                            break;

                                         }
                                         turn = -turn;
                }
            }
System.out.println(globalCount);
    }}