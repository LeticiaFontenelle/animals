
package com.mycompany.animals;
/**
 *
 * @lf
 */
public abstract class Animal {
    //atributos de animal
    protected float peso;
    protected float idade;
    protected float membros;
    //métodos de animal 
    public abstract void locomover (); 
    public abstract void alimentar (); 
    public abstract void emitirSom (); 

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getMembros() {
        return membros;
    }

    public void setMembros(float membros) {
        this.membros = membros;
    }  
    
}
