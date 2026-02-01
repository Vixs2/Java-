package POO;

public class Guerrero extends Personaje{
    

    //Metodos centrados en ataque, fuerza bruta y efecto de area.
    public void ataquePesado(Personaje objetivo){
        //1. Llamar la fuerza usando el getter de Personaje.
        int danioBase = this.getFuerza() * 2;

        //2. Obtener la vida del objetivo
        int vidaActual = objetivo.getCantidadVida();

        //3. Calculamos la nueva vida del objetivo.
        int nuevaVida = vidaActual - danioBase;

        //4. Atualizamos la nueva vida del objetivo (llamando al setter del padre).
        objetivo.setCantidadVida(nuevaVida);
    }

    public void golpeMortal(Personaje objetivo){
        //1. Calcular el danio
        int danioMortal = this.getFuerza()*3;

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

    public void gritoDeGuerra(){

    }
}
