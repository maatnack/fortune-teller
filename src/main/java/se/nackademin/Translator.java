/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author maa
 */
public class Translator {
    MagicNumbers magicNumbers;
    
   public  String adjektiv(int numA) {
       String strA = null;
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
       return strA;
   }   
   public  String verb(int numB) { 
       String strB = null;
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

   return strB;
           }   
   public  String substantiv(int numC) { 
        String strC = null;
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
        return strC;
    } 
  
} 
   
     
