package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Задание 1
        int [] weights = new int[3];
        weights [0] = 1;
        weights [1] = 2;
        weights [2] = 3;

        int firstWeights = weights [0];
        int secondWeights = weights [1];
        int thirdWeights = weights [2];
        System.out.println(firstWeights);
        System.out.println(secondWeights);
        System.out.println(thirdWeights);

        System.out.println();

        int [] reversFirst = {'1', '2', '3'};
        for (int i = reversFirst.length - 1; i >= 0 ; i--) {
            System.out.println(reversFirst[i]);
        }
        System.out.println();

        double [] weight = new double[3];
        weight [0] = 1.57;
        weight [1] = 7.654;
        weight [2] = 9.986;

        double firstWeight = weight [0];
        double secondWeight = weight [1];
        double thirdWeight = weight [2];

        System.out.println(firstWeight);
        System.out.println(secondWeight);
        System.out.println(thirdWeight);

        System.out.println();

        double [] reversSecond = {1.57, 7.654, 9.986};
        for (int i = reversSecond.length; i < 0; i--) {
            System.out.println(reversSecond[i]);
        }
        System.out.println();

        int [] power = new int [5];
        power [0] = 16;
        power [1] = 19;
        power [2] = 21;
        power [3] = 23;
        power [4] = 25;

        int firstPower = power [0];
        int secondPower = power [1];
        int thirdPower = power [2];
        int forthPower = power [3];
        int fifthPower = power [4];

        System.out.println(firstPower);
        System.out.println(secondPower);
        System.out.println(thirdPower);
        System.out.println(forthPower);
        System.out.println(fifthPower);

        System.out.println();

        char [] reversThird = {16, 19, 21, 23, 25};
        for (int i = reversThird.length; i < 0; i--) {
            System.out.println(reversThird[i]);
        }
        System.out.println();



    }
}
