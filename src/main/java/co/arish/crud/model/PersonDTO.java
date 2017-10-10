package co.arish.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class PersonDTO {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

}
