package com.firstproject.aprendendo_spring.infrastructure.exceptions;

public class ConflictExceptions extends RuntimeException{

    public ConflictExceptions(String mensagem){
        super(mensagem);
    }

    public ConflictExceptions(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
