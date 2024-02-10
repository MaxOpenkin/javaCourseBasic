package lessons.lesson_18_poker.businessLogica;

import lessons.lesson_06_scanner_Random.scanner.UserInput;
import lessons.lesson_18_poker.entity.Card;
import lessons.lesson_18_poker.entity.CardDeck;
import lessons.lesson_18_poker.entity.Player;
import lessons.lesson_18_poker.service.CardTableService;
import lessons.lesson_18_poker.service.DeckService;
import lessons.lesson_18_poker.service.PrintService;

public class CardTable {

    UserInput userInput = new UserInput();

    CardDeck cardDeck = new CardDeck();

    CardTableService tableService = new CardTableService();

    DeckService service = new DeckService();

    PrintService printService = new PrintService();

    Player[] players;


    public void game(){

        service.fillDeck(cardDeck.getDeck());

        printService.printDeck(cardDeck.getDeck(), "Печать оригинальной колоды карт");

        Card[] deckShuffle = service.deckShuffle(cardDeck.getDeck());
        printService.printDeck(deckShuffle, "Печать перемешенной колоды карт");

        int numberPlayers = userInput.inputInteger("введите количество игроков: ");

        players= new Player[numberPlayers];

        tableService.createPlayers(players);

        tableService.dealCards(deckShuffle, 5,players);

        printService.printPlayers(players);

        printService.printDeck(deckShuffle,"колода карт после раздачи игрокам");

        tableService.removeCardsFromDeck(deckShuffle,5, players.length);

        printService.printDeck(deckShuffle,"колода карт после раздачи и удаления карт из колоды");


        System.out.println("ПОСМОТРИМ ЕЩЕ РАЗ НА КАРТЫ ИГРОКОВ!");

        printService.printPlayers(players);

        printService.printDeck(cardDeck.getDeck(), "первоначальная колода");


    }

}
