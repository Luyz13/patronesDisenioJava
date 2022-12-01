package org.levm;

public class ComandoPotencia extends ComandoCalculadora implements Comando {
    public ComandoPotencia(float acumulador, float valor) {
        super(acumulador, valor);
    }

    public float ejecutar() {
        return (float)Math.pow(
                (double)acumulador,(double)valor);
    }
}

