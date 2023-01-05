package com.etiya.crmlite.entities.concretes;
//Siparis bilgilerinin tutuldugu tablodur.
import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUST_ORD")
@Data
public class CustomerOrder  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "customerOrderSeq", sequenceName = "CUST_ORD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerOrderSeq")
    @Column(name = "CUST_ORD_ID")
    private Long customerOrderId;  //
    @Column(name = "CUST_ID")
    private Long customerId;  //
    @Column(name = "BSN_INTER_SPEC_ID")
    private Long bussinesInterSpecId ;
    @Column(name = "BSN_INTER_ID")
    private Long bussinesInterId ;
    @Column(name = "ORD_ST_ID")
    private Long orderStId;


    @OneToMany(mappedBy = "customerOrder")
    List<CustomerOrderCharacteristicValue> customerOrderCharacteristicValues;

    @OneToMany(mappedBy = "customerOrder")
    List<CustomerOrderItem> customerOrderItems;

}
