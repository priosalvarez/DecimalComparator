public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        double scale = Math.pow(10,3);

        if(numberOne < 0){
            numberOne = Math.ceil(numberOne * scale)/scale;
        } else {
            numberOne = Math.floor(numberOne * scale)/scale;
        }

        if(numberTwo < 0){
            numberTwo = Math.ceil(numberTwo * scale)/scale;
        } else {
            numberTwo = Math.floor(numberTwo * scale)/scale;
        }
        //Compare the two numbers
        if(numberOne == numberTwo){
            return true;
        }

        return false;
    }
}
