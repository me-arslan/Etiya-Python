package com.etiya.crmlite.entities.concretes;
//Karakteristiklerin degerlerinin tutuldugu tablodur.
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
@Table(name = "GNL_CHAR_VAL")
public class GeneralCharacteristicValue  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "generalCharacteristicValueSeq", sequenceName = "GNL_CHAR_VAL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generalCharacteristicValueSeq")
    @Column(name = "CHAR_VAL_ID")
    private Long generalCharacteristicValueId;
    @Column(name = "CHAR_ID")
    private Long charId;
    @Column(name = "IS_DFLT")
    private Long ısDefault;
    @Column(name = "VAL")
    private String value;
    @Column(name = "SHRT_CODE")
    private String shortCode;
    @Column(name = "IS_ACTV")
    private Long ısActv;
    @OneToMany(mappedBy = "generalCharacteristicValue")
    List<ProductCharacteristicValue> productCharacteristicValues;

}
