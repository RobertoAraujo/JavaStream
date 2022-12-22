package br.com.mentorama.constantes;

public enum Turno {
    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite");

    private String descricao;

    Turno(String descricao) {
        this.descricao = descricao;
    }

}
