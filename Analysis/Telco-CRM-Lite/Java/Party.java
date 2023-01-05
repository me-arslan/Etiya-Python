package com.etiya.crmlite.entities.concretes;




import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PARTY")
public class Party  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "partySeq",sequenceName ="PARTY_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partySeq")
    @Column(name = "PARTY_ID")
    private Long partyId;  //

    @Column(name = "PARTY_TP_ID")
    private Long partyTpId;

    @Column(name = "ST_ID")
    private Long stId;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "party")
    private Individual individual;

    @OneToMany(mappedBy = "party")
    private List<PartyRole> partyRoles;





}



//    @Column(name = "CDATE")
//    private Date cDate;
//    @Column(name = "CUSER")
//    private Long cUser;
//    @Column(name = "UDATE")
//    private Date uDate;
//    @Column(name = "UUSER")
//    private Long uUser;

















