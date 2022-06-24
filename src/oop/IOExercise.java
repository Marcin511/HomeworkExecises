package oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOExercise {

    public static void main(String[] args) {
        //.skip(1) -> pominięcie pierwszej lini
        getCities()
                .forEach((City city) -> {
                    System.out.println(city);
                });
        //2
        List<String> _2 = getCities().map((City c) -> {
            return c.getNameAscii();
        }).collect(Collectors.toList());
        System.out.println(_2);
        //3
        List<Coordinates> _3 = getCities().map((City c) -> {
            return new Coordinates(c.getLat(), c.getLog());
        }).collect(Collectors.toList());
        System.out.println(_3);

        List<String> _4 = getCities().map((City c) -> {
            return c.getName();
        }).collect(Collectors.toList());
        System.out.println(_4);
        List<String> _5 = getCities().map((City c) -> {
                    return c.getCountry();
                }).distinct()
                .collect(Collectors.toList());
        System.out.println(_5);
        List<String> _6 = getCities().map((City c) -> {
            return c.getAdmin();
        }).collect(Collectors.toList());
        System.out.println(_6);
        //7
        List<Long> _7 = getCities().map((City c) -> {
            return c.getPopulation();
        }).collect(Collectors.toList());
        System.out.println(_7);
        //8
        List<String> _8 = getCities().filter((City c) -> {
            return c.getPopulation() > 100000;
        }).map((City c) -> {
            return c.getName();
        }).collect(Collectors.toList());
        //9
        List<String> _9 = getCities().filter((City c) -> {
            return c.getPopulation() > 200000;
        }).map((City c) -> {
            return c.getCountry();
        }).collect(Collectors.toList());
        System.out.println(_9);
        //10
        List<String> _10 = getCities().filter((City c) -> {
            return c.getPopulation() < 20000;
        }).map((City c) -> {
            return c.getCountry();
        }).collect(Collectors.toList());
        System.out.println(_10);
        //11
        List<String> _11 = getCities().filter((City c) -> {
            return c.getName().startsWith("A");
        }).map((City c) -> {
            return c.getName();
        }).collect(Collectors.toList());
        System.out.println(_11);
        //12
        List<String> _12 = getCities().filter((City c) -> {
            return c.getName().contains("z") || c.getName().contains("Z");
        }).map((City c) -> {
            return c.getName();
        }).collect(Collectors.toList());
        System.out.println(_12);
        //13
        List<String> _13 = getCities().filter((City c) -> {
            return c.getCountry().equals("Pakistan");
        }).map((City c) -> {
            return c.getName();
        }).collect(Collectors.toList());
        System.out.println(_13);
        //14
        List<String> _14 = getCities().filter((City c) -> {
            return c.getCountry().equals("Russia");
        }).map((City c) -> {
            return c.getName();
        }).collect(Collectors.toList());
        System.out.println(_14);
        //15
        //Map<String,Integer> _15 = getCities().map((City c,City n) -> {
        //  return c.getCountry()n.getCountry().size();
        // }).collect(Collectors.toList());
        //System.out.println(_15);
        //16
        List<String> _16 = getCities().map((City c) -> {
            return c.getCapitol();
        }).collect(Collectors.toList());
        System.out.println(_16);
        //17
        List<String> _17 = getCities().map((City c) -> {
            return c.getAdmin();
        }).collect(Collectors.toList());
        System.out.println(_17);


    }

    private static Stream<City> getCities() {
        try {
            return Files.readAllLines(Paths.get("Directory/worldcities.csv"))
                    .stream()
                    .skip(1)
                    .map((String line) -> {
                        return line.split("\",\"");//dzielimy po ","
                    })
                    .map((String[] line) -> {

                        //usuwamy znak " z początku i końca lini
                        String[] newData = new String[line.length];
                        for (int i = 0; i < line.length; i++) {
                            newData[i] = line[i].replaceAll("\"", "");
                        }
                        return newData;
                    })
                    .map((String[] data) -> {
                        String name = data[0];
                        String nameAscii = data[1];
                        double lat = Double.parseDouble(data[2]);
                        double log = Double.parseDouble(data[3]);
                        String country = data[4];
                        String adminName = data[7];
                        String capitol = data[8];
                        long population;
                        try {
                            population = Long.parseLong(data[9]);
                        } catch (NumberFormatException e) {
                            population = Integer.MIN_VALUE;
                        }
                        int id = Integer.parseInt(data[10]);
                        return new City(id, name, nameAscii, lat, log, country, capitol, population, adminName);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stream.empty();
    }
}

class City {
    private final int id;
    private final String name;
    private final String nameAscii;
    private final double lat;
    private final double log;
    private final String country;
    private final String capitol;
    private final long population;
    private final String admin;

    public City(int id, String name, String nameAscii, double lat, double log, String country, String capitol, long population, String admin) {
        this.id = id;
        this.name = name;
        this.nameAscii = nameAscii;
        this.lat = lat;
        this.log = log;
        this.country = country;
        this.capitol = capitol;
        this.population = population;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameAscii() {
        return nameAscii;
    }

    public double getLat() {
        return lat;
    }

    public double getLog() {
        return log;
    }

    public String getCountry() {
        return country;
    }

    public String getCapitol() {
        return capitol;
    }

    public long getPopulation() {
        return population;
    }

    public String getAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameAscii='" + nameAscii + '\'' +
                ", lat=" + lat +
                ", log=" + log +
                ", country='" + country + '\'' +
                ", capitol='" + capitol + '\'' +
                ", population=" + population +
                ", admin='" + admin + '\'' +
                '}';
    }

    class Coordiates {
        private final double lat;
        private final double log;

        public Coordiates(double lat, double log) {
            this.lat = lat;
            this.log = log;

        }

    }
}

class Coordinates {
    private double lat;
    private double log;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLog() {
        return log;
    }

    public void setLog(double log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "lat=" + lat +
                ", log=" + log +
                '}';
    }

    public Coordinates(double lat, double log) {
        this.lat = lat;
        this.log = log;

    }
}
class Pair {
    private String country;
    private int numberOfCities;
}