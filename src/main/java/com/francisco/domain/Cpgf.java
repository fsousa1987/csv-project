package com.francisco.domain;

import com.opencsv.bean.CsvBindByPosition;

public class Cpgf {

    @CsvBindByPosition(position = 0)
    private String codigoOrgaoSuperior;

    @CsvBindByPosition(position = 1)
    private String nomeOrgaoSuperior;

    @CsvBindByPosition(position = 2)
    private String codigoOrgao;

    @CsvBindByPosition(position = 3)
    private String nomeOrgao;

    @CsvBindByPosition(position = 4)
    private String codigoUnidadeGestora;

    @CsvBindByPosition(position = 5)
    private String nomeUnidadeGestora;

    @CsvBindByPosition(position = 6)
    private String anoExtrato;

    @CsvBindByPosition(position = 7)
    private String mesExtrato;

    @CsvBindByPosition(position = 8)
    private String cpfPortador;

    @CsvBindByPosition(position = 9)
    private String nomePortador;

    @CsvBindByPosition(position = 10)
    private String cnpjOuCpfFavorecido;

    @CsvBindByPosition(position = 11)
    private String nomeFavorecido;

    @CsvBindByPosition(position = 12)
    private String transacao;

    @CsvBindByPosition(position = 13)
    private String dataTransacao;

    @CsvBindByPosition(position = 14)
    private String valorTransacao;

    public Cpgf() {
    }

    public String getCodigoOrgaoSuperior() {
        return codigoOrgaoSuperior;
    }

    public void setCodigoOrgaoSuperior(String codigoOrgaoSuperior) {
        this.codigoOrgaoSuperior = codigoOrgaoSuperior;
    }

    public String getNomeOrgaoSuperior() {
        return nomeOrgaoSuperior;
    }

    public void setNomeOrgaoSuperior(String nomeOrgaoSuperior) {
        this.nomeOrgaoSuperior = nomeOrgaoSuperior;
    }

    public String getCodigoOrgao() {
        return codigoOrgao;
    }

    public void setCodigoOrgao(String codigoOrgao) {
        this.codigoOrgao = codigoOrgao;
    }

    public String getNomeOrgao() {
        return nomeOrgao;
    }

    public void setNomeOrgao(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }

    public String getCodigoUnidadeGestora() {
        return codigoUnidadeGestora;
    }

    public void setCodigoUnidadeGestora(String codigoUnidadeGestora) {
        this.codigoUnidadeGestora = codigoUnidadeGestora;
    }

    public String getNomeUnidadeGestora() {
        return nomeUnidadeGestora;
    }

    public void setNomeUnidadeGestora(String nomeUnidadeGestora) {
        this.nomeUnidadeGestora = nomeUnidadeGestora;
    }

    public String getAnoExtrato() {
        return anoExtrato;
    }

    public void setAnoExtrato(String anoExtrato) {
        this.anoExtrato = anoExtrato;
    }

    public String getMesExtrato() {
        return mesExtrato;
    }

    public void setMesExtrato(String mesExtrato) {
        this.mesExtrato = mesExtrato;
    }

    public String getCpfPortador() {
        return cpfPortador;
    }

    public void setCpfPortador(String cpfPortador) {
        this.cpfPortador = cpfPortador;
    }

    public String getNomePortador() {
        return nomePortador;
    }

    public void setNomePortador(String nomePortador) {
        this.nomePortador = nomePortador;
    }

    public String getCnpjOuCpfFavorecido() {
        return cnpjOuCpfFavorecido;
    }

    public void setCnpjOuCpfFavorecido(String cnpjOuCpfFavorecido) {
        this.cnpjOuCpfFavorecido = cnpjOuCpfFavorecido;
    }

    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    public String getTransacao() {
        return transacao;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(String valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    @Override
    public String toString() {
        return "com.francisco.entity.CPGF{" +
                "codigoOrgaoSuperior=" + codigoOrgaoSuperior +
                ", nomeOrgaoSuperior='" + nomeOrgaoSuperior + '\'' +
                ", codigoOrgao=" + codigoOrgao +
                ", nomeOrgao='" + nomeOrgao + '\'' +
                ", codigoUnidadeGestora=" + codigoUnidadeGestora +
                ", nomeUnidadeGestora='" + nomeUnidadeGestora + '\'' +
                ", anoExtrato=" + anoExtrato +
                ", mesExtrato=" + mesExtrato +
                ", cpfPortador='" + cpfPortador + '\'' +
                ", nomePortador='" + nomePortador + '\'' +
                ", cnpjOuCpfFavorecido='" + cnpjOuCpfFavorecido + '\'' +
                ", nomeFavorecido='" + nomeFavorecido + '\'' +
                ", transacao='" + transacao + '\'' +
                ", dataTransacao='" + dataTransacao + '\'' +
                ", valorTransacao=" + valorTransacao +
                '}';
    }
}
