import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO

    public static boolean contains(String[] array, String value) {
        //this works
        for(int x = 0; x<= array.length-1; x++){
            if(array[x] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] arr = new String[array.length];
        int j = 0 ;
        for(int x = array.length - 1; x >= 0 ;x--){
            arr[j] = array[x];
            j++;
        }
        return arr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] arr = StringArrayUtils.reverse(array);
        if(Arrays.equals(arr, array)){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean pangramic = true;

        String complete = Arrays.toString(array);
        System.out.println(complete);
        String completeLowC = complete.toLowerCase();
        char[] charArr = completeLowC.toCharArray();
        char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < abc.length;i++){
            for(int j = 0; j < charArr.length;j++){
                if(abc[i] == charArr[j]){
                    break;
                }else if(j == charArr.length-1){
                    pangramic = false;
                }

            }
        }

        return pangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter = 0;
        for(int x = 0; x<= array.length-1; x++){
            if(array[x] == value){
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];
        int i = 0;
        for(int x = 0; x <= array.length-1;x++){
            if(array[x] != valueToRemove){
                newArray[i] = array[x];
                i++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List newArray = new ArrayList();
        String placeHolder = "";

        for(String value : array){
            if(!value.equals(placeHolder)){
                newArray.add(value);
                placeHolder = value;
            }

        }
        String[] finalString = new String[newArray.size()];
        newArray.toArray(finalString);
        //System.out.println(finalString);

        return finalString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List arr = new ArrayList();
        String placeHolder = "";
        for (int i = 0; i < array.length; i++) {
            if (i + 1 != array.length) {
                placeHolder = array[i];
                while (array[i].equals(array[i + 1])) {
                    placeHolder += array[i];
                    i++;
                    if (i + 1 == array.length) {
                        break;
                    }
                }
                arr.add(placeHolder);
            } else {
                arr.add(array[i]);
            }
        }
        String[] finalString = new String[arr.size()];
        arr.toArray(finalString);
        System.out.println(Arrays.toString(finalString));

        return finalString;

    }

}
