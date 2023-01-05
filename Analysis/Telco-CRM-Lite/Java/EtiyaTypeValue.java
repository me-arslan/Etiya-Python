package com.etiya.crmlite.entities.concretes;
//Row_ID/Data_TP_ID barindiran tablolarda Row_ID degerinin sistem icerisindeki hangi objeyi ifade ettigini tutan tablodur.

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ETIYA_TYPE_VALUE")
public class EtiyaTypeValue  {
    @Id
    @SequenceGenerator(name = "etiyaTypeValueSeq", sequenceName = "TYPE_VALUE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etiyaTypeValueSeq")
    @Column(name = "TYPE_VALUE_ID")
    private Long typeValueId;
    @Column(name = "TABLE_NAME")
    private String tableName ;
    @Column(name = "DESCRIPTION")
    private String description ;
    @Column(name = "VALUE")
    private String  value ;
    @Column(name = "USING_MODULE_NAME")
    private String usingModuleName ;


}
