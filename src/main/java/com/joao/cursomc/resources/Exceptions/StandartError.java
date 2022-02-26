package com.joao.cursomc.resources.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.authenticator.SavedRequest;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class StandartError implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer status;
    private String msg;
    private long timeStamp;
}
