package com.gl.Construction;

import java.util.Scanner;
import java.util.Stack;

public class ConstructionPlan_ArraysAndStacks {
    public static void main(String args[]) {
//Enquiring about the building size
        System.out.println("Enter the # floors you want to build:");
    	Scanner sc = new Scanner(System.in);
        int num_floors = sc.nextInt();
        System.out.println("Noted requirement for a " + num_floors+" floor building.");
        
//Taking input for day-wise manufacturing plan
        int floor_sizes[]= new int [num_floors+1];
        for (int i=0; i<num_floors;i++) {
        	System.out.println("Please enter the floor size to be manufactured on day:" +(i+1));
        	int floor_size = sc.nextInt();
        	floor_sizes[i]=floor_size;
        }
        sc.close();
//Displaying the day-wise manufacturing plan entered by the user
        System.out.println("So, your day-wise floor manufacturing plan is:");
        for (int i=0; i<num_floors;i++) {
        	System.out.println("Day: "+ (i+1));
        	System.out.println(floor_sizes[i]);
        }
//---START OF CONSTRUCTION PLAN LOGIC    
        int pending_size= num_floors;
        Stack<Integer> pending_floors = new Stack<Integer>();
        StackSorting s = new StackSorting();
        System.out.println("For the given day-wise floor manufacturing plan, the day-wise construction plan is:");
        for (int day=0; day<num_floors;day++) {//Because number of days available = number of floors
        	System.out.println("Day: "+ (day+1));
        	if (floor_sizes[day]==pending_size && pending_floors.isEmpty()) {//If the day-wise manufacturing plan is in the required sequence
        		System.out.println(floor_sizes[day]);
        		pending_size--;;
        	}
        	else {//If the day-wise manufacturing plan is NOT in the required sequence
        		pending_floors.push(floor_sizes[day]);
        		pending_floors=s.sort(pending_floors);//Sorting the WIP floors so that popping works
        		while(pending_floors.search(pending_size)>0) {
        			System.out.print(pending_floors.pop()+" ");
        			pending_size--;	
        		}	//If the pending size is available in the sorted pending floors, popping will happen
        		System.out.println();
        	}   
//---END OF CONSTRUCTION PLAN LOGIC
    }
}
}
