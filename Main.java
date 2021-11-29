package Lesson2_JC;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)  throws MyArraySizeException, MyArrayDataException{

        try {
            ArrayString(4, 4);
        } catch (MyArraySizeException e) {
            System.out.println("Недопустимый размер массива");
        } catch (MyArrayDataException e) {
            System.out.println("Недопустмый элемент массива в ячейке " + e.i + e.j);
        }

    }

    public static void ArrayString(int i, int j) throws MyArraySizeException, MyArrayDataException {

        if (i != 4 || j != 4) {
            throw new MyArraySizeException("Array size != 4");
        }

            String[][] strArr = new String[i][j];
            for (i = 0; i < strArr.length; i++) {
                for (j = 0; j < strArr.length; j++) {
                   // strArr[i][j] = String.valueOf("p");
                    strArr[i][j] = "1";
                    strArr[0][2] = "j";

                }
            }
            System.out.println(Arrays.deepToString(strArr));

            int sum = 0;
            try {


                for (i = 0; i < strArr.length; i++) {
                    for (j = 0; j < strArr.length; j++) {
                        sum += Integer.parseInt(strArr[i][j]);
                    }
                }
                System.out.println(sum);
            } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                 }


        }
        }


