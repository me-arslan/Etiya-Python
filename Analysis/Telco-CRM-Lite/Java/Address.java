package com.etiya.crmlite.entities.concretes;
// Adres bilgisinin tutuldugu tablodur
import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ADDR")
public class Address  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "addressSeq", sequenceName = "ADDR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressSeq")
    @Column(name = "ADDR_ID")
    private Long addressId;

    @Column(name = "ROW_ID")
    private Long rowId;
    @Column(name = "DATA_TP_ID")
    private Long dataTpId;
    @Column(name = "STRT_ID")
    private Long streetId;
    @Column(name = "BLDG_ID")
    private Long buildingId;
    @Column(name = "ADDR_DESC")
    private String AddressDesc;
    @Column(name = "IS_ACTV")
    private Long ısActv;


}
