package com.teste.multi.api.exceptionhandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.OffsetDateTime;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static java.time.OffsetDateTime.now;

@JsonInclude(NON_NULL)
@Getter
@Builder
public class Problem {

	private Integer status;
	
	private OffsetDateTime timestamp;
	
	private String type;
	
	private String title;

	private String detail;

	private List<Object> objects;
	
	@Getter
	@Builder
	public static class Object {
		
		private String name;
		private String message;

	}

	public static ProblemBuilder createProblemBuilder(HttpStatus status,
                                                      ProblemType problemType, String detail) {
		return Problem.builder()
				.timestamp(now())
				.status(status.value())
				.type(problemType.getUri())
				.title(problemType.getTitle())
				.detail(detail);
	}
	
}
