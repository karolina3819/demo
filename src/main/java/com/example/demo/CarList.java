package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarList {

    private List<Car> ListaAut;

    public CarList() {
        this.ListaAut = new ArrayList<>();
    }

    public void dodawanieAuta(Car a) {
        ListaAut.add(a);

    }

    public int iloscAut() {

        return ListaAut.size();
    }

}

