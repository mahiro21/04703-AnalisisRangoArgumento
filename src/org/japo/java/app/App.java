/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    //Random
    private static final Random RND = new Random();

    //Random range
    public static final int MAX = 10;
    public static final int MIN = 0;

    //Datos
    public static final int NUM;

    static {
        NUM = RND.nextInt(20 - (-10) + 1) + (-10);

    }

    public final void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        System.out.printf("Número ......: %d%n", NUM);
        System.out.println("---");
        System.out.println("Mínimo ......: " + MIN);
        System.out.println("Máximo ......: " + MAX);
        System.out.println("---");
        int informar = analizarRango(NUM, MAX, MIN);
        System.out.print("Análisis ....: ");
        switch (informar) {
            case 0:
                System.out.printf("DENTRO%n");
                break;
            case 1:
                System.out.println("FUERA ( Abajo )");
                break;
            case 2:
                System.out.println("FUERA ( Arriba )");
                break;
        }
    }

    public static final int analizarRango(int num, int max, int min) {
        int result = 0;

        if (num >= min && num <= max) {
            result = 0;
        } else if (num <= min && num != min) {
            result = 1;
        } else if (num >= max && num != max) {
            result = 2;
        }
        return result;

    }

}
