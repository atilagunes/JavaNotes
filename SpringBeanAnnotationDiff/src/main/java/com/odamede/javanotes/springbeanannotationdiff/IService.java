package com.odamede.javanotes.springbeanannotationdiff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/*
You can use a service marked interface as repository
But please dont do that.
if one sets repository scan path, this service won't fit that configuration.
// TODO : This topic needs more studies.
 */
@Service
public interface IService extends JpaRepository<StudentEntity,Integer> {

}
