package RankingPoints;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


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

    public static void main(String[] args) {
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\211619\\Downloads\\JAVA LAB\\JAVA LAB\\exercise3\\teams.csv"));

            ArrayList<BasketballTeam> basketballTeamList = new ArrayList<BasketballTeam>();
            ArrayList<FootballTeam> footballTeamList = new ArrayList<FootballTeam>();

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
            System.out.println();
            System.out.println("Basketball Team : ");
            for (int i=0; i<basketballTeamList.size(); i++){
                System.out.println(basketballTeamList.get(i).getTeamName() + " " + basketballTeamList.get(i).getPoints());

            }
            System.out.println();
            System.out.println("Football Team : ");
            for (int i=0; i<basketballTeamList.size(); i++){
                System.out.println(footballTeamList.get(i).getTeamName() + " " + footballTeamList.get(i).getPoints());

            }
            System.out.println();
            printSortedList(footballTeamList,basketballTeamList);


            BufferedReader resultreader = new BufferedReader(new FileReader("C:\\Users\\211619\\Downloads\\JAVA LAB\\JAVA LAB\\exercise3\\results.csv"));
            ArrayList<String[]> str = new ArrayList<>();

            System.out.println("\nResult FIle : ");
            while ((line = resultreader.readLine()) != null) {
                String resultDetails[] = line.split(",");
                System.out.println(resultDetails[0]+" " + resultDetails[1]);
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


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
