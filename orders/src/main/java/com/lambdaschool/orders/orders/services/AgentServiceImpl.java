package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentService")
public class AgentServiceImpl implements AgentService{
    @Autowired
    AgentsRepository agentrepos;

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }

    @Override
    public Agent findAgentById(long id) {
        Agent rtnAgent = agentrepos.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Agent "+id+" Not Found"));
        return rtnAgent;
    }
}
