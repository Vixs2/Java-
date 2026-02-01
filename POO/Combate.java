package POO;

public class Combate{
    

    public void formulaAtaqueNormal(Personaje atacante, Personaje objetivo){
        int danio = atacante.getFuerza();

        int vidaActual = objetivo.getCantidadVida();

        int danioFinal = danio -objetivo.getDefensa();

        int nuevaVida = vidaActual - danioFinal;

        objetivo.setCantidadVida(nuevaVida);
    }

    public void formulaAtaqueMedio(Personaje atacante, Personaje objetivo){
        int danio = atacante.getFuerza() * 2;

        int vidaActual = objetivo.getCantidadVida();

        int danioFinal = danio - objetivo.getDefensa();

        int nuevaVida = vidaActual - danioFinal;

       objetivo.setCantidadVida(nuevaVida);
    }

    public void formulaAtaquePesado(Personaje atacante, Personaje objetivo){
        //1. Llamar la fuerza usando el getter de Personaje.
        int danioBase = atacante.getFuerza() * 3;

        //2. Obtener la vida del objetivo
        int vidaActual = objetivo.getCantidadVida();

        //3. Calculamos el danio final teniendo en cuenta la defensa.
        int danioFinal = danioBase - objetivo.getDefensa();

        //4. Calculamos la nueva vida del objetivo.
        int nuevaVida = vidaActual - danioFinal;

        //5. Atualizamos la nueva vida del objetivo (llamando al setter del padre).
        objetivo.setCantidadVida(nuevaVida);
    }

    public void ataqueMortal(Personaje atacante, Personaje objetivo){
        //1. Calcular el danio
        int danioMortal = atacante.getFuerza() * 4;

        //2. El golpe mortal baja bastante vida
        int vidaActual = objetivo.getCantidadVida();

        // 3. Aplicar el daño al objetivo
        // Nota: El daño real también debe considerar la DEFENSA del objetivo.
        int danioFinal = danioMortal - objetivo.getDefensa();

        //Asegurar que la vida quede en el minimo de -1.
        if(danioFinal < 1){
            danioFinal = 1;
        }

        int nuevaVida = vidaActual - danioFinal;

        //Evitar vida negativa.
        if(nuevaVida < 0){
            nuevaVida = 0;
        }

        objetivo.setCantidadVida(nuevaVida);
    }
}
