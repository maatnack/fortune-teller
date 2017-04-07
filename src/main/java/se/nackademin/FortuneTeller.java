package se.nackademin;

import se.nackademin.gui.FortuneTellerGui;

public class FortuneTeller {
    MagicNumbers magicNumbers;
    FortuneTellerGui fortuneTellerGui;

    /*
     * Returns a fortune based on name, income, location, age and height
     *
     * Calculates the magical numbers A-E, and then feeds these numbers to the Translator. The translator class returns
     * individual words which are fed into the magical template. The result of this operation is a scientifically
     * proven fortune.
     *
     * @return A scientifically proven fortune
     *
     */
    public String calculate() {
      
        //TODO: Implement String strA = null; 
      String strA = null;
      String strB = null;
      String strC = null;
      String strD = null;
      String strE = null;
     int numA= magicNumbers.calculateA();
        switch (numA) {
            case 0:
                strA=" stor";
                break;
            case 1:
                strA=" liten";
                break;
            case 2:
                strA="stark";
                break;
            case 3:
                strA=" svag";
                break;
            case 4:
                strA=" mjuk";
                break;
            case 5:
                strA=" hård";
                break;
            case 6:
                strA=" snabb";
                break;
            case 7:
                strA=" vacker";
                break;
            case 8:
                strA=" ljus";
                break;
            case 9:
                strA=" mörk";
                break;
            default:
                break;
        }
    
            
     int numB= magicNumbers.calculateB();
     
        switch (numB) {
            case 0:
                strB=" springa";
                break;
            case 1:
                strB=" ljuga";
                break;
            case 2:
                strB="flyga";
                break;
            case 3:
                strB=" se";
                break;
            case 4:
                strB=" vara";
                break;
            case 5:
                strB=" äta";
                break;
            case 6:
                strB=" mäta";
                break;
            case 7:
                strB="  gå";
                break;
            case 8:
                strB=" röra";
                break;
            case 9:
                strB="resa";
                break;
            default:
                break;
        }
    
       
     int numC= magicNumbers.calculateC();
        switch (numC) {
            case 0:
                strC=" en lönehöjning";
                break;
            case 1:
                strC="en lönesänkning ";
                break;
            case 2:
                strC=" en fotboja";
                break;
            case 3:
                strC=" en katt";
                break;
            case 4:
                strC=" en hund";
                break;
            case 5:
                strC="ett hus";
                break;
            case 6:
                strC=" ett barn";
                break;
            case 7:
                strC=" ett elstängsel";
                break;
            case 8:
                strC=" en dator";
                break;
            case 9:
                strC=" ett golv";
                break;
            default:
                break;
        }
     
     int numD= magicNumbers.calculateD();
        switch (numD) {
            case 0:
                strD=" springa";
                break;
            case 1:
                strD=" ljuga";
                break;
            case 2:
                strD=" flyga";
                break;
            case 3:
                strD=" se";
                break;
            case 4:
                strD=" vara";
                break;
            case 5:
                strD=" äta";
                break;
            case 6:
                strD=" mäta";
                break;
            case 7:
                strD=" gå";
                break;
            case 8:
                strD=" röra";
                break;
            case 9:
                strD=" resa";
                break;
            default:
                break;
        }
                

        return "Not implemented!";
    }

    public static void main(String[] args) {
        new FortuneTeller();
    }

    FortuneTeller() {
        fortuneTellerGui = new FortuneTellerGui(this);
        magicNumbers = new MagicNumbers();

    }

    public boolean setName(String name) {

        magicNumbers.setName(name);
        return name != null;
    }

    Integer convertToInteger(String input) {
        Integer output = null;
        try {
            output = Integer.valueOf(input);
        } catch (NumberFormatException numberFormatException) {
            //if an exception is caught we'll return null
        }
        return output;
    }

    public boolean setIncome(String income) {
        Integer incomeValue = convertToInteger(income);
        if (incomeValue == null) {
            return false;
        } else {
            magicNumbers.setIncome(incomeValue);
            return incomeValue<=10_000_000;
        }
    }

    public boolean setLocation(String location) {
        magicNumbers.setLocation(location);
        return location != null;
    }

    public boolean setAge(String age) {
        Integer ageValue = convertToInteger(age);
        if (ageValue == null) {
            return false;
        } else {
            magicNumbers.setAge(ageValue);
            return true;
        }
    }

    public boolean setHeight(String height) {
        Integer heightValue = convertToInteger(height);
        if (heightValue == null) {
            return false;
        } else {
            magicNumbers.setHeight(heightValue);
            return true;
        }
    }
}
