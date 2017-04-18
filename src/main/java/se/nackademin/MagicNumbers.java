package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;
//Ändringar
    public int calculateA() {
             if(name == null || name.isEmpty())
            return 0;
        int count = 0;
        for(int e = 0; e < name.length(); e++){
            if(name.charAt(e) == ' '){
                count++;
                while(name.charAt(e) != ' ' && e < name.length()-1){
                    e++;
                }
            }
        }
      
        int  resultA=count+1+age;
        if (resultA<=10)
            return resultA;      
       while(resultA>=10){
           resultA=resultA-7;
       }
        return resultA;
    }


   public int calculateB() {
       if(location == null || location.isEmpty())
            return 0;    
       int count = 0;
        for(int e = 0; e <= location.length()-1; e++){
            if(location.charAt(e) != ' '){
                count++;
               
            }
        }
       // return  count;
       int  resultB=count+income;
        if (resultB<=10)
            return resultB;
      
         while(resultB>=10){
           resultB=resultB-7;
          }        
         return resultB;    
    }        


    public int calculateC() {
      
         int resultC=calculateA()+calculateB();
            resultC =resultC-height;
            
            while(resultC<0){ 
                resultC= resultC+10;
            }
            
         
              return resultC;        


 }

    public int calculateD() {
           int resultD=calculateA();
       if (resultD>5 ){
            resultD=resultD+calculateB();
        }
        else if (resultD<=5 ){
            resultD=resultD+calculateC();
        }
        
        resultD=resultD-income;
           while(resultD<0){
            
                resultD= resultD+10;
           }  
                
     return  resultD;
    }

        public int calculateE() {
        long e = age;

        e *= income;

        e *= income;

        e *= height;

        double ef = Math.sqrt(e);

        while (ef >= 10) {

            ef /= 2.0;

            ef = Math.round(ef);
        }

        e = Math.round(ef);

        return (int) e;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
