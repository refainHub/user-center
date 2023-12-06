package cn.sfcoder.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -4423218586312804892L;
    private String userAccount;
    private String userPassword;

}
