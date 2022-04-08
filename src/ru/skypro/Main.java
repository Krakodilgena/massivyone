package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Задание 1
        int [] weights = new int[3];
        weights [0] = 1;
        weights [1] = 2;
        weights [2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(weights[i]);

        }

        int firstWeights = weights [0];
        int secondWeights = weights [1];
        int thirdWeights = weights [2];
        System.out.println(firstWeights);
        System.out.println(secondWeights);
        System.out.println(thirdWeights);

        int [] reversFirst = {1, 2, 3};
        System.out.println(reversFirst);

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

        double [] reversSecond = {1.57, 7.654, 9.986};
        System.out.println(reversSecond);

        int [] length = new int [5];
        length [0] = 16;
        length [1] = 19;
        length [2] = 21;
        length [3] = 23;
        length [4] = 25;

        int firstLength = length [0];
        int secondLength = length [1];
        int thirdLength = length [2];
        int forthLength = length [3];
        int fifthLength = length [4];

        System.out.println(firstLength);
        System.out.println(secondLength);
        System.out.println(thirdLength);
        System.out.println(forthLength);
        System.out.println(fifthLength);

        int reversThird = {16, 19, 21, 23, 25};
        System.out.println(reversThird);
    }
}
