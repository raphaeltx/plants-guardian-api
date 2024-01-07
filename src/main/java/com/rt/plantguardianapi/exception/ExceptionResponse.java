package com.rt.plantguardianapi.exception;

import java.io.Serializable;
import java.util.Date;

public record ExceptionResponse(Date timestamp, String message,
                                String details) implements Serializable {

  private static final long serialVersionUID = 4616995507610105270L;

}
