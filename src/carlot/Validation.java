/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlot;

/**
 *
 * @author AlexC
 */
public class Validation {
    private static final int MIN_YEAR_IN_OK_RANGE = 1950;
    private static final int MAX_YEAR_IN_OK_RANGE = 2025;
    
    public static String validateYearValue(int year){
        if(year < MIN_YEAR_IN_OK_RANGE || year > MAX_YEAR_IN_OK_RANGE){
            return "Year value must be between 1950 and 2025.";
        }else{
            return "";
        }
        
    //public static String validateVINLength(String vin){vin length should be 17}    
    
    //public static String validateMileageValue(int mileage){needs to be above 0 and below 400,000} 
    
    //public static String validateMpgValue(int mpg){needs to be above -1 (0 for electric car) and below 60}
        
    //public static String validateCostAndPrice(double costOrPrice){needs to be above -1 and below 300,000.00}
    
    //public static String validateDate(LocalDate date){// date should be after Jan 1 2010 but no later than whatever  is"today's date"} 
    
    
    }
            
}
