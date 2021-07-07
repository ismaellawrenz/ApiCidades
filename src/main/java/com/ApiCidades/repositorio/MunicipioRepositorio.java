package com.ApiCidades.repositorio;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ApiCidades.models.Municipio;

@RepositoryRestResource(collectionResourceRel = "municipio", path = "municipio")
public interface MunicipioRepositorio extends PagingAndSortingRepository<Municipio, Long>{

}
