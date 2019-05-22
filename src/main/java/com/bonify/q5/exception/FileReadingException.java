package com.bonify.q5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class FileReadingException  extends RuntimeException{

	
	public FileReadingException(String msg)
	{
		super(msg);
	}
	
}
