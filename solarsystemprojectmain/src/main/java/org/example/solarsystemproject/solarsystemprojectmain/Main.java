package org.example.solarsystemproject.solarsystemprojectmain;

import org.example.solarsystemproject.solarsystemprojectdata.data.Earth;
import org.example.solarsystemproject.solarsystemprojectdata.service.PlanetReporter;

public class Main {
    public static void main(String[] args) {
        PlanetReporter planetReporter = new PlanetReporter(new Earth());
        planetReporter.showInfoAboutAcceleration();
    }
}