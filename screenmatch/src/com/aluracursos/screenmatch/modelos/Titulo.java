package com.aluracursos.screenmatch.modelos;

public class Titulo {


    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones = 0;
    private int totalDeLasEvaluaciones = 0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){

        System.out.println("El nombre es " + nombre);
        System.out.println("Y fue lanzada en " + fechaDeLanzamiento);
        System.out.println("La duracion en minutos es " + getDuracionEnMinutos());

    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones+= nota;
        totalDeLasEvaluaciones ++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
