package ru.netology;

class SQRService {
    public int occurrenceOfCount(int minRange, int maxRange) {
        int numberOccurence = 0;
        for (int i = 10; i <= 99; i++) {
            if (minRange <= i * i && i * i <= maxRange) {
                numberOccurence++;
            }
        }
        return numberOccurence;
    }
}