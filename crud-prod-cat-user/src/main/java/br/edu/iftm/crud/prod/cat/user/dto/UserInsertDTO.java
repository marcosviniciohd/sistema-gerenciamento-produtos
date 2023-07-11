package br.edu.iftm.crud.prod.cat.user.dto;

import br.edu.iftm.crud.prod.cat.user.services.exceptions.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
    private String password;

    public UserInsertDTO() {
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
