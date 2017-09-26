package com.smk.bi.ticketing.model;

import com.sun.javafx.beans.IDProperty;
import sun.jvm.hotspot.gc.shared.Generation;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama Afsyal Suwandi
// NIS 16101059
@Entity
@Table(name ="city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;
    private String cityName;
    private String isValid;

}
