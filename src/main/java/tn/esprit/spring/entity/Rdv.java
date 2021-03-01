package tn.esprit.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table( name= "RDV")
public class Rdv {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Temporal(TemporalType.DATE)
	private Date Debut_rdv;
	
	@Temporal(TemporalType.DATE)
	private Date Fin_rdv;
	
	
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Parents> parents;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private childrengarden childrengardens;
    
    
	
}
