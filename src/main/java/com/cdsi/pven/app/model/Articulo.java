package com.cdsi.pven.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARINDA1")
public class Articulo {
    
	@Column(name = "NO_CIA")
	private String cia;
	
	@Column(name = "TIPO_ARTI")
	private String tipoArti;
	
	private String clase;	
	private String categoria;	
	private String familia;
	
	@Id
	@Column(name = "NO_ARTI")
	private String id;
		
	@Column(name ="ARTI_PROVE")
	private String artiProve;
	
	private String descripcion;
	
	@Column(name ="ARTI_NACIONAL")
	private String artiNacional;
	
	@Column(name = "IND_LOTE")
	private String indLote;
	
	private String medida;
	private String marca;
	private String vigente;
	private String origen;
	
	@Column(name="COD_CLASIF")
	private String codClasif;
	
	@Column(name="COD_TIP_ART")
	private String codTipArt;
	
	private String coleccion;
	
	@Column(name="CONCEPTO_CTA")
	private String conceptoCta;
	
	@Column(name="IND_COD_BARRA")
	private String indCodBarra;
	
	@Column(name="IMP_VEN")
	private String impVen;
	
	
	@Column(name = "TIPO_AFECTACION")
	private String tipoAfectacion;

	public Articulo() {	
	}

	public Articulo(String cia, String tipoArti, String clase, String categoria, String familia, String id,
			String artiProve, String descripcion, String artiNacional, String indLote, String medida, String marca,
			String vigente, String origen, String codClasif, String codTipArt, String coleccion, String conceptoCta,
			String indCodBarra, String impVen, String tipoAfectacion) {
		
		this.cia = cia;
		this.tipoArti = tipoArti;
		this.clase = clase;
		this.categoria = categoria;
		this.familia = familia;
		this.id = id;
		this.artiProve = artiProve;
		this.descripcion = descripcion;
		this.artiNacional = artiNacional;
		this.indLote = indLote;
		this.medida = medida;
		this.marca = marca;
		this.vigente = vigente;
		this.origen = origen;
		this.codClasif = codClasif;
		this.codTipArt = codTipArt;
		this.coleccion = coleccion;
		this.conceptoCta = conceptoCta;
		this.indCodBarra = indCodBarra;
		this.impVen = impVen;
		this.tipoAfectacion = tipoAfectacion;
	}


	public String getCia() {
		return cia;
	}


	public void setCia(String cia) {
		this.cia = cia;
	}


	public String getTipoArti() {
		return tipoArti;
	}


	public void setTipoArti(String tipoArti) {
		this.tipoArti = tipoArti;
	}


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getFamilia() {
		return familia;
	}


	public void setFamilia(String familia) {
		this.familia = familia;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getArtiProve() {
		return artiProve;
	}


	public void setArtiProve(String artiProve) {
		this.artiProve = artiProve;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getArtiNacional() {
		return artiNacional;
	}


	public void setArtiNacional(String artiNacional) {
		this.artiNacional = artiNacional;
	}


	public String getIndLote() {
		return indLote;
	}


	public void setIndLote(String indLote) {
		this.indLote = indLote;
	}


	public String getMedida() {
		return medida;
	}


	public void setMedida(String medida) {
		this.medida = medida;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getVigente() {
		return vigente;
	}


	public void setVigente(String vigente) {
		this.vigente = vigente;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getCodClasif() {
		return codClasif;
	}


	public void setCodClasif(String codClasif) {
		this.codClasif = codClasif;
	}


	public String getCodTipArt() {
		return codTipArt;
	}


	public void setCodTipArt(String codTipArt) {
		this.codTipArt = codTipArt;
	}


	public String getColeccion() {
		return coleccion;
	}


	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}


	public String getConceptoCta() {
		return conceptoCta;
	}


	public void setConceptoCta(String conceptoCta) {
		this.conceptoCta = conceptoCta;
	}


	public String getIndCodBarra() {
		return indCodBarra;
	}


	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
	}


	public String getImpVen() {
		return impVen;
	}


	public void setImpVen(String impVen) {
		this.impVen = impVen;
	}


	public String getTipoAfectacion() {
		return tipoAfectacion;
	}


	public void setTipoAfectacion(String tipoAfectacion) {
		this.tipoAfectacion = tipoAfectacion;
	}
	
	
	
}
