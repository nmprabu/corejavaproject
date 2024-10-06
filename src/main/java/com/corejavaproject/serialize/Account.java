package com.corejavaproject.serialize;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Account implements Serializable {

    private static final long serialVersionUID = 63436273838L;

    public static final String AccountBank = "SBI";

    String AccountName;
    Integer AccountID;
    public transient String AccountAddress;
}
