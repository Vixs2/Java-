package Builder;

public class BuilderDirector {

    private BuilderCasa builder;

    public BuilderDirector(BuilderCasa builder){
        this.builder = builder;
    }

    public void cambiarBuilder(BuilderCasa builder){
        this.builder = builder;
    }

    //Casa de 2 pisos, con garaje (sin piscina, con jardin).
    public void construirCasaDosPisosMaterial(){
        builder.reiniciar();
        builder.construirEstructura("Ladrillo");
        builder.construirPisos(2);
        builder.construirPiscina(false);
        builder.construirJardin(true);
        builder.construirGaraje(true);
        builder.agregarExtras("Balcon");
    }

    public void construirCasaConPiscina(){
        builder.reiniciar();
        builder.construirEstructura("Ladrillo");
        builder.construirPisos(4);
        builder.construirPiscina(true);
        builder.construirJardin(false);
        builder.construirGaraje(false);
        builder.agregarExtras("Parrilla cerca de la piscina");
    }

    public void construirCasaMaderaSimple(){
        builder.reiniciar();;
        builder.construirEstructura("Madera");
        builder.construirPisos(2);
        builder.construirPiscina(false);
        builder.construirJardin(false);
        builder.construirGaraje(false);
    }
}
