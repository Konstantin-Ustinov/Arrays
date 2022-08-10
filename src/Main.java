public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr1 = new int[3];
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'A', 'B', 'C', 'D',};
        initializationArray(arr1);
        System.out.println("Массивы созданы.");

        System.out.println("Задание 2");
        printArrayForward(arr1);
        printArrayForward(arr2);
        printArrayForward(arr3);

        System.out.println("Задание 3");
        printArrayReverse(arr1);
        printArrayReverse(arr2);
        printArrayReverse(arr3);

        System.out.println("Задание 4");
        oddToEven(arr1);
    }

    private static void initializationArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
    }

    private static void printArrayForward(int[] arr) {
        if (arr == null) {
            System.out.println("Массив не инициализирован");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(i != arr.length-1) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void printArrayForward(double[] arr) {
        if (arr == null) {
            System.out.println("Массив не инициализирован");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(i != arr.length-1) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void printArrayForward(char[] arr) {
        if (arr == null) {
            System.out.println("Массив не инициализирован");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(i != arr.length-1) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void printArrayReverse(int[] arr) {
        if (arr == null) {
            System.out.println("Массив не инициализирован");
        } else {
            for (int i = arr.length-1; i >= 0; i--) {
                if(i != 0) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void printArrayReverse(double[] arr) {
        if (arr == null) {
            System.out.println("Массив не инициализирован");
        } else {
            for (int i = arr.length-1; i >= 0; i--) {
                if(i != 0) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void printArrayReverse(char[] arr) {
        if (arr == null) {
            System.out.println("Массив не инициализирован");
        } else {
            for (int i = arr.length-1; i >= 0; i--) {
                if(i != 0) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void oddToEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        printArrayForward(arr);
    }

}