package se.nackademin;

import se.nackademin.gui.FortuneTellerGui;

public class FortuneTeller {
    MagicNumbers magicNumbers;
    FortuneTellerGui fortuneTellerGui;
    Translator translator;
    
    
    public String calculate() {
       
     int  numA= magicNumbers.calculateA();
     String  wordA =translator.totalCalculateA(numA);
    
    int numB= magicNumbers.calculateB();
    String  wordB =translator.totalCalculateA(numB);
    
    int numC= magicNumbers.calculateC();
    String  wordC =translator.totalCalculateA(numC);
   
    int numD= magicNumbers.calculateD();
    String  wordD =translator.totalCalculateA(numD);
    
    int numE= magicNumbers.calculateE();
    String  wordE =translator.totalCalculateA(numE);
        
        
     return"Din framtid är "+wordA+".Du borde sluta " + wordB+". Vi ser att du snart kommer att skaffa "
             + wordC+".Snart kommer du vilja "+wordD+",men då är det viktigt att du är "+ wordE+".";  
    
        
    }
    
    
    
  
    public static void main(String[] args) {
        new FortuneTeller();
      
    }

    FortuneTeller() {
        fortuneTellerGui = new FortuneTellerGui(this);
        magicNumbers = new MagicNumbers(); 
       translator= new Translator();
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
