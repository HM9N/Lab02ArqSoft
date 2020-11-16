package com.udea.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-08T14:29:02")
@StaticMetamodel(Transactions.class)
public class Transactions_ { 

    public static volatile SingularAttribute<Transactions, String> txCardNumber;
    public static volatile SingularAttribute<Transactions, String> txQrCode;
    public static volatile SingularAttribute<Transactions, String> txUserEmail;
    public static volatile SingularAttribute<Transactions, String> txCardType;
    public static volatile SingularAttribute<Transactions, String> txCardCvc;
    public static volatile SingularAttribute<Transactions, Integer> txId;
    public static volatile SingularAttribute<Transactions, String> txUserName;
    public static volatile SingularAttribute<Transactions, String> txCardExpiration;
    public static volatile SingularAttribute<Transactions, Integer> txValue;

}