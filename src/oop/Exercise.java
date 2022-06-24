package oop;



import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/*
1.1. Na podstawie wszystkich dostępnych lig zwróć wszystkich treneerów
1.2. Na podstawie wszystkich dostępnych lig zwróć nazwiska wszystkich trenenerów mających co najmniej 50 lat
1.3. Na podstawie wszystkich dostępnych lig zwróć wszystkich trenenerów mających co najwyżej 30 lat
1.4. Na podstawie wszystkich dostępnych lig zwróć wszystkich trenenerów narodowości niemieckiej
1.5. Na podstawie wszystkich dostępnych lig zwróć wszystkich piłkarzy
1.6. Na podstawie wszystkich dostępnych lig zwróć wszystkich piłkarzy - atakujacych
1.7.  Na podstawie wszystkich dostępnych lig zwróć imiona wszystkich piłkarzy - obrońców mających mniej niż 30 lat
1.8. Na podstawie wszystkich dostępnych lig zwróć wszystkich piłkarzy - bramkarzy mających co najmniej 50 lat
1.9. Na podstawie wszystkich dostępnych lig zwróć wszystkie kluby
1.10. Na podstawie wszystkich dostępnych lig zwróć wszystkie kluby zawierające co najmniej 2 piłkarzy
 */
public class Exercise {

    public static void main(String[] args) {
        //PL
        //Pogoń
        List<FootballPlayer> pogonPlayers = Arrays.asList
                (new FootballPlayer("Adam", "Buksa", Position.PO, LocalDate.of(1996, 7, 12)),
                        new FootballPlayer("Dante", "Stipica", Position.BR, LocalDate.of(1990, 12, 12)),
                        new FootballPlayer("Kožulj", "Kožulj", Position.PO, LocalDate.of(1993, 11, 15)),
                        new FootballPlayer("Michał", "Łasicki", Position.OB, LocalDate.of(1995, 6, 26)));
        FootballManager pogonManager = new FootballManager("Kosta", "Runjaić", "Niemcy", LocalDate.of(1971, 6, 4));
        FootballTeam pogonTeam = new FootballTeam("Pogoń", pogonPlayers, pogonManager, 71);
        //Legia
        List<FootballPlayer> legiaPlayers = Arrays.asList
                (new FootballPlayer("José", "Kanté", Position.NA, LocalDate.of(1990, 9, 27)),
                        new FootballPlayer("Radosław", "Majecki", Position.BR, LocalDate.of(1999, 11, 16)),
                        new FootballPlayer("Tomasz", "Jodłowiec", Position.PO, LocalDate.of(1985, 9, 8)),
                        new FootballPlayer("Lewczuk", "Lewczuk", Position.OB, LocalDate.of(1985, 5, 30)));
        FootballManager legiaManager = new FootballManager("Aleksandar", "Vuković", "Serbia", LocalDate.of(1979, 8, 25));
        FootballTeam legiaTeam = new FootballTeam("Legia", legiaPlayers, legiaManager, 103);
        //Lech
        List<FootballPlayer> lechPlayers = Arrays.asList
                (new FootballPlayer("Paweł", "Tomczyk", Position.NA, LocalDate.of(1998, 5, 4)),
                        new FootballPlayer("Mickey", "van der Hart", Position.BR, LocalDate.of(1994, 6, 13)),
                        new FootballPlayer("Kamil", "Jóźwiak", Position.PO, LocalDate.of(1988, 4, 22)),
                        new FootballPlayer("Robert", "Gumny", Position.OB, LocalDate.of(1998, 6, 4)));
        FootballManager lechManager = new FootballManager("Dariusz", "Żuraw", "Polska", LocalDate.of(1972, 11, 14));
        FootballTeam lechTeam = new FootballTeam("Lech", lechPlayers, lechManager, 99);

        FootballLeage ekstraklasa = new FootballLeage("Ekstraklasa", "Polska", 1, Arrays.asList(pogonTeam, legiaTeam, lechTeam));

        //DE
        //Borussia
        List<FootballPlayer> borussiaPlayers = Arrays.asList
                (new FootballPlayer("Marco", "Reus", Position.PO, LocalDate.of(1989, 5, 31)),
                        new FootballPlayer("Roman", "Bürki", Position.BR, LocalDate.of(1990, 11, 14)),
                        new FootballPlayer("Paco", "Alcácer", Position.NA, LocalDate.of(1993, 8, 30)),
                        new FootballPlayer("Łukasz", "Piszczek", Position.OB, LocalDate.of(1985, 6, 3)));
        FootballManager borussiaManager = new FootballManager("Lucien", "Favre", "Szwajcaria", LocalDate.of(1957, 11, 2));
        FootballTeam borussiaTeam = new FootballTeam("Borussia", borussiaPlayers, borussiaManager, 110);
        //Bayern
        List<FootballPlayer> bayernPlayers = Arrays.asList
                (new FootballPlayer("Robert", "Lewandowski", Position.NA, LocalDate.of(1988, 8, 21)),
                        new FootballPlayer("Manuel", "Neuer", Position.BR, LocalDate.of(1986, 3, 27)),
                        new FootballPlayer("Javi", "Martínez", Position.PO, LocalDate.of(1988, 9, 2)),
                        new FootballPlayer("Joshua", "Kimmich", Position.OB, LocalDate.of(1995, 2, 8)));
        FootballManager bayernManager = new FootballManager("Niko", "Kovač", "Chorwacja", LocalDate.of(1971, 10, 15));
        FootballTeam bayernTeam = new FootballTeam("Bayern", bayernPlayers, bayernManager, 119);
        //Wolfsburg
        List<FootballPlayer> wolfsburgPlayers = Arrays.asList
                (new FootballPlayer("Wout", "Weghorst", Position.NA, LocalDate.of(1992, 8, 7)),
                        new FootballPlayer("Koen", "Casteels", Position.BR, LocalDate.of(1992, 6, 25)),
                        new FootballPlayer("Ignacio", "Camacho", Position.PO, LocalDate.of(1990, 5, 4)),
                        new FootballPlayer("Paul", "Verhaegh", Position.OB, LocalDate.of(1983, 9, 1)));
        FootballManager wolfsburgManager = new FootballManager("Oliver", "Glasner", "Austria", LocalDate.of(1974, 8, 28));
        FootballTeam wolfsburgTeam = new FootballTeam("Wolfsburg", wolfsburgPlayers, wolfsburgManager, 74);

        FootballLeage bundesliga = new FootballLeage("Bundesliga", "Niemcy", 1, Arrays.asList(borussiaTeam, bayernTeam, wolfsburgTeam));

        //ostateczna agregacja
        List<FootballLeage> europeanLeagues = Arrays.asList(ekstraklasa, bundesliga);
        List<FootballManager> _1_1 = (List<FootballManager>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).map((FootballTeam t) -> {
            return t.getManager();
        }).collect(Collectors.toList());
        System.out.println(_1_1);
        List<String> _1_2 = (List<String>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).map((FootballTeam t) -> {
            return t.getManager();
        }).filter((FootballManager m) -> {
            return m.getDateOfBirth().getYear() >= (LocalDate.now().getYear() - 50);
        }).map((FootballManager l) -> {
            return l.getName();
        }).collect(Collectors.toList());
        System.out.println(_1_2);
        List<FootballManager> _1_3 = (List<FootballManager>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).map((FootballTeam t) -> {
            return t.getManager();
        }).filter((FootballManager m) -> {
            return m.getDateOfBirth().getYear() <= (LocalDate.now().getYear() - 30);
        }).collect(Collectors.toList());
        System.out.println(_1_3);
        List<FootballManager> _1_4 = (List<FootballManager>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).map((FootballTeam t) -> {
            return t.getManager();
        }).filter((FootballManager m) -> {
            return m.getNationality().equals("Niemcy");
        }).collect(Collectors.toList());
        System.out.println(_1_4);
        List<FootballPlayer> _1_5 = (List<FootballPlayer>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).flatMap((FootballTeam t) -> {
            return t.getPlayers().stream();
        }).collect(Collectors.toList());
        System.out.println(_1_5);
        List<FootballPlayer> _1_6 = (List<FootballPlayer>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
                    return l.getTeams().stream();
                }).flatMap((FootballTeam t) -> {
                    return t.getPlayers().stream();
                }).filter((FootballPlayer p) -> {
                    return p.getPosition().equals(Position.NA);
                })
                .collect(Collectors.toList());
        System.out.println(_1_6);
        List<String> _1_7 = (List<String>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
                    return l.getTeams().stream();
                }).flatMap((FootballTeam t) -> {
                    return t.getPlayers().stream();
                }).filter((FootballPlayer p) -> {
                    return p.getPosition().equals(Position.OB) && p.getDateOfBirth().getYear() >= (LocalDate.now().getYear() - 30);
                }).map((FootballPlayer p) -> {
                    return p.getName();
                })
                .collect(Collectors.toList());
        System.out.println(_1_7);
        List<FootballPlayer> _1_8 = (List<FootballPlayer>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
                    return l.getTeams().stream();
                }).flatMap((FootballTeam t) -> {
                    return t.getPlayers().stream();
                }).filter((FootballPlayer p) -> {
                    return p.getPosition().equals(Position.BR) && p.getDateOfBirth().getYear() <= (LocalDate.now().getYear() - 50);
                })
                .collect(Collectors.toList());
        System.out.println(_1_8);
        List<FootballTeam> _1_9 = (List<FootballTeam>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).collect(Collectors.toList());
        System.out.println(_1_9);
        List<FootballTeam> _1_10 = (List<FootballTeam>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
                    return l.getTeams().stream();
                }).filter((FootballTeam t) -> {
                    return t.getPlayers().size() >= 2;
                })
                .collect(Collectors.toList());
        System.out.println(_1_10);
        List<FootballManager> _1_11 = (List<FootballManager>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).map((FootballTeam t) -> {
            return t.getManager();
        }).filter((FootballManager m) -> {
            return m.getNationality().equals("Brazylia");
        }).collect(Collectors.toList());
        System.out.println(_1_11);

        List<FootballLeage> _1_12 = (List<FootballLeage>) europeanLeagues.stream().filter((FootballLeage l) -> {
            return l.getCountry().equals("Polska");
        }).collect(Collectors.toList());
        System.out.println(_1_12);

        List<FootballTeam> _1_13 = (List<FootballTeam>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
            return l.getTeams().stream();
        }).filter((FootballTeam t) -> {
            return t.getAge() > 50;
        }).collect(Collectors.toList());
        System.out.println(_1_13);

        List<FootballLeage> _1_14 = (List<FootballLeage>) europeanLeagues.stream().filter((FootballLeage l) -> {
            return l.getTeams().size() >= 3;
        }).collect(Collectors.toList());
        System.out.println(_1_14);

        List<FootballLeage> _1_15 = (List<FootballLeage>) europeanLeagues.stream().filter((FootballLeage l) -> {
            return l.getLevel() == 1;
        }).collect(Collectors.toList());
        System.out.println(_1_15);
        //List<FootballManager> _1_16 = (List<FootballManager>) europeanLeagues.stream().flatMap((FootballLeage l) -> {
     //       return l.getTeams().stream();
     //   }).map((FootballTeam t) -> {
        //    return t.getManager();
      //  }).filter((FootballManager m) -> {
         //   return m.getNationality().equals("Polska")&& m.getName().equals("Adam");
        //}).findFirst()
          //      .orElseThrow(()->{
               //     return new NoSuchElementException();
           //     });
        List<FootballTeam> _1_17 = (List<FootballTeam>) europeanLeagues.stream().filter((FootballLeage l) -> {
            return l.getCountry().equals("Niemcy");
        }).flatMap((FootballLeage l)->{
            return l.getTeams().stream();
                })
                .findAny()
                .orElse(new FootballTeam("kupa",Arrays.asList(),null,Integer.MIN_VALUE));

        System.out.println(_1_17);

    }
}

class FootballPlayer {
    private final String name;
    private final String lastName;
    private final Position position;
    private final LocalDate dateOfBirth;

    public FootballPlayer(String name, String lastName, Position position, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

class FootballManager {
    private final String name;
    private final String lastName;
    private final String nationality;
    private final LocalDate dateOfBirth;

    public FootballManager(String name, String lastName, String nationality, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "FootballManager{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

class FootballTeam {
    private final String name;
    private final List<FootballPlayer> players;
    private final FootballManager manager;
    private final int age; //wiek klubu

    public FootballTeam(String name, List<FootballPlayer> players, FootballManager manager, int age) {
        this.name = name;
        this.players = players;
        this.manager = manager;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public List<FootballPlayer> getPlayers() {
        return players;
    }

    public FootballManager getManager() {
        return manager;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", manager=" + manager +
                ", age=" + age +
                '}';
    }
}

class FootballLeage {
    private final String name;
    private final String country;
    private final int level; //poziom rozgrywek
    private final List<FootballTeam> teams;

    public FootballLeage(String name, String country, int level, List<FootballTeam> teams) {
        this.name = name;
        this.country = country;
        this.level = level;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getLevel() {
        return level;
    }

    public List<FootballTeam> getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        return "FootballLeage{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", level=" + level +
                ", teams=" + teams +
                '}';
    }
}

enum Position {
    BR,//bramkarz
    PO,//pomocnik
    OB,//obrońca
    NA//napastnik
}

