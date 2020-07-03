package org.example.solarsystemproject.solarsystemprojectdata;

import org.example.solarsystemproject.solarsystemprojectdata.data.Earth;
import org.example.solarsystemproject.solarsystemprojectdata.data.Jupiter;
import org.example.solarsystemproject.solarsystemprojectdata.data.Planet;
import org.example.solarsystemproject.solarsystemprojectdata.service.PlanetReporter;
import org.junit.Assert;
import org.junit.Test;

public class PlanetsTest {

    PlanetReporter planetReporter = new PlanetReporter(new Jupiter());

    Planet planet = new Earth();

    @Test
    public void MethodShouldReturnFalse() {
        Assert.assertFalse(planet.accelerationCalculate() <= 0);
    }

    @Test
    public void MethodShouldReturnTrue() {
        Assert.assertTrue(planet.accelerationCalculate() > 0);
    }

    @Test
    public void instanceOfCheck() {
        Assert.assertFalse(planetReporter instanceof Planet);
    }

}
