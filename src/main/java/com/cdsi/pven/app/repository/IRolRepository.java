package com.cdsi.pven.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cdsi.pven.app.model.Role;

public interface IRolRepository extends PagingAndSortingRepository<Role, Long> {

}
