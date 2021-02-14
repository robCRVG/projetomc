package com.levelapps.projetomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.levelapps.projetomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoBoleto() {

	}

	public PagamentoBoleto(Integer id, EstadoPagamento estadoPagemento, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estadoPagemento, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
