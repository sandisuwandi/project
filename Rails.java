package com.smk.bi.ticketing.model;

public class Rails {
// Nama : Afsyal Suwandi;
// NIS  : 16101059
}
@Entity
@Table (name ="Rails")
public class Rails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITIY)
    private Long railsId;
    private String railsName;
    private Long capacity;
}