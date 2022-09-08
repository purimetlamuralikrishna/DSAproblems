import java.lang.*;
import java.util.*;

class  CodingCompetition{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int numberOfOperations = sc.nextInt();
        
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> clubQue1 = new LinkedList<>();
        Queue<Integer> clubQue2 = new LinkedList<>();
        Queue<Integer> clubQue3 = new LinkedList<>();
        Queue<Integer> clubQue4 = new LinkedList<>();
        
        while(numberOfOperations--!=0){
            
        char operation = sc.next().charAt(0);
        
       
        
        if(operation=='E'){
            
           int club = sc.nextInt();
           int rollNo = sc.nextInt();
           
           if(que.isEmpty()||!que.contains(club)){
               que.add(club);
           }
           switch(club){
               case 1:
                clubQue1.add(rollNo);
                   break;
               case 2:
                clubQue2.add(rollNo);  
                   break;
               case 3:
                clubQue3.add(rollNo);   
                   break;
               default:
               clubQue4.add(rollNo);
           }
           
        }
        else{
            int value = que.peek();
            switch(value){
               case 1:
                System.out.println(1+" "+clubQue1.remove());
                if(clubQue1.isEmpty()){
                    que.remove();
                }
                   break;
               case 2:
                System.out.println(2+" "+clubQue2.remove());
                if(clubQue2.isEmpty()){
                    que.remove();
                }  
                   break;
               case 3:
                System.out.println(3+" "+clubQue3.remove());
                if(clubQue3.isEmpty()){
                    que.remove();
                }   
                   break;
               default:
               System.out.println(4+" "+clubQue4.remove());
                if(clubQue4.isEmpty()){
                    que.remove();
                }
           } 
        }
        }
    }
}