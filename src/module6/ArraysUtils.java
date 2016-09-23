package module6;

/**
 * Created by Vlad on 21.09.2016.
 */
 public class ArraysUtils {
    static final int secondLargest(int array[]) {
        int max = array[6];
        int secondLargest = array[6];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            }
            else if (secondLargest < array[i]) secondLargest = array[i];
        }
        return secondLargest;
    }

    static final double secondLargest(double array1[]) {
        double max = array1[6];
        double secondLargest = array1[6];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                secondLargest = max;
                max = array1[i];
            }
            else if (secondLargest < array1[i]) secondLargest = array1[i];
        }
        return secondLargest;
    }

    static final int modulus(int array[]) {
        int result = 0;
        int firstelement = array[0];
        int lastelement = array[array.length - 1];
        result = firstelement % lastelement;
        return result;
    }

    static final double modulus(double array1[]) {
        double result = 0;
        double firstelement = array1[0];
        double lastelement = array1[array1.length - 1];
        result = firstelement % lastelement;
        return result;
    }



    static final int maxpositive(int array[]) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static final double maxpositive(double array1[]) {

        double max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        return max;
    }

    static final int multiplication(int array[]) {
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication = multiplication * array[i];
        }
        return multiplication;

    }

    static final double multiplication(double array1[]) {
        double multiplication = 1;
        for (int i = 0; i < array1.length; i++) {
            multiplication = multiplication * array1[i];
        }
        return multiplication;

    }

    static final int summethod(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }

    static final double summethod(double array1[]) {
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        return sum;
    }

   public static final int minmaxmethodMax(int array[]) {
        int max1 = 0;
        int min1 = 0;

        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];



            }

        }
        return max1;

    }
    static final double minmaxmethodMax(double array1[]) {
        double max1 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (max1 < array1[i]) {
                max1 = array1[i];



            }

        }
        return max1;

    }


    static final int minmaxmethodmin(int array[]) {
        int min1 = 0;

        for (int i = 0; i < array.length; i++) {

            if (min1 > array[i]) {
                min1 = array[i];
            }




        }
        return min1;

    }

    static final double minmaxmethodmin(double array1[]) {
        double min1 = 0;

        for (int i = 0; i < array1.length; i++) {

            if (min1 > array1[i]) {
                min1 = array1[i];
            }




        }
        return min1;

    }
    public final static int[] findEvenElements(int[] array){
            int[] findEvenElements = new int[array.length];
            int counter = 0;
            for (int item : array) {
                if (item % 2 == 0) {
                    findEvenElements[counter] = item;
                    counter++;
                }
            }
            int[] findEvenElementsArray = new int[counter];
            System.arraycopy(findEvenElements, 0, findEvenElementsArray, 0, counter);
            return findEvenElementsArray;
        }


    private static final int lengthOfEven(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public final static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - i - 1];
        }
        return reverse;
    }


}
