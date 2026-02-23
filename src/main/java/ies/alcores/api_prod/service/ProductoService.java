package ies.alcores.api_prod.service;

import ies.alcores.api_prod.model.Producto;
import ies.alcores.api_prod.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    //Pruebas
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll(){
        return this.productoRepository.findAll();
    }

    public List<Producto> findByCategoria(final String categoria){
        List<Producto> result = new ArrayList<>();
        List<Producto> totales = this.findAll();

        for (Producto p : totales){
            if(p.getCategoria().getNombre().equals(categoria)){
                result.add(p);
            }
        }

        return result;
    }
}