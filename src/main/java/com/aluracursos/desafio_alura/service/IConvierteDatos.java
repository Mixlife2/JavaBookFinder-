package com.aluracursos.desafio_alura.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}
