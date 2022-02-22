package com.teste.multi.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

	INTEGRATION_ERROR("/erro-de-integração", "Erro de integração"),
	INCOMPREENSIBLE_MESSAGE("/mensagem-incompreensivel", "Mensagem incompreensível"),
	NOT_FOUD("/nao-encontrado", "Dados informados, não encontrados"),
	DONE("/avaliacao-ja-realizada", "Dados inválidos"),
	INVALID_DATA("/dados-invalidos", "Dados inválidos");

	private String title;
	private String uri;
	
	ProblemType(String path, String title) {
		this.uri = path;
		this.title = title;
	}
	
}
