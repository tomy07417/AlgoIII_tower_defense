package edu.fiuba.algo3.modelo.parcelas;

import edu.fiuba.algo3.modelo.miscelanea.Coordenada;
import edu.fiuba.algo3.modelo.Enemigos.Enemigo;

public class PasarelaIntermedia extends Pasarela {

    public PasarelaIntermedia(Coordenada coordenada, Pasarela pasarelaSiguiente) {
        super(coordenada, pasarelaSiguiente);
    }

    public void recibir(Enemigo nuevoEnemigo){
        nuevoEnemigo.actualizarPosicionActual(this);
        this.enemigos.add(nuevoEnemigo);
    }

    public Pasarela verSiguiente() { return siguientePasarela; }

    public Pasarela verSiguiente(int cantidadPasos) {
        Pasarela pasarelaAux = this;

        if(cantidadPasos >= 0) { // Este caso no deberia pasar
            for(int i = 0; i < cantidadPasos; i++) {
                pasarelaAux = pasarelaAux.verSiguiente();
            }
        }

        return pasarelaAux;
    }

}
