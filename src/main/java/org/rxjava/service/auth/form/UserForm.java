package org.rxjava.service.auth.form;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class UserForm {
    @NotNull
    private String name;
}
