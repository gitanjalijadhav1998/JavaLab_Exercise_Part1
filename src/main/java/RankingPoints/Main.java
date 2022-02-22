package RankingPoints;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void printSortedList(ArrayList<FootballTeam> footballTeamList, ArrayList<BasketballTeam> basketballTeamList) {
        Collections.sort(basketballTeamList, new Sortbypoints());
        Collections.sort(footballTeamList, new Sortbypoints1());

        System.out.println("\nSorted Basketball team : ");
        System.out.println("Team Name\tPoints");
        for (int i=0; i<basketballTeamList.size(); i++){
            System.out.println(basketballTeamList.get(i).getTeamName()+"\t"+basketballTeamList.get(i).getPoints());
        }

        System.out.println();
        System.out.println("\nSorted Football team : ");
        System.out.println("Team Name\tPoints\tSponsor");
        for (int i=0; i<footballTeamList.size(); i++){
            System.out.println(footballTeamList.get(i).getTeamName()+"\t"+footballTeamList.get(i).getPoints()+"\t"+footballTeamList.get(i).getSponsor());
        }
    }
    public static void makeTeam(ArrayList<FootballTeam> footballTeamList, ArrayList<BasketballTeam> basketballTeamList){
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\211619\\Downloads\\JAVA LAB\\JAVA LAB\\exercise3\\teams.csv"));

            while ((line = reader.readLine()) != null)
            {

                String teamRecord[] = line.split(",");

                System.out.println(teamRecord[0] + " " + teamRecord[1] + " " + Integer.parseInt(teamRecord[2]) );

                if (teamRecord[0].equalsIgnoreCase("Basketball")) {
                    BasketballTeam basketballTeam = new BasketballTeam(teamRecord[1], Integer.parseInt(teamRecord[2]));
                    basketballTeamList.add(basketballTeam);

                }
                else {
                    FootballTeam footballTeam = new FootballTeam(teamRecord[1] ,Integer.parseInt(teamRecord[2]),teamRecord[3]);
                    footballTeamList.add(footballTeam);

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void getResult(ArrayList<FootballTeam> footballTeamList, ArrayList<BasketballTeam> basketballTeamList){
        String line="";
        try {
            BufferedReader resultreader = new BufferedReader(new FileReader("C:\\Users\\211619\\Downloads\\JAVA LAB\\JAVA LAB\\exercise3\\results.csv"));
            ArrayList<String[]> str = new ArrayList<>();

            System.out.println("\nResult FIle : ");
            while ((line = resultreader.readLine()) != null) {
                String resultDetails[] = line.split(",");
                System.out.println(resultDetails[0] + " " + resultDetails[1]);
                str.add(resultDetails);
            }

            for (int i=0;i< str.size();i++){
                int j=0;
                for (int l=0;l < footballTeamList.size();l++){
                    if(footballTeamList.get(l).getTeamName().equals(str.get(i)[0])){
                        footballTeamList.get(l).updatePoints(str.get(i)[1]);
                        j++;
                    }
                }

                if(j==0)
                {
                    for (int l=0;l< basketballTeamList.size();l++){
                        if(basketballTeamList.get(l).getTeamName().equals(str.get(i)[0])){
                            basketballTeamList.get(l).updatePoints(str.get(i)[1]);
                        }
                    }
                }
            }
            System.out.println("-----------------------------------------------------");
            System.out.println("Updated Points : ");
            printSortedList(footballTeamList,basketballTeamList);
        }catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<BasketballTeam> basketballTeamList = new ArrayList<BasketballTeam>();
        ArrayList<FootballTeam> footballTeamList = new ArrayList<FootballTeam>();

        String op;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Load teams parameters from teams.csv file; for each line define the instance for a team; \n" +
                    "2. Print standing of Football teams & Basketball teams (ordering by points); \n" +
                    "3. Load results of the last matches from results.csv file and update teams points based on loaded results; \n" +
                    "4. Print new standing of Football teams and Basketball teams(ordering by points); \n" +
                    "5. Exit");
            System.out.println("Enter your choice from above option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("***********Teams created successfully*************");
                    main.makeTeam(footballTeamList,basketballTeamList);

                    break;
                case 2:
                    System.out.println("*****************Standing of Teams*****************");
                    main. printSortedList(footballTeamList,basketballTeamList);
                    break;
                case 3:
                    System.out.println("Results of the last matches from results.csv file loaded successfully");
                    main.getResult(footballTeamList,basketballTeamList);

                    break;

                case 4:
                    System.out.println("***********New Standing after updating points*********************");
                    main.printSortedList(footballTeamList,basketballTeamList);
                    break;

                default:
                    System.out.println("Please enter correct choice.");
                    break;

            }
            scanner = new Scanner(System.in);
            System.out.println("Do you want to continue enter y/n :");
            op = scanner.nextLine();

        }while(op.equalsIgnoreCase("y"));


    }

}
