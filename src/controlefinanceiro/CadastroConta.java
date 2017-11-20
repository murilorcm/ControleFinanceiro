/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlefinanceiro;

/**
 *
 * @author murilorcm
 */
public class CadastroConta {
    protected String descricao, data;
    protected double valor;
    protected int codigo;

    public CadastroConta(String descricao, String data, double valor, int codigo) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
