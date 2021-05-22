package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // add lombok
@Entity // add as IEntity
@Table(name = "products") // name of table from db
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id // indicate id column
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto inc
	// @Column : indicate column and its names
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
}
