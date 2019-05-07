package com.erkmen.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erkmen.demo.domain.AbstractBaseEntity;

public interface BaseRepository<T extends AbstractBaseEntity> extends JpaRepository<T, Integer> {

}
