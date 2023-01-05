package com.etiya.crmlite.entities.concretes;


import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GNL_ST")
public class GeneralStatus  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "generalStatusSeq", sequenceName = "GNL_ST_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generalStatusSeq")
    @Column(name = "GNL_ST_ID")
    private Long generalStatusId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "ENT_CODE_NAME")
    private String entCodeName;
    @Column(name = "SHRT_CODE")
    private String shortCode;
    @Column(name = "IS_ACTV")
    private Long ısActv;
    @Column(name = "ENT_NAME")
    private String entName;

}
