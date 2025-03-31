package com.example.managerapp;
import java.util.ArrayList;
import java.util.List;
public class Data {

    public static List<Joukkue> luoEsimerkkijoukkueet() {
        List<Joukkue> joukkueet = new ArrayList<>();
        joukkueet.add(new Joukkue("FC Barcelona", "Espanja", "La Liga", "Camp Nou", 1899));
        joukkueet.add(new Joukkue("Manchester United", "Englanti", "Premier League", "Old Trafford", 1878));
        joukkueet.add(new Joukkue("Bayern Munich", "Saksa", "Bundesliga", "Allianz Arena", 1900));
        joukkueet.add(new Joukkue("Juventus", "Italia", "Serie A", "Allianz Stadium", 1897));
        joukkueet.add(new Joukkue("Paris Saint-Germain", "Ranska", "Ligue 1", "Parc des Princes", 1970));
        joukkueet.add(new Joukkue("Ajax Amsterdam", "Alankomaat", "Eredivisie", "Johan Cruyff Arena", 1900));
        joukkueet.add(new Joukkue("River Plate", "Argentiina", "Primera División", "El Monumental", 1901));
        joukkueet.add(new Joukkue("Flamengo", "Brasilia", "Brasileirão", "Maracanã", 1895));
        return joukkueet;
    }

    public static List<Pelaaja> luoEsimerkkipelaajat() {
        List<Pelaaja> pelaajat = new ArrayList<>();
        pelaajat.add(new Pelaaja("Lionel Messi", 34, "Argentiina", "Hyökkääjä", "FC Barcelona", 10));
        pelaajat.add(new Pelaaja("Cristiano Ronaldo", 36, "Portugali", "Hyökkääjä", "Juventus", 7));
        pelaajat.add(new Pelaaja("Robert Lewandowski", 32, "Puola", "Hyökkääjä", "Bayern Munich", 9));
        pelaajat.add(new Pelaaja("Kevin De Bruyne", 29, "Belgia", "Keskikenttä", "Manchester City", 17));
        pelaajat.add(new Pelaaja("Virgil van Dijk", 30, "Alankomaat", "Puolustaja", "Liverpool", 4));
        pelaajat.add(new Pelaaja("Manuel Neuer", 35, "Saksa", "Maalivahti", "Bayern Munich", 1));
        pelaajat.add(new Pelaaja("Kylian Mbappé", 22, "Ranska", "Hyökkääjä", "Paris Saint-Germain", 7));
        pelaajat.add(new Pelaaja("Erling Haaland", 20, "Norja", "Hyökkääjä", "Borussia Dortmund", 9));
        pelaajat.add(new Pelaaja("Bruno Fernandes", 26, "Portugali", "Keskikenttä", "Manchester United", 18));
        pelaajat.add(new Pelaaja("Joshua Kimmich", 26, "Saksa", "Keskikenttä", "Bayern Munich", 6));
        pelaajat.add(new Pelaaja("Jan Oblak", 28, "Slovenia", "Maalivahti", "Atletico Madrid", 13));
        pelaajat.add(new Pelaaja("Neymar Jr.", 29, "Brasilia", "Hyökkääjä", "Paris Saint-Germain", 10));
        return pelaajat;
    }

    public static List<Ottelu> luoEsimerkkimottelut() {
        List<Ottelu> ottelut = new ArrayList<>();
        ottelut.add(new Ottelu("FC Barcelona", "Real Madrid", "2-1", "La Liga", "2023-04-10", "Camp Nou"));
        ottelut.add(new Ottelu("Manchester United", "Liverpool", "0-3", "Premier League", "2023-03-15", "Old Trafford"));
        ottelut.add(new Ottelu("Bayern Munich", "Borussia Dortmund", "4-2", "Bundesliga", "2023-04-01", "Allianz Arena"));
        ottelut.add(new Ottelu("Juventus", "AC Milan", "1-1", "Serie A", "2023-03-20", "Allianz Stadium"));
        ottelut.add(new Ottelu("Paris Saint-Germain", "Lyon", "3-0", "Ligue 1", "2023-04-05", "Parc des Princes"));
        ottelut.add(new Ottelu("FC Barcelona", "Bayern Munich", "0-3", "Champions League", "2023-02-28", "Camp Nou"));
        ottelut.add(new Ottelu("Manchester City", "Paris Saint-Germain", "2-1", "Champions League", "2023-03-08", "Etihad Stadium"));
        ottelut.add(new Ottelu("Liverpool", "Ajax Amsterdam", "1-0", "Champions League", "2023-03-01", "Anfield"));
        return ottelut;
    }
}
