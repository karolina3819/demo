package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @Autowired
    private CarList ListaAut;
@Value("${konfiguracja.nazwa}")
    public String nazwa;
    public int czas;
    public String miejsce;
    @Value("{konfiguracja.tablica}")
    public String
    @RequestMapping(
    value="/konfiguracja",
    method=RequestMethod.GET
            )

    public String konfiguracja() {
        return "Nazwa serwera to: " + nazwa + "\nczas serwera" + "\nmiejsce serwera"
    }

    @RequestMapping("/h")
    public String helloword() {
        return "hello word";
    }

    @RequestMapping("/ile")
    public int ileMamyAut() {
        return ListaAut.iloscAut();
    }

    @RequestMapping(
            value = "dodajAuto",
            method = RequestMethod.GET)
    public boolean dodajAuto(@RequestParam("n") String nazwa, @RequestParam("p") int predkosc) {
        try {
            ListaAut.dodawanieAuta(new Car("audi", 100));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

