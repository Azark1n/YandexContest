package InternSheep2022.B;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<FlightItem> flights = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        String inputFileName = "src/InternSheep2022/B/input.txt";
        //String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        try(BufferedReader input = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName))){

            int numString = Integer.parseInt(input.readLine());
            for (int i = 0; i < numString; i++) {
                process(input.readLine().split(" "));
            }
            flights.sort((f1, f2) -> {
                int sortId = f1.id - f2.id;
                if (sortId == 0){
                    return f1.yearMinute - f2.yearMinute;
                } else
                    return sortId;
            });
            int currentFlight = 0;
            int currentTime = 0;
            int sum = 0;
            for (FlightItem flight : flights) {
                if (flight.stage == 1){
                    if (flight.id != currentFlight){
                        if (sum != 0){
//                            System.out.println(sum);
                            output.write(String.valueOf(sum));
                            output.write(" ");
                        }
                        currentFlight = flight.id;
                        sum = 0;
                    }
                    currentTime = flight.yearMinute;
                    currentFlight = flight.id;
                    continue;
                }
                if (flight.stage > 2) {
                    sum += flight.yearMinute - currentTime;
                }
            }
//            System.out.println(sum);
            output.write(String.valueOf(sum));
            output.write(" ");
        }
    }

    static void process(String[] strings) {
        //System.out.println(strings);
        int timeOtm = Integer.parseInt(strings[0]) * 1440 + Integer.parseInt(strings[1]) * 60 + Integer.parseInt(strings[2]);
        int stage = 0;
        switch (strings[4]){
            case "A":
                stage = 1;
                break;
            case "B":
                stage = 2;
                break;
            case "C":
                stage = 3;
                break;
            case "S":
                stage = 4;
                break;
        }
        flights.add(new FlightItem(Integer.parseInt(strings[3]), timeOtm, stage));


    }

    static class Flight {
        int id;
        ArrayList<FlightItem> flightItems = new ArrayList<>();
    }

    static class FlightItem {
        int id;
        int yearMinute;
        int stage;

        public FlightItem(int id, int yearMinute, int stage) {
            this.id = id;
            this.yearMinute = yearMinute;
            this.stage = stage;
        }
    }
}