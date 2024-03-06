package j1.s.p0011;
import java.math.*;
import java.util.*;
import java.*;
/**
 *
 * @author VPC
 */
public class Convert {
    public static final String HEX_DIGITS = "0123456789ABCDEF";
    private static BigDecimal convertAnotherToDecimal(String inputBaseNum, int inputBase){
        inputBaseNum = inputBaseNum.toUpperCase(); // chuyen a-f thanh A-F trong base 16
        BigDecimal outputDecNum = new BigDecimal("0"); // khai bao output
        BigDecimal baseNum = new BigDecimal(inputBase); // khai bao he so
        for(int i =0; i<inputBaseNum.length();i++){ // duyet tung so du
            char c = inputBaseNum.charAt(i); // lay so du (char) tai i
            int d = HEX_DIGITS.indexOf(c); // chuyen char -> int
            BigDecimal dNum= new BigDecimal(d);
            outputDecNum= outputDecNum.multiply(baseNum);
            outputDecNum= outputDecNum.add(dNum);
        }
        return outputDecNum;
    }
    
    private static String convertDecimalToAnother(BigDecimal inputDecNum, int outputBase){
        String outputBaseNumber = "";
        BigDecimal zero = new BigDecimal("0"); // khi nao thuong bang 0 thi dung lai
        BigDecimal baseNum= new BigDecimal(outputBase);
        while(inputDecNum.compareTo(zero)==1){
            //% chia lấy phần dư
            BigDecimal digit = inputDecNum.remainder(baseNum);
            String sdigit= digit.toString();
            int index = Integer.parseInt(sdigit);
            outputBaseNumber = HEX_DIGITS.charAt(index) +outputBaseNumber;
            inputDecNum = inputDecNum.divideToIntegralValue(baseNum);
            //inputDecNum = inputDecNum.divide(baseNum).setScale(0, RoundingMode.DOWN)
        }
        if(outputBaseNumber == ""){
            return outputBaseNumber = "0";
        }
        else
            return outputBaseNumber;
    }
    
    public static String ChangeBaseNumber(String inputBaseNum, int inputBase, int outputBase){
        BigDecimal decNum = convertAnotherToDecimal (inputBaseNum,inputBase);
        return convertDecimalToAnother(decNum, outputBase);
    }
}
