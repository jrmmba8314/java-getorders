package com.lambdaschool.repositories;

import com.lambdaschool.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent,Long> {
}
