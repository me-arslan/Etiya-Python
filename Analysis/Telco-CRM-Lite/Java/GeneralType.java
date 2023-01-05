package com.etiya.crmlite.entities.concretes;
//Genel tip bilgilerinin tutuldugu tablodur.
import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "GNL_TP")
public class GeneralType  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "generalTypeSeq", sequenceName = "GNL_TP_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generalTypeSeq")
    @Column(name = "GNL_TP_ID")
    private Long generalTypeId;

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
