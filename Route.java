package com.smk.bi.ticketing.model;

import com.sun.javafx.beans.IDProperty;

public class Route {
// Nama : Afsyal Suwandi;
// NIS  : 16101059
}
@Entity
@Table (name ="Route")
public class Route{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;
    private String routeName;
    private String isValid
}