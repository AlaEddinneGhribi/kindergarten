package tn.esprit.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table( name= "CHILDRENGARDEN")
public class childrengarden extends User{

	public childrengarden(int id, String email, String password, int phone) {
		super(id, email, password, phone);
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String description;
	private String nom;
	
	@Temporal(TemporalType.DATE)
	private Date Creation_Date;
	
	private String location;
	private String photo;
	private int phone_number;
	private int price ;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getCreation_Date() {
		return Creation_Date;
	}
	public void setCreation_Date(Date creation_Date) {
		Creation_Date = creation_Date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "childrengarden [description=" + description + ", nom=" + nom + ", Creation_Date=" + Creation_Date
				+ ", location=" + location + ", photo=" + photo + ", phone_number=" + phone_number + ", price=" + price
				+ "]";
	}
	
	@OneToMany(mappedBy = "childrengarden",cascade = CascadeType.ALL)
    private Set<Reclamation> reclamations;
	
	
	@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Activity> activities;
	
	@OneToMany(mappedBy = "childrengarden",cascade = CascadeType.ALL)
    private Set<Rdv> Rdvs;
	
	@OneToMany(mappedBy = "childrengarden",cascade = CascadeType.ALL)
    private Set<Feedback> Feedbacks;
	
	@OneToMany(mappedBy = "childrengarden",cascade = CascadeType.ALL)
    private Set<Events> events;
	
	
	
}
