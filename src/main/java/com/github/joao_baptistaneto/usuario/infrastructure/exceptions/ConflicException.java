package com.github.joao_baptistaneto.usuario.infrastructure.exceptions;

public class ConflicException extends RuntimeException{

    public ConflicException(String mensagem){
        super(mensagem);
    }

    public ConflicException(String mensagem, Throwable throwable){
        super(mensagem);
    }

}
