package com.company;

import java.util.Objects;

public class Usuario {
    private String nickname, password, email;

    public Usuario(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public boolean validarSenha(String senha){
        return senha.equals(password);
    }

    public String getNickname(){
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nickname, usuario.nickname) &&
                Objects.equals(password, usuario.password) &&
                Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, password, email);
    }
}
