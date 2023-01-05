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
@Table(name = "CUST_ORD_CHAR_VAL")
public class CustomerOrderCharacteristicValue  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "customerOrderCharacteristicValueSeq", sequenceName = "CUST_ORD_CHAR_VALSEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerOrderCharacteristicValueSeq")
    @Column(name = "CUST_ORD_CHAR_VAL_ID")
    private Long customerOrderCharacteristicValueId;
    @Column(name = "CHAR_ID")
    private Long characterId ;
    @Column(name = "CHAR_VAL_ID")
    private Long characterValueId ;
    @Column(name = "IS_ACTV")
    private Long ısActive ;



    @ManyToOne
    @JoinColumn(name = "CUST_ORD_ID")
    private CustomerOrder customerOrder;
}
