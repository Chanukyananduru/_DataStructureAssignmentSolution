package com.gl.Construction;

import java.util.Scanner;
public class ConstructionPlan_Simple {
    public static void main(String args[]) {
    	System.out.println("Enter the total number floors in the building : ");
    	Scanner sc = new Scanner(System.in);
        int num_floors = sc.nextInt();
        int mfg_schedule[] = new int[num_floors+1];
        for(int i=1;i<num_floors+1;i++){//Because num_days of construction = num_floors
            System.out.println("Enter the floor size given on day : "+i);
            int size=sc.nextInt();
            mfg_schedule[size]=i;
        }
        for(int i=1;i<num_floors+1;i++){
            System.out.println("The day on which size "+i+" will be manufactured is: ");
            System.out.println(mfg_schedule[i]);
        }
        sc.close();
        int floors_to_construct=num_floors;
        boolean availability;
        System.out.println("The order of construction is as follows ");
        for(int day=1;day<=num_floors;day++){
            availability=false;
            System.out.println("Day "+day+" :");
            while(floors_to_construct>=1 && mfg_schedule[floors_to_construct]<=day){
                availability=true;
                System.out.print(floors_to_construct +" ");
                floors_to_construct--;
            }
            if(availability==true){
                System.out.println();
            }
        }
    }
}
