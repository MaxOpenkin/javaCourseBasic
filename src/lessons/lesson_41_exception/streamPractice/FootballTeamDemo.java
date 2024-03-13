package lessons.lesson_41_exception.streamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FootballTeamDemo {


    /*
    из коллекции команд отобрать:
    - самую сильную
    - все команды из Essen
     */
    public static void main(String[] args) {

        List<FootballTeam> footballTeams = Arrays.asList(
                new FootballTeam("Dusseldorf", 7),
                new FootballTeam("Essen", 4),
                new FootballTeam("Cologne", 5),
                new FootballTeam("Dortmund", 6),
                new FootballTeam("Bonn", 3),
                new FootballTeam("Berlin", 6),
                new FootballTeam("Leipzig", 5),
                new FootballTeam("Essen 2", 3),
                new FootballTeam("Essen 3", 3)
                );

        FootballTeam strongestTeam = footballTeams.stream()
                .max(Comparator.comparing(FootballTeam::getPower))
                .orElse(null);
        System.out.println("Самая сильная команда: " + strongestTeam);


        List<FootballTeam> teamsFromEssen = footballTeams.stream()
                .filter(team -> team.getName().contains("Essen"))
                .collect(Collectors.toList());

        System.out.println("Команды из Essen: " + teamsFromEssen);

    }
}
