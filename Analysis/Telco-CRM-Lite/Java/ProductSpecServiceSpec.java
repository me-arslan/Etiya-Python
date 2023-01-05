package com.etiya.crmlite.entities.concretes;
//Ürün tanimlari ile servis tanimlari arasindaki iliskinin tutuldugu tablodur.
//Ürün tanimi bir servisden olusabilir.
import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PROD_SPEC_SRVC_SPEC")
public class ProductSpecServiceSpec extends BaseEntity {
    @Id
    @SequenceGenerator(name = "productSpecServiceSpecSeq", sequenceName = "PROD_SPEC_SRVC_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSpecServiceSpecSeq")
    @Column(name = "PROD_SPEC_SRVC_SPEC_ID")
    private Long productSpecServiceSpecId;

    @Column(name = "REL_TP_ID")
    private Long relationTypeId;

    @Column(name = "SDATE")
    private Date sDate;

    @Column(name = "EDATE")
    private Date eDate;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID")
    private ProductSpecification productSpecification;

    @ManyToOne
    @JoinColumn(name = "SRVC_SPEC_ID")
    private ServiceSpecification serviceSpecification;
}
