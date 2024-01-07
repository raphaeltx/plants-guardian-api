package com.rt.plantguardianapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidDomainException extends RuntimeException {

  private static final long serialVersionUID = -8900306124303367936L;

  public InvalidDomainException(String ex){
    super(ex);
  }
}
