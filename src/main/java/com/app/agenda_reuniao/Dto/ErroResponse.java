package com.app.agenda_reuniao.Dto;

import java.time.LocalDateTime;

public class ErroResponse {
	
	private LocalDateTime dataHora;
    private Integer status;
    private String mensagem;

    public ErroResponse(
            LocalDateTime dataHora,
            Integer status,
            String mensagem) {

        this.dataHora = dataHora;
        this.status = status;
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMensagem() {
        return mensagem;
    }

}
