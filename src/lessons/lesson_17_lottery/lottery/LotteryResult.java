package lessons.lesson_17_lottery.lottery;

import java.util.Arrays;

public class LotteryResult {

    public void checkLotteryResult(Lottery lottery, Player player) {
        // провести проверку выигрышных номеров и сравнить с номерами в билетах игрока

        // Получаем выигрышные номера лотереи:
        int[] winnerNumbers = lottery.getWinnerNumbers();

        Arrays.sort(winnerNumbers);

        // Получить билеты от игрока:
        LotteryTicket[] tickets = player.getTickets();

        System.out.println("Результат проверки для игрока: " + player.getIdCode());

        // Проводим проверку каждого билета:

        for (int i = 0; i < tickets.length; i++) {

            // Получили номера из текущего билета:

            int matchCounter = 0;
            int[] numbersFromCurrentTicket = tickets[i].getTicketNumbers();

            // Сравнить эти номера и выигрышные и сказать сколько совпадений:

            for (int j = 0; j < numbersFromCurrentTicket.length; j++) {
                if (Arrays.binarySearch(winnerNumbers, numbersFromCurrentTicket[j]) >= 0) {
                    matchCounter++;
                }
            }
            // Вывод количества совпадений в билете:
            System.out.println("Номер билета " + (i + 1) + " имеет " + matchCounter + " выигрышных номеров");
        }
    }
}
