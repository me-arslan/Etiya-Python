package com.etiya.crmlite.entities.concretes;
//Sistemdeki tüm karakteristik degerlerin tutuldugu tablodur.

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "GNL_CHAR")
public class GeneralCharacter  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "GeneralCharSeq", sequenceName = "GNL_CHAR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GeneralCharSeq")
    @Column(name = "CHAR_ID")
    private Long generalCharId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "PRVDR_CLS")
    private String prvdrCls;//********************************
    @Column(name = "SHRT_CODE")
    private String shortCode;
    @Column(name = "IS_ACTV")
    private Long ısActive;



    @OneToMany(mappedBy = "generalCharacter")
    private List<ProductCharacteristicValue> productCharacteristicValues;

    @OneToMany(mappedBy = "generalCharacter")
    private List<ProductSpecCharUse>  productSpecCharUses;



}
