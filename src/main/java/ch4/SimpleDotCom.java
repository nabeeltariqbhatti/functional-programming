package ch4;


import java.util.Arrays;
 class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        } // out of the loop
        if (numOfHits ==
                locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    } // close method
}

class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        while(true){

            String guess =String.valueOf((int) ((Math.random() * locations.length)));

            String result = dot.checkYourself(userGuess);


            if(result == "kill")break;
        }
        System.out.println("You guessed it");

    }
}