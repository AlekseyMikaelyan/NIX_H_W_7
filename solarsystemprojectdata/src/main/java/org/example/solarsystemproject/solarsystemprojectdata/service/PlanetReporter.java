package org.example.solarsystemproject.solarsystemprojectdata.service;

import org.example.solarsystemproject.solarsystemprojectdata.data.Planet;

public class PlanetReporter {
    private Planet planet;

    public PlanetReporter(Planet planet) {
        this.planet = planet;
    }

    public void showInfoAboutAcceleration() {
        System.out.println("Ускорение свободного падения на планете: " + planet.accelerationCalculate());
    }
}
