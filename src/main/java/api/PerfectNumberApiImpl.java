package api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberApiImpl implements PerfectNumber {

    private static final Logger LOGGER = LogManager.getLogger(PerfectNumberApiImpl.class.getName());

    @Override
    public String checkPerfectNumber(Integer number) {
        int i = 1;
        int sum = 0;
        while(i < number) {
            if(number % i == 0)  {
                sum = sum + i;
            }
            i++;
        }
        if (sum == number) {
            LOGGER.info("{} is a Perfect Number", number);
            return number + " is a Perfect Number";
        }
        else {
            LOGGER.info("{} is NOT a Perfect Number", number);
            return number + " is NOT a Perfect Number";
        }
    }

    @Override
    public String getPerfectNumberForRange(Integer min, Integer max){
        int i, number, sum;
        List<Integer> perfNumbers = new ArrayList<>();
        if (min > max){
            return "Enter a valid range : 400";
        }
        for(number = min; number <= max; number++) {
            for(i = 1, sum =0; i < number; i++)  {
                if(number % i == 0)  {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                perfNumbers.add(number);
            }
        }
        if(perfNumbers.isEmpty()) {
            LOGGER.info("No Perfect Numbers in the given range");
            return "No Perfect Numbers in the given range";
        }
        LOGGER.info("Perfect numbers in the range {} and {} are : {} ", min, max, perfNumbers);
        return "Perfect numbers in the range " +min+ " and " +max+ " are : " + perfNumbers;
    }
}

