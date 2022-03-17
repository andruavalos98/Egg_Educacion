/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static java.lang.Math.PI;

/**
 *
 * @author andru
 */
public class calculos implements calculosFormas {

    @Override
    public double AreaCirculo(double radio) {
        return PI * radio * radio;
    }

    @Override
    public double PerimetroCirculo(double diametro) {
      return PI * diametro;
    }

    @Override
    public double AreaRectangulo(double base, double altura) {
        return base * altura;
    }

    @Override
    public double PerimetroRectangulo(double base, double altura) {
       return (base + altura) * 2;
    }
}
