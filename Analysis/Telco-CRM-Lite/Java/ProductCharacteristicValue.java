package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name= "PROD_CHAR_VAL")
public class ProductCharacteristicValue extends BaseEntity {
    @Id
    @SequenceGenerator(name = "prodCharValSeq", sequenceName = "PROD_CHAR_VAL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodCharValSeq")
    @Column(name = "PROD_CHAR_VAL_ID")
    private Long prodCharValId;  //

    @Column(name = "VAL")
    private String value;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name = "CHAR_ID")
    private GeneralCharacter generalCharacter;

    @ManyToOne
    @JoinColumn(name = "PROD_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "CHAR_VAL_ID")
    private GeneralCharacteristicValue generalCharacteristicValue;










}
