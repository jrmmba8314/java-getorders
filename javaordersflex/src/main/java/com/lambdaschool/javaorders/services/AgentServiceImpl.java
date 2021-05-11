package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentService{

    @Autowired
    AgentsRepository agentsRepository;

    @Override
    public Agent findAgentById(long agentcode) {
        Agent newAgent = agentsRepository.findById(agentcode)
                .orElseThrow(() -> new EntityNotFoundException("Agent " + agentcode + " not found"));

    return newAgent;
    }
}
