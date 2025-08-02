package com.informatorio.info_market.dto.producto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
//import lombok.*;

import java.util.List;

@Schema(
        name = "Producto Create DTO",
        description = "DTO para alojar la informacion de un producto a crear o actualizar"
)
/*@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder*/
public class ProductoCreateDto {

    @Schema(description = "Nombre del producto", example = "Shampoo UltraCare")
    @NotBlank(message = "El nombre del producto no puede estar vacio")
    private String nombre;

    @Schema(description = "Descripcion del producto", example = "Hidratación profunda para cabello seco")
    @NotBlank(message = "La descripcion del producto no puede estar vacio")
    @Size(max = 50, message = "La despcion debe tener como maximo 50 caracteres")
    private String descripcion;
    
    @Schema(description = "Marca del producto", example = "Suprema")
    @NotBlank(message = "La marca del producto no puede estar vacio")
    @Size(max = 50, message = "La marca debe tener como maximo 50 caracteres")
    private String marca;

    @Schema(description = "Precio del producto", example = "35999.00")
    @Min(value = 0, message = "Se debe tener un precio minimo de 0")
    private double precio;

    @Schema(description = "Stock del producto", example = "15")
    @Min(value = 0, message = "Se debe tener un stock minimo de 0")
    private int stock;

    @Schema(description = "Lista de ids de las categorias")
    @NotEmpty(message = "Se debe tener como minimo una categoria para el producto")
    private List<Long> categorias;

	public ProductoCreateDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoCreateDto(
			@NotBlank(message = "El nombre del producto no puede estar vacio") String nombre,
			@NotBlank(message = "La descripcion del producto no puede estar vacio") 
			@Size(max = 50, message = "La despcion debe tener como maximo 50 caracteres") String descripcion,
			@NotBlank(message = "La marca del producto no puede estar vacio") 
			@Size(max = 50, message = "La marca debe tener como maximo 50 caracteres") String marca,
			@Min(value = 0, message = "Se debe tener un precio minimo de 0") double precio,
			@Min(value = 0, message = "Se debe tener un stock minimo de 0") int stock,
			@NotEmpty(message = "Se debe tener como minimo una categoria para el producto") List<Long> categorias) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.categorias = categorias;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public List<Long> getCategorias() {
		return categorias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setCategorias(List<Long> categorias) {
		this.categorias = categorias;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
    
    

}
