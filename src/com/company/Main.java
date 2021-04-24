package com.company;
//
import java.io.IOError;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        public class Main {

            public static void main(String[] args) {

                String[][] arr = new String[][]{{"1", "2", "3", "4" }, {"4", "3", "2", "1" }, {"5", "6", "7", "8" }, {"8", "7", "6", "5" }};
                try {
                    try {
                        int result = method(arr);
                        System.out.println(result);
                    } catch (MyArraySizeException e) {
                        System.out.println("Превышен ращмер массива");
                    }
                } catch (MyArrayDataException e) {
                    System.out.println("Заданно неправильное значени массива");
                    System.out.println("Ошибка: " + e.i + "x" + e.j);
                }

            }


            public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
                int count = 0;
                if (arr.length != 4) {
                    throw new MyArraySizeException();
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                    for (int j = 0; j < arr[i].length; j++) {
                        try {
                            count = count + Integer.parseInt(arr[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }

                }
                return count;
            }

        }
    }
}