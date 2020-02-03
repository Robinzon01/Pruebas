package com.cdsi.pven.app.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.pven.app.model.Articulo;
import com.cdsi.pven.app.repository.IArticuloRepository;
import com.cdsi.pven.app.service.IArticuloService;

@Service
public class ArticuloServiceImpl implements IArticuloService {
	
	@Autowired
	private IArticuloRepository artiRepo;

	@Override
	public List<Articulo> getAllArticulos() {
		List<Articulo> objAs = new ArrayList<Articulo>();
		artiRepo.findAll().iterator().forEachRemaining(objAs::add);
		return objAs;
	}

	@Override
	public Articulo createArticulo(Articulo articulo) {
		return artiRepo.save(articulo);
	}

	@Override
	public Articulo updateArticulo(String id, Articulo articulo) {
		// TODO Auto-generated method stub
		Articulo objA = artiRepo.findById(id);
		objA.setCia(articulo.getCia());
		objA.setTipoArti(articulo.getTipoArti());
		objA.setClase(articulo.getClase());
		objA.setCategoria(articulo.getCategoria());
		objA.setFamilia(articulo.getFamilia());
		objA.setArtiProve(articulo.getArtiProve());
		objA.setDescripcion(articulo.getDescripcion());
		objA.setArtiNacional(articulo.getArtiNacional());
		objA.setIndLote(articulo.getIndLote());
		objA.setMedida(articulo.getMedida());
		objA.setMarca(articulo.getMarca());
		objA.setVigente(articulo.getVigente());
		objA.setOrigen(articulo.getOrigen());
		objA.setCodClasif(articulo.getCodClasif());
		objA.setCodTipArt(articulo.getCodTipArt());
		objA.setColeccion(articulo.getColeccion());
		objA.setConceptoCta(articulo.getConceptoCta());
		objA.setIndCodBarra(articulo.getIndCodBarra());
		objA.setImpVen(articulo.getImpVen());
		objA.setTipoAfectacion(articulo.getTipoAfectacion());
		
		return objA;
	}

	@Override
	public void deleteArticulo(String id) {
		// TODO Auto-generated method stub
		artiRepo.delete(artiRepo.findById(id));
	}


	@Override
	public Page<Articulo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return artiRepo.findAll(pageable);
	}

}
